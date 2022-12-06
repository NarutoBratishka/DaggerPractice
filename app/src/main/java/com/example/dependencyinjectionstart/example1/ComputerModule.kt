package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ) = ComputerTower(storage, memory, processor)

    @Provides
    fun provideKeyboard() = Keyboard()

    @Provides
    fun provideMouse() = Mouse()

    @Provides
    fun provideStorage() = Storage()

    @Provides
    fun provideMemory() = Memory()

    @Provides
    fun provideProcessor() = Processor()


    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    } }