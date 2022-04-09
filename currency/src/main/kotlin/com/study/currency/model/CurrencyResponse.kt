package com.study.currency.model

import java.time.LocalDateTime

data class CurrencyResponse(
    var meta: Meta? = null,
    var data: Map<String, Currency> = mapOf()
)

data class Meta(
    var last_updated_at: LocalDateTime? = null
)

data class Currency(
    var code: String = "",
    var value: Double = 0.0
)