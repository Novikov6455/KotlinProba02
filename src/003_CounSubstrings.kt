import java.io.File

/**
 * Средняя
 *
 * Во входном файле с именем inputName содержится некоторый текст.
 * На вход подаётся список строк substrings.
 * Вернуть ассоциативный массив с числом вхождений каждой из строк в текст.
 * Регистр букв игнорировать, то есть буквы е и Е считать одинаковыми.
 *
 */

fun main(args: Array<String>) {
    val sentence:String = "ababababab abbbbaaaaa babaaba"
    val subSentence:String = "aba"
    println("Sentence: $sentence   - contains ${countSubstr(sentence, subSentence)} time subSentence $subSentence")

    countSubstrings("input/substrings_in1.txt", listOf("РАЗНЫЕ", "ные", "Неряшливость", "е", "эволюция"))
}

fun countSubstrings(inputName: String, substrings: List<String>): Map<String, Int> {

    val resultSubstrCount = hashMapOf<String, Int>()
    // result on default
    for (substring in substrings) {
        resultSubstrCount.put(substring, 0)
    }
    // read lines from file
    for (line in File(inputName).readLines()) {
//        println(line)
        val newLine: String = line.toLowerCase().trim()
    // handle each subString
        for (substring in substrings) {
            var substringCount: Int
            val newSubstring: String = substring.toLowerCase()
            // save some time using fun countSubstring only for right lines
            if (newSubstring in newLine){
                substringCount = resultSubstrCount[substring]!! + countSubstr(newLine, newSubstring)
                println(newSubstring)
                println(newLine)
                resultSubstrCount.put(substring, substringCount)
                println(resultSubstrCount)

            }
//            resultSubstrCount[substring]?.plus(substringCount) /// does not work here

        }
    }
    return resultSubstrCount
}


fun countSubstr(sentence:String, subSentence:String):Int {
    var substringCount = 0
    for (i in 0..sentence.length-subSentence.length){

        if (sentence.substring(i, i+subSentence.length) == subSentence){
            substringCount += 1
        }
    }
    return substringCount
}
