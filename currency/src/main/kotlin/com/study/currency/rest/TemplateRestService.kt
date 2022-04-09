package com.study.currency.rest

import com.study.currency.model.CurrencyResponse
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class TemplateRestService(restTemplateBuilder: RestTemplateBuilder) : RestService {
    private val restTemplate: RestTemplate = restTemplateBuilder.build()

    override fun get(address: String): CurrencyResponse? {
        return restTemplate.getForObject(address, CurrencyResponse::class.java)
    }
}