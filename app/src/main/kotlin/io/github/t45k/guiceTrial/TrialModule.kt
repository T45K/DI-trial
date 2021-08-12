package io.github.t45k.guiceTrial

import com.google.inject.AbstractModule
import io.github.t45k.guiceTrial.multiImplementatin.MultiInterface
import io.github.t45k.guiceTrial.multiImplementatin.MultiInterfaceImplementation1

class TrialModule : AbstractModule() {
    override fun configure() {
        bind(MultiInterface::class.java).to(MultiInterfaceImplementation1::class.java)
    }
}
