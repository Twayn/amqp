package com.study.amqp.persist

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AmqpRepository : CrudRepository<AmqpMessage, Long>