val empty = "test".let {
    println("is empty: ${it.isEmpty()}")
}

fun printNonNull(str: String?) {
    println("Printing \"$str\": ")

    str?.let {
        print("\t")
        print(it)
        println()
    }
}


fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstString ->       // 5
        strTwo?.let { secondString ->
            print("$firstString : $secondString")
            println()
        }
    }
}

fun main() {
    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First", "Second")
}