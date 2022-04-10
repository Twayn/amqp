package com.study.amqp.queue.api

import com.study.common.model.PowRequest

interface AmqpSender {
    fun send(request: PowRequest)
}