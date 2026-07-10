/// Null Safety

// Vérfier si une valeur est null

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

// Si on n'est pas sûr, utilisation du ?. comme en JS
fun lengthString(maybeString: String?): Int? = maybeString?.length
// Comme en JS, ça peut être chaîné : person.company?.address?.country

fun main() {
    // Valeur qui ne peut pas être null
    var neverNull: String = "This can't be null"
    // neverNull = null donnera une erreur dans la console
    // Peut être null
    var nullable: String? = "You can keep a null here"

    nullable = null // Code ok, pas d'erreur

    var inferredNonNull = "The compiler assumes non-nullable" // Considéré comme ne pouvant pas recevoir null

    // inferredNonNull = null renverra une erreur dans la console
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
    // 18
    // println(strLength(nullable)) Renverra une erreur

    val nullString: String? = null
    println(describeString(nullString))

    val nullString2: String? = null
    println(lengthString(nullString2))
    // null

    // Autre exemple opérateur ?.
    val nullString3: String? = null
    println(nullString3?.uppercase())
    // null

    // Valeur par défaut si null avec ?:
    val nullString4: String? = null
    println(nullString4?.length ?: 0)

}