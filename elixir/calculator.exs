defmodule Calculator do
  def main do
    {num1, _} = Integer.parse IO.gets("Enter number to be operated on:")
    operator = String.trim IO.gets("Enter operator:")
    {num2, _} = Integer.parse IO.gets("Enter number to operate by:")

    answer = calculate(num1, num2, operator)
    IO.puts("the answer is #{answer}")
  end

  def calculate(num1, num2, "+"), do: num1 + num2
  def calculate(num1, num2, "-"), do: num1 - num2
  def calculate(num1, num2, "*"), do: num1 * num2
  def calculate(num1, num2, "/"), do: num1 / num2
  def calculate(_, _, _), do: IO.puts "Unsupported operation"
end

Calculator.main
