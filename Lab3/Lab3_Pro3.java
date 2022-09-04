import java.util.Scanner;

public class Lab3_Pro3 {
    public static void main(String[] args) {
        int size;
        boolean flagrow = false, flagcolumn = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the size for the matrix : ");
        size = keyboard.nextInt();
        int[][] matrix = new int[size][size];
        keyboard.close();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 10) % 2;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < size; i++) {
            int count0 = 0, count1 = 0;

            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 0) {
                    count0++;
                } else {
                    count1++;
                }
                if (count0 == size) {
                    System.out.println("All 0s on row " + i);
                    flagrow = true;
                    count0 = 0;
                    count1 = 0;
                } else if (count1 == size) {
                    System.out.println("All 1s on row " + i);
                    flagrow = true;
                    count0 = 0;
                    count1 = 0;
                }
            }
        }
        if (!flagrow) {
            System.out.println("No same numbers on a row");
        }
        for (int i = 0; i < size; i++) {
            int count0 = 0, count1 = 0;
            for (int j = 0; j < size; j++) {
                if (matrix[j][i] == 0) {
                    count0++;
                } else {
                    count1++;
                }
                if (count0 == size) {
                    System.out.println("All 0s on column " + i);
                    flagcolumn = true;
                    count0 = 0;
                    count1 = 0;
                }
                else if(count1==size)
                {
                    System.out.println("All 1s on column " + i);
                    flagcolumn = true;
                    count0 = 0;
                    count1 = 0;
                }
            }
        }
        if (!flagcolumn) {
            System.out.println("No same numbers on a column");
        }

    }
}
