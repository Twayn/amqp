package com.study.amqp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class AmpqApplication

fun main(args: Array<String>) {
	runApplication<AmpqApplication>(*args)
}
