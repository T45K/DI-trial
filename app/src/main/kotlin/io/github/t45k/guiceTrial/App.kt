package io.github.t45k.guiceTrial

import com.google.inject.AbstractModule
import com.google.inject.Guice
import com.google.inject.Inject
import io.github.t45k.guiceTrial.basic.BasicComponent

class App @Inject constructor(private val basicComponent: BasicComponent) {
    fun act() {
        basicComponent.act()
    }
}

fun main() {
    val app: App = Guice.createInjector(object : AbstractModule() {
        override fun configure() {}
    })
        .getInstance(App::class.java)

    app.act()
}
