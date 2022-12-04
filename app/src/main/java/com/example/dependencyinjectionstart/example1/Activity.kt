package com.example.dependencyinjectionstart.example1

class Activity {

    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
}