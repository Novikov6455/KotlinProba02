import java.lang.reflect.Parameter
import kotlin.math.*
import java.lang.Math.*

/**
 Kotlin Coding project
 */
fun main(parameter: Array <String>) {
    print("Enter NUMBER :")
    val n = readLine()!!.toInt()
    //println("For n = $n Factorial($n) = ${factorial(n)}")
    //println("For n = $n Fibonacci($n) = ${fibonacci(n)}")
    //println("For n = $n Fibonacci2($n) = ${fibonacci2(n)}")
    println("For n = $n Fibonacci3($n) = ${fibonacci3(n)}")
    //println("For n = $n digitNunber($n) = ${digitNumber(n)}")
    println("Good Luck")
}
/*** Factorial  ***************************************************************/
fun factorial(n: Int): Double =
        if (n <= 1) 1.0
        else n * factorial(n - 1)


/** Fibonacci : 1, 1, 2, 3, 5, 8, 13 */
fun fibonacci(n: Int): Int =
    when (n) {
        0 -> 0
        1 -> 1
        else -> fibonacci(n-1) + fibonacci(n-2)
    }

/** Fibonacci2   ****************/
fun fibonacci2(n: Int): Int =
        if (n <= 1) n
        else fibonacci2(n-1) + fibonacci2(n-2)

/** Fibonacci3 ****************************************/
fun fibonacci3(n: Int): Int {
    var a = 1
    var b = 1
    var c = a + b
    var fib:Int = 0

    for (n in 1..n){
        fib = a
        a = b
        b = c
        c = a + b
    }
    return fib
}

/**
 * Тривиальная
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int {
    var i = 1
    if (n == 0) return 1
    while (n / pow(10.0, i.toDouble()) >= 1.0) i += 1
    return i
}

