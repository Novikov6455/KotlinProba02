import java.util.*

fun dayOfWeek(){
    println("What is the day of week?")
    var dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (dayOfWeek){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid input")
    }

    println( when (dayOfWeek) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}
fun main() {
    dayOfWeek()
}