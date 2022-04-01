package com.study.amqp.tut1

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.amqp.rabbit.annotation.RabbitHandler

@RabbitListener(queues = ["hello"])
class Tut1Receiver {
    @RabbitHandler
    fun receive(`in`: String) {
        println(" [x] Received '$`in`'")
    }
}