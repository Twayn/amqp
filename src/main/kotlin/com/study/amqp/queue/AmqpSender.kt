package com.study.amqp.queue

import com.study.amqp.model.PowRequest
import com.study.amqp.queue.api.AmqpSender
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class AmqpSender(
    private var template: RabbitTemplate,
    private var queue: Queue
) : AmqpSender {
    var logger: Logger = LoggerFactory.getLogger(AmqpSender::class.java)

    //    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    override fun send(request: PowRequest) {
        template.convertAndSend(queue.name, request)
        logger.info("message '$request' sent to queue '${queue.name}'")
    }
}