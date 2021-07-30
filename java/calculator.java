class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter number to be operated on:");
        int num1 = Integer.parseInt(System.console().readLine());
        
        System.out.println("Enter operator:");
        String operator = System.console().readLine();        
        
        System.out.println("Enter number to operate by:");
        int num2 = Integer.parseInt(System.console().readLine());

        int answer = calculate(num1, num2, operator);
        System.out.println("the answer is " + answer);
    }

    public static int calculate(int num1, int num2, String operator) {
        switch(operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2;                                
            default: return 0;
        }

    }
}