package com.study.amqp.persist

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class AmqpMessage(
    @Id
    @GeneratedValue
    @Column(name = "id")
    val id: Long? = null,
    var content: String? = null,
)