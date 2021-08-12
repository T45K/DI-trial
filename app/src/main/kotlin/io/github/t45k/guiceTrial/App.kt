package io.github.t45k.guiceTrial

import com.google.inject.AbstractModule
import com.google.inject.Guice
import com.google.inject.Inject
import io.github.t45k.guiceTrial.basic.BasicComponent
import io.github.t45k.guiceTrial.oneImplementatin.BasicInterface

class App1 @Inject constructor(private val basicComponent: BasicComponent) {
    fun act() {
        basicComponent.act()
    }
}

class App2 @Inject constructor(private val basicInterface: BasicInterface) {
    fun act() {
        basicInterface.act()
    }
}

fun main() {
    // classを注入したい場合は何も考えなくてよい
    val app1: App1 = Guice.createInjector(object : AbstractModule() {
        override fun configure() {}
    })
        .getInstance(App1::class.java)

    app1.act()

    // interfaceを注入したい場合は，対象のinterfaceに@ImplementedByを付け実装クラスを指定する
    // ただしこの方法はinterfaceが実装に依存するのでbad
    val app2: App2 = Guice.createInjector(object : AbstractModule() {
        override fun configure() {}
    })
        .getInstance(App2::class.java)

    app2.act()

}
