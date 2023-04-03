fun main() {
    print("Enter the wholesale cost of the item: ")
    val wholesaleCost = readLine()!!.toDouble()

    print("Enter the markup percentage of the item: ")
    val markupPercentage = readLine()!!.toDouble()

    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupAmount = wholesaleCost * (markupPercentage / 100.0)
    return wholesaleCost + markupAmount
}
main()
