package com.study.amqp.config

import com.study.amqp.tut1.Tut1Receiver
import com.study.amqp.tut1.Tut1Sender
import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AmqpConfig {
    @Value("\${ampq.queue.name}")
    private lateinit var qName: String

    @Bean
    fun queue(): Queue {
        return Queue(qName)
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