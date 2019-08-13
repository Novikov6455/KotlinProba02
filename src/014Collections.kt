import kotlin.math.PI

fun main(args: Array<String>) {
    val names = listOf<String>("Petr", "Ana", "Nik", "Bob", "1")
    val wordsAny = listOf(1, "Bob", PI, 2.567)
    val words = arrayListOf(1, "Bob", false)

    // names.add("KK")      // does not work - listoF<String> unmutable here
    // wordsAny.add(12)     // does not work else
    words.add("Vasiliy")
    words.add(0,"Grigoriy")
    println(names.sorted())
    //println(wordsAny.sorted()) //does not work
    //println(words.sorted()) //does not work
    println(words)
    println(words[0])
    println(names.indexOf("Ana"))
    words.remove("Bob")
    println(words)
    //names.remove()            //does not work
    


}