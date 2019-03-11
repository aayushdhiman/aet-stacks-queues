package BalancingParenthesis;

import java.util.*;

public class BalancingParenthesis {
	
	private static Stack stack = new Stack();
	
	public static void balanceEquation(String[] e) {
		for (int i = 0; i < e.length; i++) {package BalancingParenthesis;

import java.util.*;

public class BalancingParenthesis {

    private static Stack stack = new Stack();

    /**
     * Checks if the equation is balanced by pushing and popping parenthesis off of the stack.
     * @param e the equation to check for balance
     */
    public static void balanceEquation(String[] e) {
        for (int i = 0; i < e.length; i++) {
            if (e[i].equals("(")) {
                stack.push("(");
            } else if (e[i].equals("[")) {
                stack.push("[");
            } else if (e[i].equals("{")) {
                stack.push("{");
            } else if (e[i].equals(")")) {
                if (!stack.empty()) {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        System.out.println("Formula is not balanced.\n");
                        return;
                    }
                } else {
                    System.out.println("Formula is not balanced.\n");
                    return;
                }
            } else if (e[i].equals("]")) {
                if (!stack.empty()) {
                    if (stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        System.out.println("Formula is not balanced.\n");
                        return;
                    }
                } else {
                    System.out.println("Formula is not balanced.\n");
                    return;
                }
            } else if (e[i].equals("}")) {
                if (!stack.empty()) {
                    if (stack.peek().equals("{")) {
                        stack.pop();
                    } else {
                        System.out.println("Formula is not balanced.\n");
                        return;
                    }
                } else {
                    System.out.println("Formula is not balanced.\n");
                    return;
                }
            }
        }
        if (stack.empty()) {
            System.out.println("Formula is balanced.\n");
        } else {
            System.out.println("Formula is not balanced.\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your equation: ");
            String equation = sc.nextLine();

            if (equation.equalsIgnoreCase("")) {
                System.out.println("Empty input, program complete.");
                return;
            } else {
                String[] eq = equation.split("");
                balanceEquation(eq);
            }

        }

    }
}

			if (e[i].equals("(")) {
				stack.push("(");
			} else if (e[i].equals("[")) {
				stack.push("[");
			} else if (e[i].equals("{")) {
				stack.push("{");
			} else if (e[i].equals(")")) {
				if (!stack.empty()) {
					if (stack.peek().equals("(")) {
						stack.pop();
					} else {
						System.out.println("Formula is not balanced.\n");
						return;
					}
				} else {
					System.out.println("Formula is not balanced.\n");
					return;
				}
			} else if (e[i].equals("]")) {
				if (!stack.empty()) {
					if (stack.peek().equals("[")) {
						stack.pop();
					} else {
						System.out.println("Formula is not balanced.\n");
						return;
					}
				} else {
					System.out.println("Formula is not balanced.\n");
					return;
				}
			} else if (e[i].equals("}")) {
				if (!stack.empty()) {
					if (stack.peek().equals("{")) {
						stack.pop();
					} else {
						System.out.println("Formula is not balanced.\n");
						return;
					}
				} else {
					System.out.println("Formula is not balanced.\n");
					return;
				}
			}
		}
		if (stack.empty()) {
			System.out.println("Formula is balanced.\n");
		} else {
			System.out.println("Formula is not balanced.\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter your equation: ");
			String equation = sc.nextLine();
			
			if (equation.equalsIgnoreCase("")) {
				System.out.println("Empty input, program complete.");
				return;
			} else {
				String[] eq = equation.split("");
				balanceEquation(eq);
			}
			
		}
		
	}
}
