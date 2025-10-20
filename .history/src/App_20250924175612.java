import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
            
        System.out.println("Tervetuloa pelaamaan LUCKY7!");
        while(true) {
            numero1 = r.nextInt(10)+1;
            numero2 = r.nextInt(10)+1;
            numero3 = r.nextInt(10)+1;

            System.out.println("Arvon sinulle 3 numeroa...");

            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);
            break;
        }
       }
  }