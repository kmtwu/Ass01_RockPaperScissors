//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String player1;
        String player2;
        String YorN = "Y";
        boolean p1 = false;
        boolean p2 = false;
        Scanner in = new Scanner(System.in);
        while (YorN.equals("Y")) {
            do {
                System.out.println("Enter player 1's move. R/P/S or r/p/s");
                player1 = in.next();
                if (player1.equals("R") || player1.equals("P") || player1.equals("S") || player1.equals("r") || player1.equals("p") || player1.equals("s")) {
                    p1 = true;
                    in.nextLine();
                } else {
                    System.out.println("Invalid move!");
                    in.nextLine();
                }
            } while (!p1);
            do {
                System.out.println("Enter player 2's move. R/P/S or r/p/s");
                player2 = in.next();
                if (player2.equals("R") || player2.equals("P") || player2.equals("S") || player2.equals("r") || player2.equals("p") || player2.equals("s")) {
                    p2 = true;
                    in.nextLine();
                } else {
                    System.out.println("Invalid move!");
                    in.nextLine();
                }
            } while (!p2);
            if (player1.equals("R") || player1.equals("r")) {
                if (player2.equals("P") || player2.equals("p")) {
                    System.out.println("Paper covers rock so player 2 wins");
                } else if (player2.equals("R") || player2.equals("r")) {
                    System.out.println("Rock does nothing to rock so it's a tie");
                } else {
                    System.out.println("Rock smashes scissors so player 1 wins");
                }
            } else if (player1.equals("P") || player1.equals("p")) {
                if (player2.equals("R") || player2.equals("R")) {
                    System.out.println("Paper covers rock so player 1 wins");
                } else if (player2.equals("P") || player2.equals("p")) {
                    System.out.println("Paper does nothing to paper so it's a tie");
                } else {
                    System.out.println("Scissors cuts paper so player 2 wins");
                }
            } else {
                if (player2.equals("P") || player2.equals("p")) {
                    System.out.println("Scissors cuts paper so player 1 wins");
                } else if (player2.equals("R") || player2.equals("r")) {
                    System.out.println("Rock smashed scissors so player 2 wins");
                } else {
                    System.out.println("Scissors do nothing to scissors so it's a tie");
                }
            }
            System.out.println("Would you like to play again? Y/N");
            YorN = in.next();
            p1 = false;
            p2 = false;
        }
    }
}