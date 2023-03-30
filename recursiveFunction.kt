fun main () {
   println(fibonacci(1))  
   println(fibonacci(2))  
   println(fibonacci(3))  
   println(fibonacci(4))  
   println(fibonacci(5))  
   println(fibonacci(6))  
   println(fibonacci(7))  
   println(fibonacci(10)) 
}

fun fibonacci(number: Int): Int {
    if (number < 1) {
        return 0
    } else if (number == 1 || number == 2) {
        return 1
    } else {
        return fibonacci(number - 1) + fibonacci(number - 2)
    }
}
