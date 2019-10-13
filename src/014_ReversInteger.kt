import org.junit.Test
import kotlin.test.assertEquals

//7. Reverse Integer
//Given a 32-bit signed integer, reverse digits of an integer.
//
//Examples:
//
//    Input: 123
//    Output: 321
//    Example 2:
//
//    Input: -123
//    Output: -321
//    Example 3:
//
//    Input: 120
//    Output: 21
//    Note:
//    Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
//    For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
//
fun reverse(x: Int): Int {
////   digit count of x
//    var digCountX = 1
//    var cuttenX = x
//    while (cuttenX / 10 != 0) {
//        cuttenX /= 10
//        digCountX += 1
//    }
//    println(digCountX)

//    collect reverse X
    var reverseX = 0
    var newX = x
    while (newX != 0) {
        val lastDig = newX % 10
        //   function returns 0 when the reversed integer overflows
        if (reverseX > Int.MAX_VALUE/10 || (reverseX == Int.MAX_VALUE / 10 && lastDig > 7)) return 0
        if (reverseX < Int.MIN_VALUE/10 || (reverseX == Int.MIN_VALUE / 10 && lastDig < -8)) return 0
        reverseX = reverseX * 10 + lastDig
        newX /= 10
    }
////   function returns 0 when the reversed integer overflows
//    if (reverseX >= Int.MAX_VALUE && reverseX <= Int.MIN_VALUE) {
//        return 0
//    }
    return reverseX
}
// fun main() {
//     var resultForPrint = 1
//     resultForPrint = reverse(-1463847412)
//     println(resultForPrint)
// }

class ReverseTest {
    @Test
    fun reverseIntegerTest() {
        assertEquals(12345, reverse(54321))
        assertEquals(-12345, reverse(-54321))
        assertEquals(-345, reverse(-54300000))
        assertEquals(0, reverse(1463847413))
        assertEquals(-2147483641, reverse(-1463847412))
        assertEquals(1101111111, reverse(1111111011))
    }
}