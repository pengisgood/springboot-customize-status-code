package me.pengisgood.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping("/hello")
    fun helloKotlin(): ResponseEntity<Any> {
        return ResponseEntity.status(105).build()
    }
}
