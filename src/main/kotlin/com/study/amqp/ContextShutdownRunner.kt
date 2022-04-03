package com.study.amqp

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.stereotype.Component
import java.util.concurrent.TimeUnit

@Component
class ContextShutdownRunner : CommandLineRunner {
    var logger: Logger = LoggerFactory.getLogger(ContextShutdownRunner::class.java)

    @Value("\${time.until.shutdown:0}")
    private val untilShutdown: Long = 0L

    @Autowired
    private lateinit var ctx: ConfigurableApplicationContext

    override fun run(vararg arg0: String) {
        logger.info("Running for " + untilShutdown + "ms")

        TimeUnit.MILLISECONDS.sleep(untilShutdown)

        ctx.close()
    }
}