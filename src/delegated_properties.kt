import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()

    override fun toString() = "Example Class"
}

class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

class LazySample {
    init {
        println("Created!")
    }

    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }
}

class Userr(private val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main() {
    val e = Example()
    println(e.p)

    e.p = "NEW"

    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}")
    println(" = ${sample.lazyStr}")

    val user = Userr(mapOf(
        "name" to "Jhon Doe",
        "age" to 25
    ))

    println("name = ${user.name}, age = ${user.name} ")
}