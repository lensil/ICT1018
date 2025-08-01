import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        /* Test Driver */

        // testing isprime function
        System.out.println("Testing isprime() function...");
        for (int i = 2; i <= 20; i++) {
            if (isprime(i)) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is not prime");
            }
        }
        System.out.println();

        // testing sieve of eratosthenes
        System.out.println("Testing sieve_of_eratosthenes() function...");
        boolean primes[] = sieve_of_eratosthenes(20);
        for (int i = 2; i < primes.length; i++) {
            if(primes[i]) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is not prime");
            }
        }

    }

    // check if a number is prime
    static boolean isprime(int n) {
        // true if number is prime, false if not prime
        boolean prime = true;
            // loop through all numbers bigger than 1 and smaller or equal to half of the number
            for (int i = 2; i <= n/2; i++) {
                // check if number is divisable by i
                if (n % i == 0) {
                    prime = false; // if remainder is 0, number isn't prime
                    break; // no need to continue looping
                }
            }
        return prime;
    }

    // Sieve of Eratosthenes algorithm
    // Adapted from: https://www.geeksforgeeks.org/sieve-of-eratosthenes/
    static boolean[] sieve_of_eratosthenes (int n) {
        boolean prime_numbers[] = new boolean[n+1]; // stores whether the number at an index is prime or not
        Arrays.fill(prime_numbers, true); // initialise all numbers to true

        // set 0 and 1 as not being prime numbers
        prime_numbers[0] = false;
        prime_numbers[1] = false;

        // starting with 2 since it is the first prime number
        for (int i = 2; i*i <= n; i++) {
            if(prime_numbers[i]) {
                // mark all multiples of i as false since they are not primes
                for(int j = i*i; j <= n; j = j + i) {
                    prime_numbers[j] = false;
                }
            }
        }

        return prime_numbers;
    }
}