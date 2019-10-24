import org.junit.Test
import kotlin.test.assertEquals

/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Given nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the returned length.

Example 2:
Given nums = [0,0,1,1,1,2,2,3,3,4],
Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
It doesn't matter what values are set beyond the returned length.
Clarification:
Confused why the returned value is an integer but your answer is an array?
 */

fun removeDuplicates(nums: IntArray): Int {
    if (nums.size == 0) return 0
    var countNewSize = nums.size
    for (i in 1 until nums.size) {
        if (nums[i] == nums[i - 1]) {
            nums[i-1] = nums[i]
            countNewSize -= 1
        }
    }
    return countNewSize
}

fun removeDuplicates02(nums: IntArray):Int {
    println(nums.toSet())
    return nums.toSet().size
}

fun main() {
    var numbers = intArrayOf(1, 1, 2)
    println(numbers.toSet())
    println(numbers.toSet().size)

}

//class RemoveDuplicateTest {
//    @Test
//    fun removeDuplicatesTest() {
//        assertEquals(
//            expected = intArrayOf(0, 1, 1, 1, 1, 2, 3).size - 3,
//            actual = removeDuplicates(intArrayOf(0, 1, 1, 1, 1, 2, 3)))
//
//    }
//    @Test
//    fun removeDuplicates02Test() {
//        assertEquals(
//            expected = intArrayOf(0, 1, 1, 1, 1, 2, 3).size - 3,
//            actual = removeDuplicates02(intArrayOf(0, 1, 1, 1, 1, 2, 3)))
//
//    }
//
//}