fun main () {
   print(isPrime())
}

fun isPrime(number: Int): Boolean{
    for(x in 1..Math.abs(number)-1) {
        if(x != 1 && isNumberDivisible(number,x)) {
            return false;
        }
    }
    
    return true
}

fun isNumberDivisible(number: Int, divisor: Int): Boolean{
    return number % divisor == 0
}
