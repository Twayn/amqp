package com.study.amqp.model

import java.math.BigDecimal

data class PowRequest(
    val base: BigDecimal,
    val exponent: Int
)