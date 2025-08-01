public class Question10 {
    public static void main(String[] args) {
        /* Test driver */
        int array1[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Largest number in array1 is " + get_largest(0, array1));
        System.out.println();

        int array2[] = {1, 9, 3, 11, 100, 21, 5, 8};
        System.out.println("Largest number in array2 is " + get_largest(0, array2));
        System.out.println();

        int array3[] = {9, 8, 7, 6, 5, 4};
        System.out.println("Largest number in array3 is " + get_largest(0, array3));
        System.out.println();

        int array4[] = {11, 5, 7, 21, 15};
        System.out.println("Largest number in array4 is " + get_largest(0, array4));
        System.out.println();

        int array5[] = {9, 3, 8, 6, 10, 4, 5};
        System.out.println("Largest number in array5 is " + get_largest(0, array5));
    }

    // recursively find the largest number in an array
    static int get_largest(int index, int array[]) {

        // base case
        // if last two elements in the array are reached
        if (index == array.length-2) {
            // return the largest between them
            return Math.max(array[index], array[index+1]);
        }

        // recursive case
        // return the largest between the number and the return value of the recursive call of the function
        return Math.max(get_largest(index+1, array), array[index]);
    }
}