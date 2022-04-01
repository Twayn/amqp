package com.study.amqp.config

import com.study.amqp.tut1.Tut1Receiver
import com.study.amqp.tut1.Tut1Sender
import org.springframework.amqp.core.Queue
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile


@Configuration
@Profile("tut1","hello-world")
class AmqpConfig {
    @Bean
    fun hello(): Queue {
        return Queue("hello")
    }

    @Profile("receiver")
    @Bean
    fun tut1Receiver(): Tut1Receiver {
        return Tut1Receiver()
    }

    @Profile("sender")
    @Bean
    fun sender(): Tut1Sender {
        return Tut1Sender()
    }
}