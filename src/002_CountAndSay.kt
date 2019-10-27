
/*
The count-and-say sequence is the sequence of integers with the first five terms as following:
1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
Note: Each term of the sequence of integers will be represented as a string.
Example 1:
Input: 1
Output: "1"

Example 2:
Input: 4
Output: "1211"
*/
fun countAndSay(n: Int): String? {
    val countDictionary
            = hashMapOf(1 to "1",
                        2 to "11",
                        3 to "21",
                        4 to "1211",
                        5 to "111221",
                        6 to "312211")
    if (n > 6) {
        for (i in 7..n) {
            countDictionary[i] = nextString(countDictionary[i-1]!!)
        }
    }
    println(countDictionary)
    return countDictionary[n]
}

fun nextString (inputString: String): String {
    var outputString = ""
    var start = 1               // slow index of char in inputString
    var countForChar = 1
    var resultForChar = ""
    for (j in 1 until inputString.length){
        start += 1
        if (inputString[j] == inputString[j-1]) {
            countForChar += 1
        } else {
            resultForChar += "$countForChar${inputString[j - 1]}"
            countForChar = 1
            }
        if (start == inputString.length) {
            resultForChar += "$countForChar${inputString[j]}"
        }
    }
    outputString += resultForChar
    return outputString
}

fun main() {
//    println(nextString("111221"))   // "312211"
    println(countAndSay(10))
}
