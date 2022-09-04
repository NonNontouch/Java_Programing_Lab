import java.util.Scanner;

public class Lab2_Pro4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String City1, City2, City3,City0;
        System.out.print("Enter first city : ");
        City1=keyboard.next();
        System.out.print("Enter secound city : ");
        City2=keyboard.next();
        System.out.print("Enter third city : ");
        City3=keyboard.next();
        keyboard.close();
        if(City2.compareTo(City3)<0&&City2.compareTo(City1)<0) 
        {
            City0=City2;
            City2=City1;
            City1=City0;
        }
        if(City3.compareTo(City2)<0&&City3.compareTo(City1)<0)
        {
            City0=City3;
            City3=City1;
            City1=City0;
        }
        if(City3.compareTo(City2)<0)
        {
            City0=City3;
            City3=City2;
            City2=City0;
        }
        System.out.print("The three cities in alphabetical order are "+City1+" "+City2+" "+City3);
    }
}
