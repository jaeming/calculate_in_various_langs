def calculate(input)
    case input
    in { num1:, num2:, operator: '+' } then num1 + num2
    in { num1:, num2:, operator: '-' } then num1 - num2
    in { num1:, num2:, operator: '*' } then num1 * num2
    in { num1:, num2:, operator: '/' } then num1 / num2    
    else
    p "Operator Not supported."
    end
end

puts "Enter first number"
num1 = gets.chomp.to_i

puts "Enter operator (+ - * /)"
operator = gets.chomp

puts "enter second number"
num2 = gets.chomp.to_i

answer = calculate(num1: num1, num2: num2, operator: operator)
puts "The answer is #{answer}"
