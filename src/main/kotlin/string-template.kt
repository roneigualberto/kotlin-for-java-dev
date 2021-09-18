fun main() {
    val change = 4.22

    println("To show the value of change, we use \$$change")

    val numerator = 10.99
    val denominator = 20.00

    val person = object {
        val name = "Ronei"
        val age = 30
    }

    println("The value of $numerator divide by $denominator is ${numerator / denominator}")
    println("Person: ${person.name} age: ${person.age}")
}