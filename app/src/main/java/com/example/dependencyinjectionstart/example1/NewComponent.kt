package com.example.dependencyinjectionstart.example1

@dagger.Component
interface NewComponent {

    fun inject(activity: Activity)
}