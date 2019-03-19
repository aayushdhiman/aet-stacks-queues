package Postfix;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotationCalculator {
    private static Stack stack = new Stack();
    private static int firstOperand = 0;
    private static int secondOperand = 0;

    /**
     * Converts the Object <code>obj</code> into an int
     * @param obj the object to convert to an int
     * @return the integer value of the object
     */
    public static int convert(Object obj) {
        return (int) obj;
    }

    /**
     * Pulls the operands out of the stack and sets them to <code>firstOperand</code> and <code>secondOperand</code>
     */
    public static void setOperands() {
        secondOperand = convert(stack.pop()) ;
        firstOperand = convert(stack.pop());
    }

    /**
     * Pushes the sum of the two operands to the stack
     */
    public static void add() {
        setOperands();

        stack.push((firstOperand + secondOperand));

    }

    /**
     * Pushes the difference of the operands to the stack
     */
    private static void subtract() {
        setOperands();
        stack.push((firstOperand - secondOperand));
    }

    /**
     * Pushes the product of the operands to the stack
     */
    private static void multiply() {
        setOperands();
        stack.push((firstOperand * secondOperand));
    }

    /**
     * Pushes the quotient of the operands to the stack
     */
    private static void divide() {
        setOperands();
        stack.push((firstOperand / secondOperand));
    }

    /**
     * Pushes the solution to <code>firstOperand</code> to the power of <code>secondOperand</code> to the stack
     */
    private static void power() {
        setOperands();
        stack.push((int)(Math.pow(firstOperand, secondOperand)));
    }

    /**
     * Calculates the value of the postfix expression
     *
     * @param eq the equation to evaluate
     */
    public static void calculatePostfix(String[] eq) {
        for (int i = 0; i < eq.length; i++) {
            switch (eq[i]) {
                case "+":
                    add();
                    break;
                case "-":
                    subtract();
                    break;
                case "*":
                    multiply();
                    break;
                case "/":
                    divide();
                    break;
                case "^":
                    power();
                    break;
                default:
                    stack.push(Integer.parseInt(eq[i]));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a formula with a space as a delimiter: ");
        String[] eq = sc.nextLine().split(" ");

//        String test1 = "6 3 - 2 ^ 11 -";
//        String test2 = "2 3 11 + 5 - *";
//        String[] eq = test1.split(" ");
//        String[] eq = test2.split(" ");
//        System.out.println(Arrays.toString(eq));

        calculatePostfix(eq);
        System.out.println("Final Result: " + stack.peek());

    }
}
