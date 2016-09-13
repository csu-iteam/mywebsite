package org.pikachu

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext

import java.util.Arrays

@SpringBootApplication
open class SpringBootDemoApplication {
}


fun main(args: Array<String>) {
    //		SpringApplication.run(SpringBootDemoApplication.class, args);
    val ctx = SpringApplication.run(SpringBootDemoApplication::class.java, *args)

    System.out.println("Let's inspect the beans provided by Spring Boot:");

    var beanNames=ctx.beanDefinitionNames;
    Arrays.sort(beanNames);
    for (beanName in beanNames) {
        System.out.println(beanName);
    }
}