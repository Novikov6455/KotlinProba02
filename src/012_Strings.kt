fun main(args: Array<String>){
    val name = "Vadim"
    val soname = "Novikov"
    val str1 = "May the force be with you."
    val str2 = "May the force be with you.\n"
    val str3 = "May the force \rbe with you.\n"
    val str4 = "May the \$force be with $name.\n"
    val str5 = "May the force\\ be with you."
    val str6 = "May the force \n be with you."
    println(str1 + str2 + str3 + str4 + str5)
    println(str6)

    val rawCrawl = """A long long time ago,
        |in a galaxy
        |far, far, away...
        |BUMM BUMM BUMM
    """.trimMargin()
    println(rawCrawl)

    for (char in name) println(char) //Печатает по буквам
    for (char in soname) print(char) //Ничего не происходит - ???
    println("\n")                       //Разделительная строка
//    for (word in str1) println(word) // печатает по буквам
    for (word in str1.splitToSequence(" ")) println(word) // печатает по словам

    val someEquals = str1.contentEquals("May the force be with you.")
    println(someEquals)
    val someContains = str1.contains("Force", true)
    println(someContains)
    val subsequence = str1.subSequence(4,13)
    println(subsequence)
    println("${name + soname.toUpperCase()} full name has ${(name+soname).count()} characters")

}



