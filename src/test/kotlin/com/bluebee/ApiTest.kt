package com.bluebee
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec

@MicronautTest
class ApiTest(private val application: EmbeddedApplication<*>): StringSpec({

    "test the server is running" {
        assert(application.isRunning)
    }
})
