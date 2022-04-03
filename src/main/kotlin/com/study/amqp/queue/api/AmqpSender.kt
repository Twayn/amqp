package com.study.amqp.queue.api

import com.study.amqp.model.PowRequest

interface AmqpSender {
    fun send(request: PowRequest)
}