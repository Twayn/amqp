package com.study.currency.services.exchangerateapi

import com.study.currency.rest.RestService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class CurrencyServiceProviderTwo(
    private val restService: RestService
) {
    @Value("\${exchange_rates_api.apikey}")
    private lateinit var apikey: String

    fun getCurrencyRates(): String? {
        return restService.get("http://api.exchangeratesapi.io/v1/latest?access_key=$apikey", String::class.java)
    }
}