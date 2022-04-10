package com.study.currency.persist

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AmqpRepository : CrudRepository<PowResult, Long>