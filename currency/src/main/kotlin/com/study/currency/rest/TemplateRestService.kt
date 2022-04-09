package com.study.currency.rest

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class TemplateRestService(restTemplateBuilder: RestTemplateBuilder) : RestService {
    private val restTemplate: RestTemplate = restTemplateBuilder.build()

    override fun <T> get(address: String, clazz: Class<T>): T? {
        return restTemplate.getForObject(address, clazz)
    }
}