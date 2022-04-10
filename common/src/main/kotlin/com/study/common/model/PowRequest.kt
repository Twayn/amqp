package com.study.common.model

import java.math.BigDecimal

data class PowRequest(
    val base: BigDecimal,
    val exponent: Int
)