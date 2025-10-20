import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          



        Random r = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain;

            do {
            System.out.println("VOITATKO ONNENSEISKAN...");
            System.out.println(r.nextInt(10)+1);
            System.out.println("Uudestaan? (y/n)");
            playAgain = in.nextLine();
            } while (playAgain.equalsIgnoreCase("y"));

             System.out.println("Kiitos pelaamisesta!");



             

       }
  }