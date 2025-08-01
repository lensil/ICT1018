import java.util.HashMap;
public class Question9 {
    public static void main(String[] args) {
        /* Test Driver */
        int array1[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Checking array1...");
        print_repeated(repeated_numbers(array1));
        System.out.println();

        int array2[] = {1, 1, 1, 1, 1, 1};
        System.out.println("Checking array2...");
        print_repeated(repeated_numbers(array2));
        System.out.println();

        int array3[] = {1, 2, 2, 4, 5, 6, 6, 9};
        System.out.println("Checking array3...");
        print_repeated(repeated_numbers(array3));
        System.out.println();

        int array4[] = {1, 2, 3, 1, 4, 5, 3, 6, 7, 8, 2};
        System.out.println("Checking array4...");
        print_repeated(repeated_numbers(array4));
        System.out.println();
    }

    // Check which numbers in an array are repeated or not
    static HashMap<Integer, Boolean> repeated_numbers(int array[]) {
        // stores numbers and if they are repeated or nopt
        HashMap<Integer, Boolean> repeated = new HashMap<>();

        // iterate through all numbers in the array
        for (int number: array) {
            // if not in hashmap
            if (repeated.get(number) == null) {
                repeated.put(number, false); // set number as not repeated
            } else { // if already in hashmap
                repeated.replace(number, false, true); // set number as repeated
            }
        }
        return repeated;
    }

    // Prints whether number is repeated or not
    static void print_repeated (HashMap<Integer, Boolean> map) {
        for (int number: map.keySet()) { //iterate through all numbers in hashmap and see if they are repeated or not
            if (map.get(number)) { // if repeated
                System.out.println(number + " is repeated");
            } else { // if not repeated
                System.out.println(number + " is not repeated");
            }
        }
    }
}