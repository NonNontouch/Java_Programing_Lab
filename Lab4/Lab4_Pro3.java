import java.util.Random;

public class Lab4_Pro3 {
    public static void main(String[] args) {
        double[] num = new double[1000];
        StopWatch SW = new StopWatch();
        Random rand = new Random();
        System.out.println("Creating a list containing 1000 elemants,");
        for (int i = 0; i < 1000; i++) {
            num[i] = rand.nextDouble() * 1000;
            System.out.printf("%.2f\t\t", num[i]);
            if (i % 4 == 1&&i!=0) {
                System.out.print("\n");
            }
        }
        System.out.print("\nList created.\nSorting stopwatch starts...\n");
        SW.start();
        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {
                Double temp;
                if (num[j] < num[i]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%.2f\t\t", num[i]);
            if (i % 4 == 1&&i!=0) {
                System.out.print("\n");
            }
        }
        SW.stop();
        System.out.print("\nSorting stopwatch stoped.");   
        System.out.print("\nThe sort time is "+SW.getElapsedTime()+" milliseconds.\n");
        System.out.print("--------------------------------------------------------------------------------\n");
        System.out.print("The palindromPrime stopwatch starts...\n");
        SW.start();
        int count = 0, palinnum = 2;
        do {
            if (isPrime(palinnum)&&isPalindromic(palinnum)) 
            {
                System.out.print(palinnum+"\t");
                count++;
                if(count%10==0) 
                {
                    System.out.print("\n");
                }
            }
            palinnum++;
        } while (count<100);
        SW.stop();
        System.out.print("PalindromePrime crated.\nThepalindromPrime stopwatch stoped.\n");
        System.out.print("The palindromPrime time is "+SW.getElapsedTime()+" milliseconds.");
    }
    public static boolean isPrime(int n) {
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean isPalindromic(int n) {
        int temp = n, q, sum = 0;
        while (n > 0) {
            q = n % 10;
            sum = (sum * 10) + q;
            n /= 10;
        }
        if(temp==sum)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
