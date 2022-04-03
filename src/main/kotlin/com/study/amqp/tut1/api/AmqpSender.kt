package com.study.amqp.tut1.api

interface AmqpSender {
    fun send(message:String)
}