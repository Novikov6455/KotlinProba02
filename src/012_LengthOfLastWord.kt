import org.junit.Test
import kotlin.test.assertEquals

/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consists of non-space characters only.
Example:
Input: "Hello World"
Output: 5
 */
fun lengthOfLastWord(s: String): Int {
    val sentence = s.trim()
    if (sentence.length == 0 ) return 0
    var lengthCount = 0
    for (i in sentence.length - 1 downTo 0 ) {
        if (sentence[i] != ' ' ) {
            lengthCount++
//            println(i)
//            println(sentence[i])
        } else return lengthCount
    }
    return lengthCount
}

//fun main() {
//    println(lengthOfLastWord(" Hello World! "))
//}

class LengthOfLastWordTest {
    @Test
    fun lengthOfLastWordTest(){
        assertEquals(expected = 0, actual = lengthOfLastWord(""))
        assertEquals(expected = 0, actual = lengthOfLastWord("  "))
        assertEquals(expected = 6, actual = lengthOfLastWord(" World! "))
        assertEquals(expected = 6, actual = lengthOfLastWord(" Hello World! "))
        assertEquals(expected = 6, actual = lengthOfLastWord(" Hello World!"))
        assertEquals(expected = 6, actual = lengthOfLastWord("    Hello    World!"))
        assertEquals(expected = 6, actual = lengthOfLastWord("        world!"))
    }
}