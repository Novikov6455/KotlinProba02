/*
Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */

fun strStr(haystack: String, needle: String): Int {
    if (needle == "") return 0
    if (needle in haystack) return haystack.indexOf(needle)
    else return -1
}

fun main() {
    val haystack01 = "hello"
    val needle01 ="ll"
    println(strStr(haystack01, needle01))
    val haystack02 = "aaaaa"
    val needle02 ="bba"
    println(strStr(haystack02, needle02))
    val haystack03 = "hello"
    val needle03 =""
    println(strStr(haystack03, needle03))
}