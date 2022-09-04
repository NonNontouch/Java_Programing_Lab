package Pro4;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Lab10_Pro4 {
    public static double assistantsalry=0;   
    public static double associatesalary=0;
    public static double fullprosalary=0;
    public static int countassistant=0,countassociate=0,countfullpro=0;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.java");
        String rank;
        double salary;
        if (file.exists()) {
            System.out.println("File " + file.getName() + " already exists");
            System.exit(0);
        }
        
        try (PrintWriter output = new PrintWriter(file);) {
            for (int i = 1; i <= 10; i++) {
                output.print("FirstName" + i + " LastName" + i);
                rank = getRank();
                salary = getSalary(rank);
                output.printf(" " + rank + " %.2f\n", salary);
            }
            output.printf("Total salary for assistant professor is %.2f%n",assistantsalry);
            output.printf("Total salary for associate professor is %.2f%n",associatesalary);
            output.printf("Total salary for full professor is %.2f%n",fullprosalary);
            output.printf("Total salary for all professor is %.2f%n",assistantsalry+associatesalary+fullprosalary);
            output.printf("Average salary for assistant professor is  %.2f%n",assistantsalry/countassistant);
            output.printf("Average salary for associate professor is  %.2f%n",associatesalary/countassociate);
            output.printf("Average salary for full professor is  %.2f%n",fullprosalary/countfullpro);
            output.printf("Average salary for all professor is  %.2f%n",(assistantsalry+associatesalary+fullprosalary)/(countassociate+countassistant+countfullpro));
        }

    }

    public static String getRank() {
        Random rand = new Random();
        String[] ranks = { "assistant", "associate", "full" };
        return ranks[rand.nextInt(3)];
    }

    public static double getSalary(String rank) {
        Random rand = new Random();
        double num;
        if (rank.equals("assistant")) {
            num=50000 + rand.nextDouble(30001);
            assistantsalry+=num;
            countassistant++;
            return num;
        }

        else if (rank.equals("associate")) {
            num=60000 + rand.nextDouble(50001);
            associatesalary+=num;
            countassociate++;
            return num;
        }

        else {
            num=75000 +rand.nextDouble(55001);
            fullprosalary+=num;
            countfullpro++;
            return num;
        }
        
    }
}
