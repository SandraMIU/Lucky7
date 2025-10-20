import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int kayttajaRaha = 5;
        String vastaus;
            
        System.out.println("Tervetuloa pelaamaan LUCKY7!");
        while(true) {
            numero1 = r.nextInt(10)+1;
            numero2 = r.nextInt(10)+1;
            numero3 = r.nextInt(10)+1;

            System.out.println("Arvon sinulle 3 numeroa...");

            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);

            kayttajaRaha = kayttajaRaha-1;

           if(numero1 == 7 || numero2 == 7 || numero3 == 7) {
            System.out.println("Sait onnenseiskan :)");
            kayttajaRaha = kayttajaRaha+2;
            
            if((numero1 == 7 && numero2 == 7) || (numero2 == 7 && numero3 == 7) || (numero1 == 7 && numero3 ==7)){
                kayttajaRaha = kayttajaRaha+3;
            }
            if(numero1 == 7 && numero2 == 7 && numero3 == 7) {
                kayttajaRaha = kayttajaRaha+5;
            }
           }
           System.out.println("Sinulla on jäljellä " + kayttajaRaha + " euroa.");
           if(kayttajaRaha == 0) {
            System.err.println("Rahat loppu :(");
            break;
           }
           System.out.println("Kokeillaanko uudestaan? Kyllä/Ei");
           vastaus = in.nextLine();
           if(vastaus.equals("Ei")) {
            break;
           }

        }
        System.out.println("Hyvä peli!");

       }
  }