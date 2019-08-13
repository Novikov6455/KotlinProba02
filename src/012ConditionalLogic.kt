fun main(args: Array<String>){
    val a = 63
    val b = 3
    if (a != b){
        println("a does not equal b")
        if (a > b){
            println("a large then b")
        }
    }
    else if (a > b){            //условие не проверяется если предыдущая проверка {} = true
        println("a > b")
    }
    if(a < b){
        println("a < b")
    }
    else {                      // else should be вложенным - иначе ошибка как здесь
        println("a == b")
    }


}