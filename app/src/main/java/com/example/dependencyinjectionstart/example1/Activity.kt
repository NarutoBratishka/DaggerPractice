package com.example.dependencyinjectionstart.example1

class Activity {

    val computer: Computer = Component().getComputer()
}