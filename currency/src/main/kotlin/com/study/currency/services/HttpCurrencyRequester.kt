package com.study.currency.services

import com.study.common.model.CurrencyRatesRequest
import com.study.currency.persist.CurrencyResult
import com.study.currency.services.currencyapi.CurrencyServiceProviderOne
import com.study.currency.services.exchangerateapi.CurrencyServiceProviderTwo
import org.springframework.stereotype.Service

@Service
class HttpCurrencyRequester(
    private val currencyService1: CurrencyServiceProviderOne,
    private val currencyService2: CurrencyServiceProviderTwo
): CurrencyRequester {
    override fun fromAllProviders(request: CurrencyRatesRequest): CurrencyResult {
        return CurrencyResult().also {
            it.providerOneResult = currencyService1.getCurrencyRates().toString()
            it.providerTwoResult = currencyService2.getCurrencyRates()
        }
    }
}