package com.study.currency.services

import com.study.common.model.PowRequest
import com.study.currency.persist.PowResult

interface PowProcessor {
    fun pow(request: PowRequest): PowResult
}