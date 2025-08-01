public class Question12 {
    public static void main(String[] args) {
        /* Test driver */
        System.out.println("The sum of the first 5 fibonacci numbers is: " + fibonacci_sum(5));
        System.out.println("The sum of the first 2 fibonacci numbers is: " + fibonacci_sum(2));
        System.out.println("The sum of the first 1 fibonacci numbers is: " + fibonacci_sum(1));
        System.out.println("The sum of the first 10 fibonacci numbers is: " + fibonacci_sum(10));
        System.out.println("The sum of the first 15 fibonacci numbers is: " + fibonacci_sum(15));
    }

    // Returns sum of fibonacci sequence
    static int fibonacci_sum(int n) {
        int sum = 0; // Stores sum of fibonacci sequence

        // fn_2 and fn_1 store the previous two numbers in the sequence
        int fn_2;
        int fn_1 = 0;

        int fn = 1; // store current number of the sequence

        // Calculates the sum until the last number in the sequence is reached
        while (n > 1) {
            sum += fn; // add current number to sum
            fn_2 = fn_1; // move fn_1 to fn_2
            fn_1 = fn; // set current number as previous number
            fn = fn_2 + fn_1; // update current fibonacci number
            n--; // decrement counter
        }
        // Calculates last number and adds it to the sum
        sum += fn;

        return sum;
    }
}