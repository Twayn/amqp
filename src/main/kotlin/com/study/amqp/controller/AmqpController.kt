package com.study.amqp.controller

import com.study.amqp.persist.AmqpMessage
import com.study.amqp.persist.AmqpRepository
import com.study.amqp.tut1.api.AmqpSender
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class AmqpController {
    var logger: Logger = LoggerFactory.getLogger(AmqpController::class.java)

    @Autowired
    private lateinit var sender: AmqpSender

    @Autowired
    private lateinit var messageStorage: AmqpRepository

    @PostMapping("/sendMessage/{message}")
    fun sendMessage(@PathVariable message: String):String {
        logger.info("Got message: $message")
        sender.send(message)
        logger.info("Message sent: $message")

        return "Message successfully sent: $message"
    }

    @GetMapping("/getReceivedMessaged")
    fun getAllMessages(): Iterable<AmqpMessage> {
        return messageStorage.findAll()
    }
}