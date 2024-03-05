package com.renato.bank.client.person.response

data class GetPersonResponse(val id: Long, val documentId: String, val name: String, val surname: String, val age: Integer);