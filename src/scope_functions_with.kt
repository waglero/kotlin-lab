fun main() {
    val configuration = object {
        val host: String = "test"
        val port: String = "test"
    }
    with(configuration) {
        println("$host:$port")
    }
}
