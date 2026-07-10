// 2 types de déclaration :
class Contact(val id: Int, var email: String)

class Contact2(val id: Int, var email: String) {
    val category: String = ""
    fun printId() {
        println(id)
    }
}

// Les classes peuvent avoir une default value

class Contact3(val id: Int, var email: String = "exemple@example.com") {
    val category: String = "work"
}

// Classe de données :
data class User(val name: String, val id: Int)


fun main() {
    val contact = Contact(1, "mary@gmail.com")

    // Accès aux valeurs :

    // Prints the value of the property: email
    println(contact.email)
    // mary@gmail.com

    // Updates the value of the property: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)
    // jane@gmail.com
    // Pour avoir du code dans un string :
    println("Their email address is: ${contact.email}")

    val contact2 = Contact2(id=2, email="tristan@tristangpt.tech")
    println(contact2.email)
    // Utilisation de la fonction de la classe
    contact2.printId()

    val user = User("Alex", 1)

    // Automatically uses toString() function so that output is easy to read
    println(user)
    // User(name=Alex, id=1)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Comparaison d'utilisateur sur les classes de données
    // Compares user to second user
    println("user == secondUser: ${user == secondUser}")
    // user == secondUser: true

    // Compares user to third user
    println("user == thirdUser: ${user == thirdUser}")
    // user == thirdUser: false

    // Copie de la classe:
    println(user.copy())
    // Copie avec changement de nom
    println(user.copy("Max"))
    // Copie avec changement d'ID :
    println(user.copy(id = 3))

}