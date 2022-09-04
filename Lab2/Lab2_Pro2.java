import java.util.Random;
import java.util.Scanner;

public class Lab2_Pro2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int Pinput, Crand;
        String player = "", com = "";
        System.out.print("scissor (0), rock (1), paper (2): ");
        Pinput = keyboard.nextByte();
        keyboard.close();
        Crand = (int) (Math.random() * 3);
        switch (Crand) {
            case 0: {
                com = "scissor";
                break;
            }
            case 1: {
                com = "rock";
                break;
            }
            case 2: {
                com = "paper";
                break;
            }
        }
        switch (Pinput) {
            case 0: {
                player = "scissor";
                break;
            }
            case 1: {
                player = "rock";
                break;
            }
            case 2: {
                player = "paper";
                break;
            }
        }
        if ((Crand == 2 && Pinput == 0) || (Crand == 1 && Pinput == 2) || (Crand == 0 && Pinput == 1)) {
            System.out.printf("The Computer is %s.You are %s. You won", com, player);
        } else if (Crand == Pinput) {
            System.out.printf("The Computer is %s.You are %s. It's a draw", com, player);
        } else {
            System.out.printf("The Computer is %s.You are %s. You lose", com, player);
        }

    }
}
