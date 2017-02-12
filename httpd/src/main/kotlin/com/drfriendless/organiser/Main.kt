package com.drfriendless.organiser

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class ImgApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ImgApplication::class.java, *args)
        }
    }
}
