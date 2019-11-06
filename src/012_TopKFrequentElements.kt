import org.junit.Test
import kotlin.test.assertEquals

/*
Given a non-empty array of integers, return the k most frequent elements.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
Input: nums = [1], k = 1
Output: [1]
Note:
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
fun topKFrequent(nums: IntArray, k: Int): List<Int> {
    val countedEach = hashMapOf<Int, Int>()
    nums.forEach { it ->
        if (it !in countedEach.keys) countedEach[it] = 1 else {
            countedEach[it] = countedEach[it]!!.plus(1)
        }
    }
//    val countedEachSorted = countedEach.toList().sortedByDescending { (key, value) -> value }.toMap()
    val allSorted = countedEach.entries.sortedByDescending { (key, value) -> value }
    val topFrequentElement = allSorted.map { (key, value) -> key }.subList(0, k)
//        topFrequentElement = countedEachSorted.keys.toList().subList(0, k)
//        topFrequentElement = allSorted.map { (key, value) -> key }.subList(0, k)

    println(countedEach)
//    println(countedEachSorted)
    println(allSorted)
    println(topFrequentElement)
    return topFrequentElement
}

//fun main() {
//    println("${topKFrequent(nums = intArrayOf(0, 1, 1, 1, 1, 2, 2, 3, 7, 9 , 2), k = 2 )}")
//}

class TopKFrequentTest {
    @Test
    fun topKFrequentTest () {
        assertEquals( expected = listOf(1, 2),actual = topKFrequent(nums = intArrayOf(0, 1, 1, 1, 1, 2, 2, 3, 7, 9 , 2), k = 2 ) )
        assertEquals( expected = listOf(1, 2, 0),actual = topKFrequent(nums = intArrayOf(0, 1, 1, 1, 1, 2, 2, 3, 7, 9 , 2), k = 3 ) )
        assertEquals( expected = listOf(2, 0),actual = topKFrequent(nums = intArrayOf(0, 2, 2, 3, 7, 9 , 2), k = 2 ) )
    }
}