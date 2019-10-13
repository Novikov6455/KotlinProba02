import org.junit.AssumptionViolatedException
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import javax.swing.UIManager.put
import java.util.HashMap



//1. Two Sum
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

class Solution {
fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            if ((nums[i] + nums[j]) == target) {
//                println("i=$i, j=$j")
                return intArrayOf(i, j)}
        }
    }
    throw IllegalArgumentException("No two sum solution")
}

fun twoSum2(nums: IntArray, target: Int): IntArray {
    val myHashMap = HashMap<Int, Int>()
    for (i: Int in 0 until nums.size) {
        myHashMap[nums[i]] = i
    }
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (myHashMap.containsKey(complement) && i != myHashMap[complement]) {
            return myHashMap[complement]?.let { intArrayOf(i, it) }!!
        }
    }
//    return intArrayOf()
    throw IllegalArgumentException("No two sum solution")

}

}



class ArrayIntTest{
    @Test(expected = IllegalArgumentException::class)
    fun twoSumTest()  {
        // Exception tests
        val solution = Solution()
        solution.twoSum(intArrayOf(5, 7, 5, 5, 9), 9)
        solution.twoSum(intArrayOf(5, 0), 9)
        // Common tests
        assertEquals(expected = intArrayOf(0, 1).toList(), actual = solution.twoSum(intArrayOf(2, 7, 11, 15), 9).toList())
        assertEquals(expected = intArrayOf(0, 3).toList(), actual = solution.twoSum(intArrayOf(1, 4, 11, 8), 9).toList())
        assertEquals(expected = intArrayOf(0, 3).toList(), actual = solution.twoSum(intArrayOf(5, 7, 2, 4, 6, 89), 9).toList())
    }
    @Test(expected = IllegalArgumentException::class)
    fun twoSum2Test()  {
        // Exception tests
        val solution = Solution()
        solution.twoSum2(intArrayOf(5, 7, 5, 5, 9), 9)
        solution.twoSum2(intArrayOf(5, 0), 9)
        // Common tests
        assertEquals(expected = intArrayOf(0, 1).toList(), actual = solution.twoSum2(intArrayOf(2, 7, 11, 15), 9).toList())
        assertEquals(expected = intArrayOf(0, 3).toList(), actual = solution.twoSum2(intArrayOf(1, 4, 11, 8), 9).toList())
        assertEquals(expected = intArrayOf(0, 3).toList(), actual = solution.twoSum2(intArrayOf(5, 7, 2, 4, 6, 89), 9).toList())
    }

}



