fun main() {

    // Condition normal
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)
    // 1

    val a = 1
    val b = 2

    // Utilisation comme en JS avec le a > b ? a : b
    println(if (a > b) a else b) // Returns a value: 2

    // Le when, l'équivalent du switch

    val obj = "Hello"

    val result = when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }

    println(result)
    // On reçoit la réponse du case donc Greeting

    // Exemple de When:

    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
    // Stop

    // On peut aussi faire ainsi:

    val trafficAction2 = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction2)
    // Stop


    /// Les Ranges
    // ! Ne renvoie pas ça en print car fonctionnement seulement dans les boucles
    println(1..4)
    // 1, 2, 3, 4
    println(1..<4)
    // 1, 2, 3
    println(4 downTo 1)
    // 4, 3, 2, 1
    println(1..5 step 2)
    // 1, 3, 5
    println('z' downTo 's' step 2)
    // 'z', 'x', 'v', 't'

    /// Les Loops

    // Boucle du type let i = 0; i < 5, i++
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }
    // 12345

    // Loops de collection

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    // Yummy, it's a carrot cake!
    // Yummy, it's a cheese cake!
    // Yummy, it's a chocolate cake!

    // Les boucles whiles

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    // Eat a cake
    // Eat a cake
    // Eat a cake

    // Boucle while-do

    var cakesEaten2 = 0
    var cakesBaked = 0
    while (cakesEaten2 < 3) {
        println("Eat a cake")
        cakesEaten2++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten2)
    // Eat a cake
    // Eat a cake
    // Eat a cake
    // Bake a cake
    // Bake a cake
    // Bake a cake

}