package com.study.amqp.queue

import com.study.common.model.CurrencyRatesRequest
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class AmqpSender(
    private var template: RabbitTemplate,
    private var queue: Queue
) : MessageSender {
    var logger: Logger = LoggerFactory.getLogger(MessageSender::class.java)

    //    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    override fun send(request: CurrencyRatesRequest) {
        template.convertAndSend(queue.name, request)
        logger.info("message '$request' sent to queue '${queue.name}'")
    }
}