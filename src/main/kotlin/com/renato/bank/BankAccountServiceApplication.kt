package com.renato.bank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankAccountServiceApplication

fun main(args: Array<String>) {
	runApplication<BankAccountServiceApplication>(*args)
}
