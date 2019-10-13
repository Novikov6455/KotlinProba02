import org.junit.Test
import kotlin.test.assertEquals

//9. Palindrome Number /Easy
//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//
//Example 1:
//Input: 121 Output: true
//
//Example 2:
//Input: -121 Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//
//Example 3:
//Input: 10  Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//Follow up: Coud you solve it without converting the integer to a string?

fun isPalindrome(x: Int): Boolean {
    // test for negative integers
    if (x < 0 ) return false
    // revers positive integer
    var newX = x
    var reverseX = 0
    while (newX != 0) {
        val lastDig = newX % 10
//        //   function returns false when the reversed integer overflows
//        if (reverseX > Int.MAX_VALUE/10 || (reverseX == Int.MAX_VALUE / 10 && lastDig > 7)) return false
        reverseX = reverseX * 10 + lastDig
        newX /= 10
    }
    // compare x and reverseX
    return x == reverseX
}

//fun main() {
//    println(isPalindrome(12321))
//    println(isPalindrome(-12321))
//    println(isPalindrome(123213))
//    println(isPalindrome(1))
//    println(isPalindrome(10))
//    println(isPalindrome(1000000001))
//    println(isPalindrome(2147447412))
//}


class IntPalindromTest {
    @Test
    fun isPalindromeTest() {
        assertEquals(expected = true, actual = isPalindrome(1234321))
        assertEquals(expected = true, actual = isPalindrome(1001))
        assertEquals(expected = false, actual = isPalindrome(10011))
    }
}