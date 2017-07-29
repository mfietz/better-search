package de.mfietz.bettersearch

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BettersearchApplication

fun main(args: Array<String>) {
    SpringApplication.run(BettersearchApplication::class.java, *args)
}
