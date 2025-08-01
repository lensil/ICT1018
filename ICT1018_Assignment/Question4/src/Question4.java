import java.util.ArrayList;
import java.util.HashMap;

public class Question4 {
    public static void main(String[] args) {
        /* Test Driver */
        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        HashMap<Integer, ArrayList<Integer>> product_multiples1 = new HashMap<>();
        find_multiples(array1, product_multiples1);
        System.out.println("Multiples in array1...");
        print_multiples(product_multiples1);
        System.out.println("\n");

        int array2[] = {2, 2, 3, 4, 4, 5, 6};
        HashMap<Integer, ArrayList<Integer>> product_multiples2 = new HashMap<>();
        find_multiples(array2, product_multiples2);
        System.out.println("Multiples in array2...");
        print_multiples(product_multiples2);
        System.out.println("\n");

        int array3[] = {124, 893, 796, 217, 922, 1013, 156, 135, 544, 55, 81, 381, 526, 86, 886, 779, 296, 296};
        HashMap<Integer, ArrayList<Integer>> product_multiples3 = new HashMap<>();
        find_multiples(array3, product_multiples2);
        System.out.println("Multiples in array3...");
        print_multiples(product_multiples3);
        System.out.println("\n");

    }

    // Prints multiples
    static void print_multiples(HashMap<Integer, ArrayList<Integer>> multiples) {
        // go through all the key-value pairs in the hashmap
        for (int multiple : multiples.keySet()) {
            ArrayList<Integer> multiple_pairs =  multiples.get(multiple);
            // if there are at least to pairs of numbers which multiply to the same number
            // print all pair combinations
            if (multiple_pairs.size() >= 4) {
                System.out.println("Multiple pairs for " + multiple + ":");
                for (int i = 0; i < multiple_pairs.size()-2; i+=2) {
                    for (int j = i+2 ; j < multiple_pairs.size(); j+=2) {
                        System.out.println(multiple_pairs.get(i) + " * " + multiple_pairs.get(i+1) + " = " + multiple_pairs.get(j) + " * " + multiple_pairs.get(j+1));
                    }
                }
            }
        }
    }

    // stores all products and their multiples in a hashmap
    // key is product
    // values is an array of all its products
    static void find_multiples(int array[], HashMap<Integer, ArrayList<Integer>> multiples) {
        // multiply every element in the array with each other to find the products
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                int product = array[i] * array[j];
                // if product is already in the hashmap
                if (multiples.containsKey(product)) {
                    // skip any repeated multiples that are already added
                    if (multiples.get(product).contains(array[i]) || multiples.get(product).contains(array[j])) {
                        continue;
                    }
                    multiples.get(product).add(array[i]);
                    multiples.get(product).add(array[j]);
                } else { // add new product and multiples to hashmap
                    ArrayList<Integer> multiple_pair = new ArrayList<>();
                    multiple_pair.add(array[i]);
                    multiple_pair.add(array[j]);
                    multiples.put(product, multiple_pair);
                }
            }
        }
    }
}