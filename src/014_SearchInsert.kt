/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.

Example 1:
Input: [1,3,5,6], 5
Output: 2
Example 2:
Input: [1,3,5,6], 2
Output: 1
Example 3:
Input: [1,3,5,6], 7
Output: 4
Example 4:
Input: [1,3,5,6], 0
Output: 0
 */
fun searchInsert(nums: IntArray, target: Int): Int {
    if (target in nums) return nums.indexOf(target)
    if (target < nums[0]) return 0
    if (target > nums[nums.size-1]) return nums.size
    for (j in 1..nums.size-1){
        if (nums[0] < target && target < nums[j]) return j
    }
return -1
}

fun searchInsert01(nums: IntArray, target: Int): Int {
    for ((index, value) in nums.withIndex()) {
        if (value >= target) return index
    }
    return nums.size
}

fun main() {
    val nums01 = intArrayOf(1, 3, 5, 6)
    val target01 = 5
    val nums02 = intArrayOf(1, 3, 5, 6)
    val target02 = 2
    val nums03 = intArrayOf(1, 3, 5, 6)
    val target03 = 7
    val nums04 = intArrayOf(1, 3, 5, 6, 8)
    val target04 = 7

    println(searchInsert(nums01, target01))
    println(searchInsert(nums02, target02))
    println(searchInsert(nums03, target03))
    println(searchInsert(nums04, target04))
    println(searchInsert01(nums01, target01))
    println(searchInsert01(nums02, target02))
    println(searchInsert01(nums03, target03))
    println(searchInsert01(nums04, target04))
}