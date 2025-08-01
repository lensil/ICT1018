public class Question8 {
    public static void main(String[] args) {
        /* Test Driver */
        System.out.println("Square root of 90 is " + square_root_approx(90));
        System.out.println("Square root of 4 is " + square_root_approx(4));
        System.out.println("Square root of 2 is " + square_root_approx(2));
        System.out.println("Square root of 100 is " + square_root_approx(100));
        System.out.println("Square root of 27 is " + square_root_approx(27));
        System.out.println("Square root of 198 is " + square_root_approx(198));
    }

    // Approximates square root of number using Newton-Raphson method
    // Adapted from: https://www.geeksforgeeks.org/find-root-of-a-number-using-newtons-method/
    static double square_root_approx(double number) {

        double root; // stores root
        double approx = number; // assumes approximation as being equal to the number

        while (true) {
            root = 0.5 * (approx + (number/approx)); // recalculate root approximation

            // If the difference between the current root and the previous approximation is 0 stop
            if (Math.abs(root-approx) == 0) {
                break;
            }

            approx = root; // store current approximation for next iteration
        }

        return root;
    }
}