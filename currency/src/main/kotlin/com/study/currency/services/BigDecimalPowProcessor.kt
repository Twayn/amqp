package com.study.currency.services

import com.study.common.model.PowRequest
import com.study.currency.persist.PowResult
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