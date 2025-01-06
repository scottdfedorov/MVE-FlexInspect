package dev.sdf7

fun main() {
    println("Hello ${Hello.World}!")
}

annotation class Wibble

@Wibble
enum class Hello {
    World,
    @Wibble Universe;
}