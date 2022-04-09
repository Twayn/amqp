package com.study.currency.services

import com.study.currency.model.CurrencyResponse
import com.study.currency.rest.RestService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class CurrencyService(
    private val restService: RestService
) {
    @Value("\${currency_api.apikey}")
    private lateinit var apikey: String

    fun getCurrencyRates(): CurrencyResponse? {
        return restService.get("https://api.currencyapi.com/v3/latest?apikey=$apikey")
    }
}