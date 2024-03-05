package com.renato.bank.client

import feign.Feign
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope


@Configuration
class APIClientsConfig {
    @Bean
    @Scope("prototype")
    fun feignBuilder(): Feign.Builder {
        return Feign.builder()
    }
}