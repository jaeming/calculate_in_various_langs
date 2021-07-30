open System

printfn "Enter number to be operated on:"
let num1 = Console.ReadLine() |> int
printfn "Enter operator:"
let operator = Console.ReadLine()
printfn "Enter number to operate by:"
let num2 = Console.ReadLine() |> int

let calculate (num1:int, num2:int, operator:string) =
    match operator with
    | "+" -> num1 + num2
    | "-" -> num1 - num2
    | "*" -> num1 * num2
    | "/" -> num1 / num2
    | _ -> 0

let answer = calculate(num1, num2, operator)
Console.WriteLine("the answer is {0}", answer)
