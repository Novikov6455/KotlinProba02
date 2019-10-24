
fun removeDuplicates01(nums: MutableList<Int>): MutableList<Int> {
//    if (nums.size == 0) return nums
    println(" numsSize = ${nums.size}")
//    val nums01 = nums.filter {it < 3 }
//    val nums01 = nums.toSet()
    println("nums01 = $nums")
//    return nums.toSet().toMutableList()
    return nums.toSet().toMutableList()
}

fun main() {
    var numbers = mutableListOf<Int>(0, 1, 2, 2, 2, 2, 3, 4, 5)
    var newnumbers = removeDuplicates01(numbers)
    for (i in 0..newnumbers.size-1) println(newnumbers[i])

}