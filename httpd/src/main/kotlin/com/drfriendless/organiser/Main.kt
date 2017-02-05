package com.drfriendless.organiser

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object ImgApplication {

    @JvmStatic fun main(args: Array<String>) {
        SpringApplication.run(ImgApplication::class.java, args)
    }
}
