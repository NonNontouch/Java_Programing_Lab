import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Pro2 {
    public static void main(String[] args) {
         
        int countlist1,countlist2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter list1 : ");
        countlist1=keyboard.nextInt();
        int[] list1 = new int[countlist1];
        for (int i = 0; i < countlist1; i++) {
            list1[i] = keyboard.nextInt();
        }
        System.out.print("Enter list2 : ");
        countlist2=keyboard.nextInt();
        int[] list2 = new int[4];
        for (int i = 0; i < countlist2; i++) {
            list2[i] = keyboard.nextInt();
        }
        keyboard.close();
        int[] ans = new int[countlist1+countlist2];
        ans=merge(list1, list2, countlist1, countlist2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] merge(int[] list1, int[] list2,int countlist1,int countlist2) {
        int[] ans = new int[countlist1+countlist2];
        System.arraycopy(list1, 0, ans, 0, countlist1);
        System.arraycopy(list2, 0, ans, countlist1, countlist2);  
        Arrays.sort(ans);
        return ans;
    }
}
