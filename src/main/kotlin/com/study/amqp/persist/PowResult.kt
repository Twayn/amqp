package com.study.amqp.persist

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class PowResult(
    @Id
    @GeneratedValue
    @Column(name = "id")
    val id: Long? = null,
    var base: BigDecimal? = null,
    var exponent: Int? = null,
    var power: BigDecimal? = null,
)