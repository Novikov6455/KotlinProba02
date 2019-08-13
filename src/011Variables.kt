fun main(args: Array<String>){
    val name:String = "Vadim"
    var isAwesome:Boolean = true
    println("Is $name  awesome? The answer is: $isAwesome")

    var a = 4
    var b = 5
    var c:Double = 3.14                 //64 bit
    var d:Float = 12345.6789f           //32 bit
    var e:Long = 1234567890123456789L   //64 bit
    var f: Double = 12345678901234567890.123456 //64 bit

    println(a + b)
    println(a / b)
    println(a / b * 1.0)
    println(a / (b * 1.0))

    var g = b * 1.0
    var t = 2 +  g
    val h = listOf(1,2,3,"4",23.5,g, "hello")
    println(e.javaClass.name) // return type

    print("Type of g is: ${g.javaClass.name}  \n")
    print("Type of h is: ${h.javaClass.name}  ")
}
