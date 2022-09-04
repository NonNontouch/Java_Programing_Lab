public class Lab3_Pro1 {
    public static void main(String[] args) {
        int count = 0, num = 2;
        do {
            if (isPrime(num)&&isPalindromic(num)) 
            {
                System.out.print(num+" ");
                count++;
                if(count%10==0)
                {
                    System.out.print("\n");
                }
            }
            num++;
        } while (count<100);
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
