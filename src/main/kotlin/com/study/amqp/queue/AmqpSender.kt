package com.study.amqp.queue

import com.study.amqp.model.PowRequest
import com.study.amqp.queue.api.AmqpSender
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Autowired

class AmqpSender : AmqpSender {
    var logger: Logger = LoggerFactory.getLogger(AmqpSender::class.java)

    @Autowired
    private lateinit var template: RabbitTemplate

    @Autowired
    private lateinit var queue: Queue

    //    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    override fun send(request: PowRequest) {
        template.convertAndSend(queue.name, request)
        logger.info("message '$request' sent to queue '${queue.name}'")
    }
}