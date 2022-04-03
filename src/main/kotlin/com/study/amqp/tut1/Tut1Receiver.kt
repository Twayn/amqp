package com.study.amqp.tut1

import com.study.amqp.model.PowRequest
import com.study.amqp.persist.AmqpRepository
import com.study.amqp.service.PowProcessor
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitHandler
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Autowired

@RabbitListener(queues = ["\${ampq.queue.name}"])
class Tut1Receiver {
    var logger: Logger = LoggerFactory.getLogger(Tut1Receiver::class.java)

    @Autowired
    private lateinit var storage: AmqpRepository

    @Autowired
    private lateinit var powProcessor: PowProcessor

    @RabbitHandler
    fun receive(request: PowRequest) {
        logger.info("Message received: $request")

        val result = powProcessor.pow(request)

        logger.info("Processing result: ${result.power}")

        storage.save(result)

        logger.info("Message saved: $request")
    }
}