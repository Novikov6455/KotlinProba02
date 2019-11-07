import org.junit.Test
import kotlin.math.max
import kotlin.math.min
import kotlin.test.assertEquals

/*
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Note that you cannot sell a stock before you buy one.
Example 1:
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:
Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
fun maxProfit(prices: IntArray): Int {
    if (prices.size <= 1) return 0
    var maxProfit = 0
    var minPrice = prices[0]
    for (offDay in 1..prices.size-1) {
        minPrice = min(minPrice, prices[offDay])
        maxProfit = max(maxProfit, prices[offDay] - minPrice)
    }
return maxProfit
}
class MaxProfitTest {
    @Test
    fun maxProfitTest() {
        assertEquals(expected = 5, actual = maxProfit( intArrayOf(7,1,5,3,6,4)))
        assertEquals(expected = 0, actual = maxProfit( intArrayOf(7,6,4,3,1)))
    }
}