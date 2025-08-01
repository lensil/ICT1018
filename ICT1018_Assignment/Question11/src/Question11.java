public class Question11 {
    public static void main(String[] args) {
        /* Test Driver */
        System.out.println("cos(-4) = " + cosine_sine(10, -4, 'c'));
        System.out.println("sin(6) = "+ cosine_sine(47, 6, 's'));
        System.out.println("cos(π/2) = " + cosine_sine(5, Math.PI/2, 'c'));
        System.out.println("sin(π/4) = "+ cosine_sine(6, Math.PI/4, 's'));
        System.out.println("cos(0.5) = " + cosine_sine(20, 0.5, 'c'));
        System.out.println("sin(-0.5) = "+ cosine_sine(36, -0.5, 's'));
    }

    // finds cosine or sine value using the maclaurin series
    static double cosine_sine (int r, double x, char t) {
        double cosine_sine = 0; // store cosine or sine value
        float factorial = 1; // store factorial

        // if calculating the cosine
        if (t == 'c') {
            cosine_sine = 1; // first number in series is 1
            for (int i = 1; i <= r; i++) { // find the specified number of terms
                factorial *= (2*i) * (2*i-1); // calculate the factorial
                cosine_sine += Math.pow((-1), i) * (Math.pow(x, (2*i))/factorial); // sum cosine mclaurin series terms
            }
        } else if (t == 's') { // if calculating the sine
            cosine_sine = x; // first number in series is equal to x
            for (int i = 1; i <= r; i++) { // find the specified number of terms
                factorial *= (2*i) * ((2*i)+1); // calculate the factorial
                cosine_sine += Math.pow((-1), i) * (Math.pow(x, (2*i)+1)/factorial); // sum sine mclaurin series terms
            }
        }
        return cosine_sine;
    }
}