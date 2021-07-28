const readline = require('readline').createInterface({
    input: process.stdin, output: process.stdout
})

readline.question('Number to Operate with?', num1 => 
    readline.question('Operation? (supports + - * /)', operator => 
        readline.question('Number to Operate by?', num2 => 
            console.log(calculate(operator, num1, num2))
        )
    )
)

function calculate(operator, num1, num2) {
    num1 = parseInt(num1)
    num2 = parseInt(num2)
    switch (operator) {
        case '+':
            return num1 + num2
        case '-':
            return num1 - num2
        case '*':
            return num1 * num2
        case '/':
            return num1 / num2                        
    }
}