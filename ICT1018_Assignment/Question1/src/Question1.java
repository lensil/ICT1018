import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        /* Test Driver */
        int[] A = new int[256]; // first array
        random_array(256, A); // populate array with random numbers
        int[] B = new int[257]; // create second array
        random_array(257, B); // populate array with random numbers

        // Perform shell sort on array A
        System.out.println("Array A before shell sort:");
        print_array(A, 256);
        shell_sort(A, 256);
        System.out.println();
        System.out.println("Array A after shell sort: ");
        print_array(A, 256);

        System.out.println();
        System.out.println();

        // Perform quick sort on array B
        System.out.println("Array B before quick sort:");
        print_array(B, 257);
        quick_sort(B, 0, 256);
        System.out.println();
        System.out.println("Array B after quick sort: ");
        print_array(B, 257);

    }

    //prints array
    static void print_array(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Populates an array with random numbers from 0 to 1024
    static void random_array(int n, int arr[]) {
        Random rn = new Random();

        // generate random number for each index in the array
        for (int i = 0; i < n; i++) {
            arr[i] = rn.nextInt(0, 1024);
        }
    }

    //Shell sort algorithm
    // Adapted from: https://www.geeksforgeeks.org/shellsort/
    static void shell_sort(int A[], int size) {
        int gap = size / 2; // sets initial gap size to half the array length

        // while there is a gap of at least 1 between each element
        while (gap > 0) {
            // perform insertion sort but with the specified gap
            for (int i = gap;  i < size; i++) {
                int j = i;
                int temp = A[i];
                // find correct position for A[i]
                // compare elements at the specified gap
                // shift elements larger than temp down the array by the specified gap
                while (j >= gap) {
                    if (temp > A[j-gap]) { // break if temp is in its correct position
                        break;
                    }
                    A[j] = A[j-gap];
                    j -= gap;
                }
                A[j] = temp; // put element a[i] to its correct position
            }
            gap = gap / 2; // half the gap after each iteration
        }
    }

    // Quick sort algorithm
    // Adapted from: https://www.geeksforgeeks.org/quicksort-using-random-pivoting/
    static void quick_sort(int array[], int start, int end) {
        if (start < end) { //continuously sort array while partitioned array is larger than one
            Random rn = new Random();
            swap(array, rn.nextInt(end - start) + start, end); // choose random number as pivot and put it lass
            int p = partition(array, start, end); // call partition function
            quick_sort(array, start, p - 1); //recursively call quick_sort function on left part of previously partitioned array
            quick_sort(array, p + 1, end); //recursively call quick_sort function on right part of previously partitioned array
        }
    }

    // Partition function for quick sort
    static int partition(int array[], int start, int end) {
        int pivot = array[end]; // find the pivot

        int x = start; //set to the starting index of the partition

        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) { // put elements smaller than or equal to the pivot to the left
                swap(array, i, x);
                x++;
            }
        }
        swap(array, x, end); //put pivot to its correct place
        return x;
    }


    // swaps to elements in an array
    static void swap(int array[], int index1, int index2) {
        int temp = array[index1]; // save index temporarily for swap
        array[index1] = array[index2]; //set element at index1 equal to element at index2
        array[index2] = temp; //set element at index 2 as being equal to the temp variable
    }
}

    /*static ArrayList<Integer> merge_sort (ArrayList<Integer> array_1, ArrayList<Integer> array_2) {
        // stores merged array
        ArrayList<Integer> merge_array = new ArrayList<>();
        int i = 0, j = 0;

        while (i < array_1.size() && j < array_2.size()) {
            if (array_1.get(i) <= array_2.get(j)) {
                merge_array.add(array_1.get(i));
                i++;
            } else {
                merge_array.add(array_2.get(j));
                j++;
            }
        }

        for (int k = i; k < array_1.size(); k++) {
            merge_array.add(array_1.get(k));
        }

        for (int k = j; k < array_2.size(); k++) {
            merge_array.add(array_2.get(k));
        }

        return merge_array;
    }*/
