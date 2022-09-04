import java.util.Scanner;

public class Pro3_64011160 {
    public static void main(String[] args) {
        int inputnum,sum=0;
        Scanner keyboard = new Scanner(System.in);
        try
        {
            do
           { 
               System.out.print("Input number beween 1-1000 : ");
               inputnum=keyboard.nextInt();
            }while(inputnum<1 || inputnum>1000);
        }finally
        {
            keyboard.close();
        }
        do 
        {
            sum+=inputnum%10;
            inputnum/=10;
        }while(inputnum>0);
        System.out.println("The sum of all digits is "+sum);
    }
}
