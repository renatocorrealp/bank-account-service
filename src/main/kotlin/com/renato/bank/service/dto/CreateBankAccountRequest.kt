package com.renato.bank.service.dto

data class CreateBankAccountRequest(val personId: String, val money: Double = 0.0)