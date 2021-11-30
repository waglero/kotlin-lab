//accessed by `this`

fun getNullableLength(ns: String?) {
    println("for \"$ns\": ")
    ns?.run {
        println("\tis empty?" + isEmpty())
        println("\tis length = $length")
        length
    }
}

fun main() {
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with kotlin")
}