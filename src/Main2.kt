fun main() {
    val value: Int = 3 // Permet de typer une variable exemple: Byte, Short, Long, Int, UByte, UShort, UInt, ULong, Float, Double, Boolean, Char, String
    // Typer n'est pas obligatoire.
    println(value)

    // Création d'un Array en ReadOnly
    val list = listOf(1, 2, 3, 4, 5)
    println(list)

    // Array mutable
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // Prévenir les modifications non-voulu

    val shapes2: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesLocked: List<String> = shapes2
    println(shapesLocked)
    // Même fonctionnement qu'en JS pour récupérer une valeur dans une liste
    println("The first item in the list is: ${shapesLocked[0]}")
    println("The first item in the list is: ${shapesLocked.first()}")
    // Pour le dernier
    println("The first item in the list is: ${shapesLocked.last()}")

    // Avoir la length
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("This list has ${readOnlyShapes.count()} items")
    // Si includes

    println("circle" in readOnlyShapes)

    // Ajout d'un élément dans une liste
    shapes.add("pentagon")
    println(shapes)
    // Remove d'un élément dans une liste
    shapes.remove("pentagon")
    println(shapes)

    /// Les Sets


    // Set en Read-only
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Set Mutable
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(fruit)
    println(readOnlyFruit)
    // [apple, banana, cherry]
    // Le set supprime les items dupliqués
    val readOnlyFruit2 = setOf("apple", "banana", "cherry", "cherry")
    println("This set has ${readOnlyFruit2.count()} items")
    // Retournera 3 car cherry est dupliqué
    // Même principe pour vérifier si un item est dans le Set
    println("banana" in readOnlyFruit)

    // Pour éviter les modifications non-voulus
    val fruit2: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    val fruitLocked: Set<String> = fruit2


    /// Les Maps

    // Map en Read-only
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Map mutable
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}
    // Retourne en objet avec le nombre associé
    // Pour éviter les modifications non-voulus:
    val juiceMenu2: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    val juiceMenuLocked: Map<String, Int> = juiceMenu2

    // Pour accéder à la valeur voulu
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    // The value of apple juice is: 100
    // Si la clé n'existe pas, on recevra "null"

    // Ajout d'une valeur
    val juiceMenu3: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juiceMenu3["coconut"] = 150 // Add key "coconut" with value 150 to the map
    println(juiceMenu3)
    // {apple=100, kiwi=190, orange=100, coconut=150}

    // Savoir le nombre de valeurs
    val readOnlyJuiceMenu2 = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("This map has ${readOnlyJuiceMenu2.count()} key-value pairs")
    // This map has 3 key-value pairs

    // Voir si la clé est contenu:

    println(readOnlyJuiceMenu.containsKey("kiwi"))
    // true

    // Pour avoir l'ensembles des keys ou des values
    println(readOnlyJuiceMenu.keys)
    // [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values)
    // [100, 190, 100]

    //
    // Vérifier la présence
    println("orange" in readOnlyJuiceMenu.keys)
    // true

    // Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu)
    // true

    println(200 in readOnlyJuiceMenu.values)
    // false

}