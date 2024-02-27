package com.renato.bank.controller.request.mapper

import com.renato.bank.service.dto.CreateBankAccountDTO
import com.renato.bank.service.dto.CreateBankAccountRequest

fun CreateBankAccountRequest.toCreateBankAccountDTO(): CreateBankAccountDTO {
    return CreateBankAccountDTO(personId, money)
}