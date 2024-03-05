package com.renato.bank.client.person

import com.renato.bank.client.person.response.GetPersonResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "personAPI", url = "\${person-service.client.url}")
interface PersonAPIClient {

    @GetMapping("/{personId}")
    fun getPerson(@PathVariable("personId") personId: String): GetPersonResponse;
}