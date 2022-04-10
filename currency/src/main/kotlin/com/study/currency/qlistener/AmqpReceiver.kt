package com.study.currency.qlistener

import com.study.common.model.CurrencyRatesRequest
import com.study.currency.persist.AmqpRepository
import com.study.currency.services.CurrencyRequester
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitHandler
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@RabbitListener(queues = ["\${ampq.queue.name}"])
@Service
class AmqpReceiver(
    private var storage: AmqpRepository,
    private var currencyRequester: CurrencyRequester
) {
    var logger: Logger = LoggerFactory.getLogger(AmqpReceiver::class.java)

    @RabbitHandler
    fun receive(request: CurrencyRatesRequest) {
        logger.info("Message received: $request")

        val result = currencyRequester.fromAllProviders(request)

        storage.save(result)

        logger.info("Message saved: $request")
    }
}