// Déclaration de fonction

fun hello() {
    return println("Hello, world!")
}

// Les paramètres et typage + Return du même type qu'en TS
// SI on utilise des {} pour déclarer, le return type est obligatoire si ce n'est pas Unit c'est-à-dire sans Return
fun sum(x: Int, y: Int): Int {
    return x + y
}

// Fonction qui peuvent être raccourci si courte:
fun sum2(x: Int, y: Int) = x + y

// On peut utiliser le return dans les conditions comme en JS:

val registeredUsernames = mutableListOf("john_doe", "jane_smith")

// A list of registered emails
val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String {
    // Early return if the username is already taken
    if (username in registeredUsernames) {
        return "Username already taken. Please choose a different username."
    }

    // Early return if the email is already registered
    if (email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }

    // Proceed with the registration if the username and email are not taken
    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}



fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
    // `return Unit` ou `return` est optionnel
    return
}
// Valeur par défaut dans une fonction
fun printMessageWithPrefix2(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
    // `return Unit` ou `return` est optionnel
    return Unit
}

// Expression Lambda
// Ce code peut être raccourci:
fun uppercaseString(text: String): String {
    return text.uppercase()
}

val upperCaseString2 = { text: String -> text.uppercase() }
// de la même façon var upperCase = (text) => {text.toUppercase()} en JS
// On peut aussi typer de cette façon si les parenthèses sont vides:
val upperCaseString3: (String) -> String = { text -> text.uppercase() }

// Une expression Lambda peut être retourné d'une fonction
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun main() {
    hello()
    // Hello, world!
    println(sum(1, 2))
    // 3
    println(sum2(1, 3))
    // 4
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello
    printMessageWithPrefix("log", "log")
    // Utilisation avec le défault, aussi utilisable normalement
    printMessageWithPrefix2("log2")
    printMessageWithPrefix2(message = "Info", prefix = "Info")

    println(registerUser("john_doe", "newjohn@example.com"))
    // Username already taken. Please choose a different username.
    println(registerUser("new_user", "newuser@example.com"))
    // User registered successfully: new_user

    println(upperCaseString2("hello"))

    // exemple de fonction Lambda, ici dans le filter, elle peut être soit directement dedans soit déclaré avant

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter ({ x -> x > 0 })

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)
    // On peut enlever les parenthèses si la fonction lambda est le seul paramètre de la fonction
    //val positives = numbers.filter { x -> x > 0 }

    println(positives)
    // [1, 3, 5]
    println(negatives)
    // [-2, -4, -6]

    // autre exemple avec le map
    val numbers2 = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers2.map { x -> x * 2 }

    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers2.map(isTripled)

    println(doubled)
    // [2, -4, 6, -8, 10, -12]
    println(tripled)
    // [3, -6, 9, -12, 15, -18]

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
    // Total time is 1680 secs

    // On peut invoquer une fonction lambda en rajoutant des parenthèses derrière:

    println({ text: String -> text.uppercase() }("hello"))

    // On peut supprimer les parenthèses dans ce cas:

    // The initial value is zero.
    // The operation sums the initial value with every item in the list cumulatively.
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

    // Alternatively, in the form of a trailing lambda
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6
}
