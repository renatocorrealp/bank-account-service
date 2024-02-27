package com.renato.bank.service.dto.mapper

import com.renato.bank.controller.response.CreateBankAccountResponse
import com.renato.bank.service.dto.BankAccountDTO

fun BankAccountDTO.toCreateBankAccountResponse(): CreateBankAccountResponse {
    return CreateBankAccountResponse(
        personId = personId,
        accountId = accountId,
        iban = iban,
        balance = balance
    )
}