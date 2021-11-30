fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun summ(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

//infix fun Int.times(str: String) = str.repeat(this)

infix fun String.onto(other: String) = Pair(this, other)

class Person(val nome: String) {
     val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likedPeople.add(other)}
}

operator fun Int.times(str: String) = str.repeat(this)

fun main() {
    //println(2 times "Bye ")
    val pair = "Ferrari" to "katrine"
    println(pair)
    println("McLaren" onto "Lucas")

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")

    sophia likes claudia
    sophia.likedPeople.forEach { println(it.nome) }

    println(2 * "Bye ")
}