package Postfix;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotationCalculator {
    private static Stack stack = new Stack();
    private static int firstOperator;
    private static int secondOperator;

    public static void calculatePostfix(String[] eq){
        for (int i = 0; i < eq.length; i++) {
            switch(eq[i]){
                case "+":
                    secondOperator = stack.pop();
                    firstOperator = stack.pop();
                case "-":
                    secondOperator = stack.pop();
                    firstOperator = stack.pop();
                case "*":
                    secondOperator = stack.pop();
                    firstOperator = stack.pop();
                case "/":
                    secondOperator = stack.pop();
                    firstOperator = stack.pop();
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your equation: ");
        String[] eq = sc.nextLine().split(" ");

        System.out.println(Arrays.toString(eq));

    }
}
