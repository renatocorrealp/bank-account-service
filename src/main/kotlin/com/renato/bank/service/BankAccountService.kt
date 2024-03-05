package com.renato.bank.service

import com.renato.bank.client.person.PersonAPIClient
import com.renato.bank.service.dto.BankAccountDTO
import com.renato.bank.service.dto.CreateBankAccountDTO
import com.renato.bank.service.exception.PersonNotFoundException
import feign.FeignException.NotFound
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BankAccountService(@Autowired private val personAPIClient: PersonAPIClient) {

    fun createBankAccount(createBankAccountDTO: CreateBankAccountDTO): BankAccountDTO {
        try {
            val personResponse = personAPIClient.getPerson(createBankAccountDTO.personId);

            return BankAccountDTO(
                personId = "${personResponse.id}", // TODO - adjust field type
                accountId = "ea1d8d0d-7423-494f-8d47-8c7b187086fe",
                iban = "IE29AIBK93115212345678",
                balance = createBankAccountDTO.money
            )
        } catch (e: NotFound) {
            throw PersonNotFoundException("Person not found");
        }
    }
}