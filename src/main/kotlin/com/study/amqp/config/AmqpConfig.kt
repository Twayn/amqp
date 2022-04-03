package com.study.amqp.config

import com.study.amqp.tut1.Tut1Receiver
import com.study.amqp.tut1.Tut1Sender
import org.springframework.amqp.core.Queue
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AmqpConfig {
    @Bean
    fun queue(): Queue {
        return Queue("messageQueue")
    }

    @Bean
    fun tut1Receiver(): Tut1Receiver {
        return Tut1Receiver()
    }

    @Bean
    fun sender(): Tut1Sender {
        return Tut1Sender()
    }
}