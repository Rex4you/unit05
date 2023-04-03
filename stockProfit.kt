fun main() {
    print("Enter the number of shares: ")
    val numberOfShares = readLine()!!.toInt()

    print("Enter the purchase price per share: ")
    val purchasePricePerShare = readLine()!!.toDouble()

    print("Enter the purchase commission paid: ")
    val purchaseCommissionPaid = readLine()!!.toDouble()

    print("Enter the sale price per share: ")
    val salePricePerShare = readLine()!!.toDouble()

    print("Enter the sale commission paid: ")
    val saleCommissionPaid = readLine()!!.toDouble()

    val profit = calculateProfit(
        numberOfShares,
        purchasePricePerShare,
        purchaseCommissionPaid,
        salePricePerShare,
        saleCommissionPaid
    )
    
    if (profit >= 0) {
        println("The sale resulted in a profit of $profit.")
    } else {
        println("The sale resulted in a loss of ${-profit}.")
    }
}
fun calculateProfit(
    numberOfShares: Int,
    purchasePricePerShare: Double,
    purchaseCommissionPaid: Double,
    salePricePerShare: Double,
    saleCommissionPaid: Double
): Double {
    val purchaseCost = numberOfShares * purchasePricePerShare + purchaseCommissionPaid
    val saleRevenue = numberOfShares * salePricePerShare - saleCommissionPaid
    return saleRevenue - purchaseCost
}
main()
