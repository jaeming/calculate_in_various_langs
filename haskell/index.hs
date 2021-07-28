main = do  
    putStrLn "Enter number to be operated on:"
    num1 <- readLn :: IO Int
    putStrLn "Enter operator:"
    operator <- getLine
    putStrLn "Enter number to operate by:"
    num2 <- readLn :: IO Int

    let answer = calculate num1 num2 operator
    print answer

      
calculate n1 n2 "+" = n1 + n2
calculate n1 n2 "-" = n1 - n2
calculate n1 n2 "*" = n1 * n2
calculate n1 n2 "/" = div n1 n2
