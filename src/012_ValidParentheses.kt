import java.util.Stack

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true
 */

fun isValid(string: String): Boolean {
    if (string.isEmpty()) return true
    val stack = Stack<Char>()
    val openType = setOf('(', '{', '[')
    val closeType = setOf(')', '}', ']')

    for (char in string) {
        if (stack.isEmpty() && char in closeType) return false
        if (stack.isEmpty() || char in openType) stack.push(char)
        else if (stack.isNotEmpty() && stack.peek() == '(' && char == ')' ) stack.pop()
        else if (stack.isNotEmpty() && stack.peek() == '{' && char == '}' ) stack.pop()
        else if (stack.isNotEmpty() && stack.peek() == '[' && char == ']' ) stack.pop()
        else stack.push(char)
    }
    return stack.isEmpty()
}

fun main() {
    println("sequence \"()\" is ${isValid("()")}")
    println("sequence \"()[]{}\" is ${isValid("()[]{}")}")
    println("sequence \"(]\" is ${isValid("(]")}")
    println("sequence \"([)]\" is ${isValid("([)]")}")
    println("sequence \"{[]}\" is ${isValid("{[]}")}")
    println("sequence \"(])\" is ${isValid("(])")}")
}