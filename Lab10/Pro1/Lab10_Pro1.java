package Pro1;

import java.util.Random;
import java.util.Scanner;

public class Lab10_Pro1 {
    public static void main(String[] args) {
        int[] num = new int[100];
        Random rand = new Random();
        int userinput;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            num[i]=rand.nextInt(101);
        }
        while(true){
            try{
                System.out.print("Input : ");
                userinput=input.nextInt();
                if(userinput>=0&&userinput<100)
                {
                    System.out.println("Output : "+num[userinput]);
                }
                else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Out of Bounds.");
                break;
            }            
        }
    }
}