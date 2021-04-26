package com.example.gnirps

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GnirpsApplication

fun main(args: Array<String>) {
	runApplication<GnirpsApplication>(*args)
}

@RestController
@RequestMapping("/")
class TestController {
	@GetMapping("test")
	fun test() = "hello there"
}