package com.study.amqp.service

import com.study.amqp.model.PowRequest
import com.study.amqp.persist.PowResult

interface PowProcessor {
    fun pow(request: PowRequest): PowResult
}