package Pro6;

import java.util.Scanner;

public class Lab6_Pro6 {
    public static void main(String[] args) {
        int id,input=0;
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Enter an id : ");
        id = keyboard.nextInt();
        Account user = new Account(id);
        while (input!=4)
        {
            System.out.println("Main menu");
            System.out.println("1. check balance");
            System.out.println("2. withdraw");
            System.out.println("3. deposit");
            System.out.println("4. exit");
            System.out.print("Enter a choice : ");
            input = keyboard.nextInt();
            if(input == 1 )
            {
                System.out.println(user.checkbalance());
            }
            else if(input ==2)
            {
                user.withdraw();
            }
            else if(input == 3)
            {
                user.deposit();
            }
        }
        System.out.print("End of this Program");

    }
}
