import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Question7 {
    public static void main(String[] args) throws IOException {
        // create and open file
        File collatzCSV = new File("Collatz.csv");

        FileWriter writer = new FileWriter(collatzCSV);

        // loop through all numbers between 2 and 512 and find their collatz sequence
        // write sequence to CSV file
        for (int i = 2; i <= 512; i++) {

            int collatz_num = i;

            // add collatz sequence for i
            writer.append(Integer.toString(collatz_num));

            // keep repeating collatz rules until number is equal to 1
            // add number to csv file each time
            while (collatz_num != 1) {
                writer.append(','); // seperate values by a comma
                if (collatz_num % 2 == 0) { // if even
                    collatz_num = collatz_num/2;

                } else { // if odd
                    collatz_num = (3 * collatz_num) + 1;
                }
                writer.append(Integer.toString(collatz_num));
            }

            writer.append('\n');
            writer.flush();
        }
        writer.close(); //close file
    }
}