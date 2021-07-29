import scala.io.StdIn.readLine

object Calculator extends App {
    print("Enter number to be operated on:")
    val num1 = readLine()
    print("Enter operator:")
    val operator = readLine()
    print("Enter number to operate by:")
    val num2 = readLine()

    val answer = calculate(num1.toInt, num2.toInt, operator)
    println(s"the answer is $answer")

    def calculate(num1: Int, num2: Int, operator: String): Int = {
        operator match {
            case "+" => num1 + num2
            case "-" => num1 - num2
            case "*" => num1 * num2
            case "/" => num1 / num2
            case _ => 0
        }   
    }    
}