import org.junit.Test
import kotlin.test.assertEquals

/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
fun reverseWords(s: String): String {
    var sentence = s.trim().split(' ')
    var newSentence = ""
    for (eachWord in sentence) {
        newSentence += reversCharsInWord(eachWord) + " "
    }
//    println(newSentence.trim())
    return newSentence.trim()
}

fun reversCharsInWord(word: String): String {
    val wordToRevers = word.trim()
    var reversedWord =  ""
    for (char in wordToRevers.length-1 downTo 0) reversedWord += wordToRevers[char]
    return reversedWord
}

class ReverseWordsTest {
    @Test
    fun reversCharsInWordTest() {
        assertEquals(expected = "dcba", actual = reversCharsInWord("abcd"))
        assertEquals(expected = "dcba", actual = reversCharsInWord("abcd "))
        assertEquals(expected = "dcba", actual = reversCharsInWord(" abcd "))
    }
    @Test
    fun reverseWordsTest() {
        assertEquals(expected = "dcba hgfe", actual = reverseWords("abcd efgh"))
        assertEquals(expected = "dcba hgfe", actual = reverseWords("abcd efgh "))
        assertEquals(expected = "dcba hgfe", actual = reverseWords(" abcd efgh"))
        assertEquals(expected = "dcba hgfe", actual = reverseWords(" abcd efgh "))
    }
}