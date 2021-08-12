package io.github.t45k.guiceTrial.tangledDependency

import com.google.inject.Inject

class ChildAImplementation @Inject constructor(private val grandChild: GrandChild) : ChildA {
    override fun act() {
        println("I am child A")
        grandChild.act()
    }
}
