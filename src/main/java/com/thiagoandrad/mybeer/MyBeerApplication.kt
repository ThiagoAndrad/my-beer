package com.thiagoandrad.mybeer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MyBeerApplication

fun main(args: Array<String>) {
    SpringApplication.run(MyBeerApplication::class.java, *args)
}