package com.renato.bank.service

import com.renato.bank.service.dto.BankAccountDTO
import com.renato.bank.service.dto.CreateBankAccountDTO
import org.springframework.stereotype.Service

@Service
class BankAccountService() {

    fun createBankAccount(createBankAccountDTO: CreateBankAccountDTO): BankAccountDTO {
        // TODO - call person service - use Feign
        return BankAccountDTO(
            personId = "c58b8c49-68ef-4aba-a8cb-429f2167504c",
            accountId = "ea1d8d0d-7423-494f-8d47-8c7b187086fe",
            iban = "IE29AIBK93115212345678",
            balance = createBankAccountDTO.money
        )
    }
}