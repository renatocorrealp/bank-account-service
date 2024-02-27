package com.renato.bank.controller

import com.renato.bank.controller.request.mapper.toCreateBankAccountDTO
import com.renato.bank.service.dto.mapper.toCreateBankAccountResponse
import com.renato.bank.controller.response.CreateBankAccountResponse
import com.renato.bank.service.BankAccountService
import com.renato.bank.service.dto.CreateBankAccountRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BankAccountController(@Autowired private val bankAccountService: BankAccountService) {

    @GetMapping("/hello-world")
    fun helloWorld(): String {
        return "hello-world!";
    }

    @PostMapping("/create", MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE)
    fun createBankAccount(@RequestBody createBankAccountRequest: CreateBankAccountRequest): CreateBankAccountResponse {
        val newBankAccount = bankAccountService.createBankAccount(createBankAccountRequest.toCreateBankAccountDTO())
        return newBankAccount.toCreateBankAccountResponse();
    }

}