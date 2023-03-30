fun main() {
    println("Fahrenheit\tCelsius")
    println("------------------------")
    for (fahrenheit in 0..20) {
        val celsius = celsius(fahrenheit.toDouble())
        println("$fahrenheit\t\t${"%.2f".format(celsius)}")
    }
}

fun celsius(fahrenheit: Double): Double {
    return 5.0 / 9.0 * (fahrenheit - 32.0)
}
