package com.study.currency.rest

interface RestService {
    fun <T> get(address: String, clazz: Class<T>): T?
}