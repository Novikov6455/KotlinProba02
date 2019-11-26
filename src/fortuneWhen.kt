fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birthday: Int) : String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")
    when (birthday) {
        28, 29, 30, 31 -> return "You are the BEST"
        in (1..3) -> return "You are LUCKY!!!"
        in (7 downTo 4) -> return fortunes[birthday]
        else -> return fortunes[birthday.rem(fortunes.size)]
    }
}

fun getBirthday() :Int {
    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}

