import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /* Test driver and RPN evaluation */
        Stack stack = new Stack(); // create new stack object
        Scanner scanner = new Scanner(System.in); // create scanner

        // Get user input and perform RPN evaluation
        while (true) {
            System.out.println("Enter RPN expression to evaluate with values and operands seperated by a comma");
            System.out.println("Enter 'quit' to exit");
            String input = scanner.nextLine(); // get input from user
            if (input.equals("quit")) { // exit loop
                break;
            }
            String[] RPNexpression = input.split(","); // parse user input using comma
            for(String value: RPNexpression) { // go through parsed input and perform required action
                // if input is an operator
                switch (value) {
                    case "x" -> { // perform multiplication
                        // pop the two topmost elements in the stack
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(a * b); // add result back onto stack

                    }
                    case "+" -> { // perform addition
                        // pop the two topmost elements in the stack
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(a + b); // add result back onto stack

                    }
                    case "-" -> { // perform subtraction
                        // pop the two topmost elements in the stack
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(a - b); // add result back onto stack

                    }
                    case "/" -> { // perform division
                        // pop the two topmost elements in the stack
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b / a); // add result back onto stack

                    }
                    default ->  // if input is an operand
                            stack.push(Integer.valueOf(value)); // add operand to stack
                }
                stack.print_stack(); // print contents of the stack
            }
            stack.empty();
        }
    }
}