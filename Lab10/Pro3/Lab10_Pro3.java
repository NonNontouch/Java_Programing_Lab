package Pro3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Lab10_Pro3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text.txt");
        String rank;
        double salary;
        if (file.exists()) {
            System.out.println("File " + file.getName() + " already exists");
            System.exit(0);
        }
        
        try (PrintWriter output = new PrintWriter(file);) {
            for (int i = 1; i <= 1000; i++) {
                output.print("FirstName" + i + " LastName" + i);
                rank = getRank();
                salary = getSalary(rank);
                output.printf(" " + rank + " %.2f\n", salary);
            }
        }

    }

    public static String getRank() {
        Random rand = new Random();
        String[] ranks = { "assistant", "associate", "full" };
        return ranks[rand.nextInt(3)];
    }

    public static double getSalary(String rank) {
        Random rand = new Random();
        if (rank.equals("assistant")) {
            return 50000 + rand.nextDouble(30001);
        }

        else if (rank.equals("associate")) {
            return 60000 + rand.nextDouble(50001);
        }

        else {
            return 75000 +rand.nextDouble(55001);
        }
    }
}
