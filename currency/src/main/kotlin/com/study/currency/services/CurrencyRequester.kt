package com.study.currency.services

import com.study.common.model.CurrencyRatesRequest
import com.study.currency.persist.CurrencyResult

interface CurrencyRequester {
    fun fromAllProviders(request: CurrencyRatesRequest): CurrencyResult
}