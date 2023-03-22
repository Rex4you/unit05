fun main() {
    for (time in 1..10) {
        val distance = fallingDistance(time.toDouble())
        println("After $time seconds, the object has fallen $distance meters.")
    }
}

fun fallingDistance(time: Double): Double {
    val gravity = 9.8 // m/s^2
    val distance = 0.5 * gravity * time * time
    return distance
}
