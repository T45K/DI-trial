package io.github.t45k.guiceTrial.oneImplementatin

import com.google.inject.ImplementedBy

@ImplementedBy(BasicInterfaceImplementation::class)
interface BasicInterface {
    fun act()
}
