package com.study.amqp.service

import com.study.amqp.model.PowRequest
import com.study.amqp.persist.PowResult
import org.springframework.stereotype.Service

@Service
class BigDecimalPowProcessor: PowProcessor {
    override fun pow(request: PowRequest): PowResult {
        return PowResult(
            base = request.base,
            exponent = request.exponent,
            power = request.base.pow(request.exponent),
        )
    }
}