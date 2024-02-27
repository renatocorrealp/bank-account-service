package com.renato.bank.service.dto

data class BankAccountDTO(val personId: String, val accountId: String, val iban: String, val balance: Double)