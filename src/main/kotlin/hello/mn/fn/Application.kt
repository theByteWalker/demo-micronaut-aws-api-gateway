package hello.mn.fn

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("hello.mn.fn")
                .mainClass(Application.javaClass)
                .start()
    }
}