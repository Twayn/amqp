package com.study.currency.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HealthCheckController {
    var logger: Logger = LoggerFactory.getLogger(HealthCheckController::class.java)

    @GetMapping("/health-check")
    fun healthCheck(): String {
        logger.info("Health-check requested")
        return "ok"
    }
}