package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinGrapQlMongoApplication

fun main(args: Array<String>) {
	runApplication<KotlinGrapQlMongoApplication>(*args)
}
