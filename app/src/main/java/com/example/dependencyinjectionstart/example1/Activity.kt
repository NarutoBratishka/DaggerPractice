package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

//    @Inject lateinit var keyboard: Keyboard
//    @Inject lateinit var mouse: Mouse
//    @Inject lateinit var monitor: Monitor
//
//    init {
//        DaggerNewComponent.create().inject(this)
//    }

    /**~~~~~~~~~~~~~~~~*/

    private val component: NewComponent = DaggerNewComponent.create()
    val keyboard: Keyboard = component.getKeyboard()
    val mouse: Mouse = component.getMouse()
    val monitor: Monitor = component.getMonitor()
}