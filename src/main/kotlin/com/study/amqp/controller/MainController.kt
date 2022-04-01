package com.study.amqp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MainController {

    @GetMapping("/health-check")
    fun healthCheck():String {
        return "ok"
    }
}