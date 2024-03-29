package kr.jellyms.kotlinspringtodo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringTodoApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringTodoApplication>(*args)
}
