fun main(args: Array<String>){
    fun doSmth(){                                   // без аргумента
        println("I love you!")
    }
    fun doSmth01(line: String){                     // с аргументом
        println(line)
    }
    fun doSmth02(sentence:String = "I hope"){       // с аргументом с значением по умолчанию
        println(sentence)
    }

    doSmth()
    doSmth01("it never had happened")
    doSmth02()
    doSmth02("and just again")
    val sentenceAny = "I hope U right"
    doSmth02(sentenceAny)

    fun someCalculation(a: Int, b: Int ):Int{       // с возвращаемым значением и его типом
        var sum = a + b
        return sum
    }
    val phrase = "I heard it more then ${someCalculation(5, 10)} times" //обращение к функции
    // во время определения переменной
    doSmth01(phrase)
}