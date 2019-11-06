import org.junit.Test
import kotlin.math.absoluteValue
import kotlin.test.assertEquals

/*
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
You can use each character in text at most once. Return the maximum number of instances that can be formed.
Example 1:
Input: text = "nlaebolko"
Output: 1
Example 2:
Input: text = "loonbalxballpoon"
Output: 2
Constraints:
1 <= text.length <= 10^4
text consists of lower case English letters only.
 */

fun maxNumberOfBalloons(text: String): Int {
    val word = "balloon"
    val wordMap = hashMapOf<Char, Int>()
    for (char in word) {
        if (char !in wordMap.keys) wordMap[char] = 1 else wordMap[char] = wordMap[char]!!.plus(1)
    }
    println(wordMap)
    val textMap = hashMapOf<Char, Int>()
    for (char in text) {
        if (char !in textMap.keys) textMap[char] = 1 else textMap[char] = textMap[char]!!.plus(1)
    }
    println(textMap)
    val maxNumber = hashMapOf<Char, Int>()
    for (char in wordMap.keys) {
        if (char !in textMap.keys)  return 0
        maxNumber[char]  = (textMap[char]!!.div(wordMap[char]!!))
    }
    println(maxNumber.values.min())

return maxNumber.values.min()  ?: 0
}

//fun main() {
//    maxNumberOfBalloons("nlaebolko")
//}

class MaxNumberOfBalloonsTest {
    @Test
    fun maxNumberOfBalloonsTest() {
        assertEquals(1, actual = maxNumberOfBalloons("nlaebolko"))
        assertEquals(2, actual = maxNumberOfBalloons("loonbalxballpoonoooooooo"))
        assertEquals(0, actual = maxNumberOfBalloons("leetcode"))
        assertEquals(0, actual = maxNumberOfBalloons("balonellllll"))
    }
}