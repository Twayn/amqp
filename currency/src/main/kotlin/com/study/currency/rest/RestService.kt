package com.study.currency.rest

import com.study.currency.model.CurrencyResponse

interface RestService {
    fun get(address: String): CurrencyResponse?
}