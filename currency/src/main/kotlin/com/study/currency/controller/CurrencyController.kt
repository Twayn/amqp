package com.study.currency.controller

import com.study.currency.model.CurrencyResponse
import com.study.currency.services.CurrencyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/currency")
class CurrencyController(
    private val currencyService: CurrencyService
) {

    @GetMapping("/getCurrencyRates")
    fun getCurrencyRates(): CurrencyResponse? {
        return currencyService.getCurrencyRates()
    }
}