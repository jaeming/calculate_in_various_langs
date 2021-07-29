fun main() {
    println("Enter number to be operated on:")
    val num1 = readLine()!!
    println("Enter operator:")
    val operator = readLine()!!
    println("Enter number to operate by:")
    val num2 = readLine()!!

    val answer = calculate(num1.toInt(), num2.toInt(), operator)
    println("this answer is $answer")
}

fun calculate(num1: Int, num2: Int, operator: String): Int {
    return when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> 0
    }
}