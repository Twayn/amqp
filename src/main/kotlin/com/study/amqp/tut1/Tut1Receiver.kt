package com.study.amqp.tut1

import com.study.amqp.persist.AmqpMessage
import com.study.amqp.persist.AmqpRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitHandler
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Autowired

@RabbitListener(queues = ["messageQueue"])
class Tut1Receiver {
    var logger: Logger = LoggerFactory.getLogger(Tut1Receiver::class.java)

    @Autowired
    private lateinit var messageStorage: AmqpRepository

    @RabbitHandler
    fun receive(message: String) {
        logger.info("Message received: $message")
        messageStorage.save(AmqpMessage().also { it.content = message })
        logger.info("Message saved: $message")
    }
}