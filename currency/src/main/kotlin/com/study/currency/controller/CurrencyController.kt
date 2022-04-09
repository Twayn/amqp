package com.study.currency.controller

import com.study.currency.model.CurrencyResponse
import com.study.currency.services.currencyapi.CurrencyServiceProviderOne
import com.study.currency.services.exchangerateapi.CurrencyServiceProviderTwo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/currency")
class CurrencyController(
    private val currencyService1: CurrencyServiceProviderOne,
    private val currencyService2: CurrencyServiceProviderTwo
) {

    @GetMapping("/getCurrencyRates1")
    fun getCurrencyRates1(): CurrencyResponse? {
        return currencyService1.getCurrencyRates()
    }

    @GetMapping("/getCurrencyRates2")
    fun getCurrencyRates2(): String? {
        return currencyService2.getCurrencyRates()
    }
}