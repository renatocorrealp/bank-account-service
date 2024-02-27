package com.renato.bank.controller.response

data class CreateBankAccountResponse(val personId: String, val accountId: String, val iban: String, val balance: Double)
