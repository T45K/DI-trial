package io.github.t45k.guiceTrial.tangledDependency

import com.google.inject.Inject

class TangledDependency @Inject constructor(private val childA: ChildA, private val childB: ChildB) {
    fun act() {
        childA.act()
        childB.act()
    }
}
