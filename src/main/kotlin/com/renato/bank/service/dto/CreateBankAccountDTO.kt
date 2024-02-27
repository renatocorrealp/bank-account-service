package com.renato.bank.service.dto

data class CreateBankAccountDTO(val personId: String, val money: Double = 0.0)