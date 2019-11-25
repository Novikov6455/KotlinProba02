/*
Divide the birthday by the number of fortunes, and use the remainder as the index for the fortune to return.
 */

fun getFortuneCookie(birthdayNum: Double): String {
    val fortunes = listOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    var fortuneIndex = (birthdayNum % fortunes.size).toInt()
    return fortunes[fortuneIndex]
}

fun main() {
    var inpDig = 0.0
    while (true){
        print("\nEnter you birthday NUMBER or 'Done' for exit: ")
        val inp = readLine()
        if (inp == "Done")  {print("Done"); break}

        try {
            inpDig = inp!!.toDouble()
        }catch (e:Exception){
            print("Enter invalid, try more time\n"); continue
        }
        println(getFortuneCookie(inpDig))

    }
}