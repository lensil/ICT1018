public class Question3 {
    public static void main(String[] args) {
        /* Test driver */
        int array1[] = {5, 3, 1, 2, 9};
        System.out.println("Checking array1...");
        extreme_points(array1);
        System.out.println();

        int array2[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Checking array2...");
        extreme_points(array2);
        System.out.println();

        int array3[] = {1, 2, 3, 5, 4};
        System.out.println("Checking array3...");
        extreme_points(array3);
        System.out.println();

        int array4[] = {9, 2, 4, 6, 3};
        System.out.println("Checking array4...");
        extreme_points(array4);
        System.out.println();

        int array5[] = {5, 4, 3, 2, 1};
        System.out.println("Checking array5...");
        extreme_points(array5);
        System.out.println();
    }

    // Checks array for extreme points
    static void extreme_points(int array[]) {
        boolean sorted = true; // keeps track of whether array has any extreme points or not
        // check all elements in the array except the first and last
        for (int i = 1; i < array.length-1; i++) {
            // compare current element with previous and subsequent element
            if (array[i-1] > array[i] || array[i] > array[i+1]) {
                // if element before it is larger or element after it is smaller
                sorted = false; // set sorted to false
                System.out.println(array[i]); //print element
            }
        }
        // if sorted is true
        if (sorted) {
            System.out.println("SORTED");
        }
    }
}