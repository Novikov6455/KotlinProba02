fun removeDuplicateLetters(s: String): String {
    return s.toSortedSet().toString().filter { it != '[' && it != ']' && it != ',' && it != ' '}
}

fun main() {
    var string = "asdfffffffghj"
    var string1 = "bcabc"
    println(removeDuplicateLetters(string))
    println(removeDuplicateLetters(string1))
}