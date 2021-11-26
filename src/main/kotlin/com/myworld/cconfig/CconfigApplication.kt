package com.myworld.cconfig

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableConfigServer
@EnableEurekaServer
open class CconfigApplication

fun main(args: Array<String>) {
    SpringApplication.run(CconfigApplication::class.java, *args)
}