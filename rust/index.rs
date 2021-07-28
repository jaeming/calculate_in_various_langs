fn main() {
    let mut num1 = String::new();
    let mut operator = String::new();
    let mut num2 = String::new();

    println!("Enter number to be operated on:");
    std::io::stdin().read_line(&mut num1).unwrap();
    println!("Enter operator:");
    std::io::stdin().read_line(&mut operator).unwrap();
    println!("Enter number to be operated by:");
    std::io::stdin().read_line(&mut num2).unwrap();

    let answer: i32 = calculate(num1.trim(), num2.trim(), operator.trim());

    println!("{}", answer);
 }

 fn calculate(num1: &str, num2: &str, operator: &str) -> i32 {
    let num1 = num1.parse::<i32>().unwrap();
    let num2 = num2.parse::<i32>().unwrap();

    match operator {
        "+" => num1 + num2,
        "-" => num1 - num2,
        "*" => num1 * num2,
        "/" => num1 / num2,
        _ => 0
    }
 }