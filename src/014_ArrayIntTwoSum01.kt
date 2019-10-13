import org.junit.Test

//1. Two Sum
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

//class Solution {
fun twoSum01(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            if ((nums[i] + nums[j]) == target) {
//                println("i=$i, j=$j")
                return intArrayOf(i, j)}
        }
    }
    throw IllegalArgumentException("No two sum solution")
}
//}
fun main(parameter: Array <String>) {
    val result = twoSum01(intArrayOf(2, 7, 11, 15), 9)
    val input = intArrayOf(2, 7, 11, 15)
    val exampl = intArrayOf(0, 1)
    println(twoSum01(intArrayOf(2, 7, 11, 15), 9)[0])
    println(twoSum01(intArrayOf(2, 7, 11, 15), 9).toString())
    println(twoSum01(intArrayOf(2, 7, 11, 15), 9).contentToString())
    println(exampl)
    println(exampl).toString()
    println(exampl.toString())
    println(exampl.contentToString())
    println(exampl.toList())

    println(twoSum01(intArrayOf(2, 7, 11, 15), 9).contentToString())
    println(result.contentToString())
    println(result)
    println(result.toString())
    println(result.toList())
    println(input.contentToString())
    println(input)
    println(input.toList())
    twoSum01(intArrayOf(1, 4, 11, 18), 9)

}



class ArrayIntTests01 {
    @Test(expected = IllegalArgumentException::class)
    fun twoSumTest01()
//        assertFailsWith((IllegalArgumentException::class),"No two sum solution") {twoSum(intArrayOf(5, 5, 5, 5, 9), 9)}
//        assertFailsWith<java.lang.IllegalArgumentException>
        { twoSum01(intArrayOf(5, 7, 5, 5, 9), 9) }

//        assertEquals(intArrayOf(0, 3), twoSum(intArrayOf(1, 4, 11, 8), 9))

}



