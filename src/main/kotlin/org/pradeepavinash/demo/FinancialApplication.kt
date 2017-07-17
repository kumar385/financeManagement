package org.pradeepavinash.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = arrayOf("org.financemanagement.controller"))
class FinancialApplication
fun main(args: Array<String>) {
    SpringApplication.run(FinancialApplication::class.java, *args)
}
