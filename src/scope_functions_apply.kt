fun main() {
    val jake = object {}

    //apply runs block of code and then returns the object
    val stringDescription = jake.apply {
        val name = "jake"
        val age = 30
        val about = "Android developer"
    }.toString()
}