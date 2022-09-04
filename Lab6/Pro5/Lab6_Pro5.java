package Pro5;

import java.util.Scanner;

public class Lab6_Pro5 {
    public static void main(String[] args) {
        short status;
        int income;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Filing Status");
        System.out.println("\t[0]-Single filer");
        System.out.println("\t[1]-Married jointly or qualifying widow(er)");
        System.out.println("\t[3]-Married separatedly");
        System.out.println("\t[4]-Head of household");
        System.out.print("Enter the filing status: ");
        status=keyboard.nextShort();
        System.out.print("Enter the filing income: ");
        income=keyboard.nextInt();
        tax user = new tax(income, status);
        System.out.print("Your tax is : "+ user.gettax());
        keyboard.close();
    }
}
