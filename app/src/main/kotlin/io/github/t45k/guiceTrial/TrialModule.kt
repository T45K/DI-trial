package io.github.t45k.guiceTrial

import com.google.inject.AbstractModule
import io.github.t45k.guiceTrial.multiImplementatin.MultiInterface
import io.github.t45k.guiceTrial.multiImplementatin.MultiInterfaceImplementation1
import io.github.t45k.guiceTrial.tangledDependency.ChildA
import io.github.t45k.guiceTrial.tangledDependency.ChildAImplementation
import io.github.t45k.guiceTrial.tangledDependency.ChildB
import io.github.t45k.guiceTrial.tangledDependency.ChildBImplementation

class TrialModule : AbstractModule() {
    override fun configure() {
        bind(MultiInterface::class.java).to(MultiInterfaceImplementation1::class.java)
        bind(ChildA::class.java).to(ChildAImplementation::class.java)
        bind(ChildB::class.java).to(ChildBImplementation::class.java)
    }
}
