package com.study.amqp.controller

import com.study.amqp.queue.MessageSender
import com.study.common.model.CurrencyRatesRequest
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class AmqpController(
    private val sender: MessageSender
) {
    var logger: Logger = LoggerFactory.getLogger(AmqpController::class.java)

    @PostMapping("/sendRequest")
    fun sendMessage(@RequestBody request: CurrencyRatesRequest):String {
        logger.info("Got request: $request")

        sender.send(request)

        logger.info("Message sent: $request")

        return "Message successfully sent: $request"
    }
}