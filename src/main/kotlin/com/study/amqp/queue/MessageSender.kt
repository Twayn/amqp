package com.study.amqp.queue

import com.study.common.model.CurrencyRatesRequest

interface MessageSender {
    fun send(request: CurrencyRatesRequest)
}