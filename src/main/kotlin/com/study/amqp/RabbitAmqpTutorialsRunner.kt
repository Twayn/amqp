package com.study.amqp

import org.springframework.boot.CommandLineRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.ConfigurableApplicationContext
import java.lang.Exception
import kotlin.Throws

class RabbitAmqpTutorialsRunner : CommandLineRunner {
    @Value("\${tutorial.client.duration:0}")
    private val duration = 0

    @Autowired
    private lateinit var ctx: ConfigurableApplicationContext

    @Throws(Exception::class)
    override fun run(vararg arg0: String) {
        println("Ready ... running for " + duration + "ms")
        Thread.sleep(duration.toLong())
        ctx.close()
    }
}