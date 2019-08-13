import kotlin.math.E
import kotlin.math.PI

open class Player(val name:String, val age:Int, val gender:String){
    fun attack(hitNomber: Int, fightNumber:Int, scrumbleTime: Double):Double{
        var atackPower = (2*hitNomber + fightNumber + E*age)*scrumbleTime
        return atackPower
    }
    fun defend(massNumber:Int, volumeHight:Double, squarePlace:Double, staminaTime:Double):Double{
        var defencePower = (PI*massNumber*age + volumeHight*squarePlace* E )*staminaTime
        return defencePower
    }
    fun walk(speed:Double, rotate:Double):Double{
        var mobilityPower = speed*rotate
        return mobilityPower
    }
}

class Thief(name:String, age:Int, gender:String,
            val wiliness:Double, val trickTime: Double = 2.0):Player(name, age, gender){
    fun cunning():Double {
        var cunningPower = wiliness * trickTime
        return cunningPower
    }
}

class Warrior(name:String, age:Int, gender:String,
              val artDefence:Double, val superPower:Double):Player(name, age, gender){
    fun brilliance():Double{
        return artDefence*superPower
    }
}

fun main(args: Array<String>) {
    val guginot = Warrior("FirstWarrior", 50, "mail", 250.5, 53.0)
    println("Brilliance of ${guginot.name} is ${guginot.brilliance()}")
}