fun main() {
    val jake = object {
        val test = "teste"
    }.also { //run this block then return the object
        println(it.test)
    }

    println(jake.test)
}