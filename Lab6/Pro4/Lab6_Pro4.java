package Pro4;

import java.util.Scanner;

public class Lab6_Pro4 {
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
        status = keyboard.nextShort();
        System.out.print("Enter the income: ");
        income = keyboard.nextInt();
        System.out.println("Tax is : " + calculatetax(income, status));
    }

    public static double calculatetax(int income, int status) {
        double tax=0;
        double[] rate = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.36 };
        int[][] brackets = {
                { 8350,33950,82250,171550,372950 },
                { 16700, 67900, 137050, 20885, 372950 },
                {8350, 3395, 68525, 104425, 186475 },
                { 11950, 45500, 117450, 190200, 372950 } };
        if(income<=brackets[status][0])
        {
            tax=income*0.10;
        }
        else if(income<=brackets[status][1])
        {
            tax=brackets[status][0]*0.1+(income-brackets[status][0])*0.15;
        }
        else if(income<=brackets[status][2])
        {
            tax=brackets[status][0]*0.1+(brackets[status][1]-brackets[status][0])*0.15+(income-brackets[status][1])*0.25;
        }
        else if(income<=brackets[status][3])
        {
            tax=brackets[status][0]*0.1+(brackets[status][1]-brackets[status][0])*0.15+(brackets[status][2]-brackets[status][1])*0.25+(income-brackets[status][2])*0.28;
        }
        else if(income<=brackets[status][4])
        {
            tax=brackets[status][0]*0.1+(brackets[status][1]-brackets[status][0])*0.15+(brackets[status][2]-brackets[status][1])*0.25+(brackets[status][3]-brackets[status][2])*0.28+(income-brackets[status][3])*0.33;
        }
        else 
        {
            tax=brackets[status][0]*0.1+(brackets[status][1]-brackets[status][0])*0.15+(brackets[status][2]-brackets[status][1])*0.25+(brackets[status][3]-brackets[status][2])*0.28+(brackets[status][4]-brackets[status][3])*0.33+(income-brackets[status][4])*0.35;
        }
        return tax;
    }
}
