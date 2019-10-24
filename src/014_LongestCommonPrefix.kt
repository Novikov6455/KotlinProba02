/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

// one line
fun longestCommonPrefix000 (strings: Array<String>): String {
    return if(strings.size == 0){""}else{strings.reduce{a, b -> a.commonPrefixWith(b)}}
}


fun longestCommonPrefix01(strings: Array<String>): String {
    if (strings.size == 0) return ""
    var prefix = strings[0]
    for (i in 1..strings.size-1) {

        while (strings[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}
//--------------------------------------------------------------------
fun longestCommonPrefix02(strings: Array<String>): String {
    if (strings.size == 0) return ""
    val sortedStrings = strings.sortedBy { s: String -> s.length  }
    for (item in sortedStrings) println(item)
    var prefix = sortedStrings[0]
    for (i in 1..sortedStrings.size-1) {
        println("strings[$i] = ${sortedStrings[i]}, prefix = $prefix, index of prefix in string = ${sortedStrings[i].indexOf(prefix)} ")
        while (sortedStrings[i].indexOf(prefix) != 0) {
            println("strings[$i] = ${sortedStrings[i]}, prefix = $prefix, index of prefix in string = ${sortedStrings[i].indexOf(prefix)}, cut prefix almost to empty")
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}
// used sort _----------------------------------------------
fun longestCommonPrefix03(strings: Array<String>): String {
    if (strings.isEmpty()) return ""
    if(strings.size == 1) return strings[0]
    strings.sort()
    for (item in strings) println(item)

    for (i in strings[0].indices){
        println("strings[0][$i] = ${strings[0].indices} ")
        println("strings[0][$i] = ${strings[0][i]} ")
        println("strings[${strings.size-1}][$i] = ${strings[0][i]} ")
        if (strings[0][i] != strings[strings.size-1][i]) return strings[0].substring(0,i)
    }
    return strings[0]
}


//_______________________________ submitted to LeetCode
fun longestCommonPrefix04(strings: Array<String>): String {
    if (strings.size == 0) return ""
    val sortedStrings = strings.sorted()
//    for (item in sortedStrings) println(item)
    var prefix = sortedStrings[0]
    for (i in 1..sortedStrings.size-1) {
//        println("sorted Strings[$i] = ${sortedStrings[i]}, prefix = $prefix, index of prefix in string = ${sortedStrings[i].indexOf(prefix)} ")
        while (sortedStrings[i].indexOf(prefix) != 0) {
//            println("sorted Strings[$i] = ${sortedStrings[i]}, prefix = $prefix, index of prefix in string = ${sortedStrings[i].indexOf(prefix)}, cut prefix")
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}

//-----------------------------------

fun longestCommonPrefix05(strings: Array<String>): String {
    if (strings.size == 0) return ""
    val sortedStrings = strings.sortedBy { s: String -> s.length  }
    var prefix = sortedStrings[0]
    for (i in 1..sortedStrings.size-1) {
        while(sortedStrings[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}

fun main() {
    val strs = arrayOf("flooo", "floower", "fyflloww", "floight", "flooo", "flosssss", "flos")
    println("Common prefix = ${longestCommonPrefix01(strs)}")
}