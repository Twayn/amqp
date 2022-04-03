package com.study.amqp.tut1.api

import com.study.amqp.model.PowRequest

interface AmqpSender {
    fun send(request: PowRequest)
}