package com.study.common.model

import java.time.LocalDateTime

data class CurrencyRatesRequest(
    val currencyCode: String,
    val dateTime: LocalDateTime
)