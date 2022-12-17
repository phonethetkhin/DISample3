package com.example.disample3

import javax.inject.Inject

class SampleClass @Inject constructor() {

    fun showHelloWorld() = "Hello World, I am hilt"
}