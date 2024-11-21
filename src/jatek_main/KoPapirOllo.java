package jatek_main;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author LUW72
 */
public class KoPapirOllo 
{

    public static void main(String[] args) 
    {
        System.out.println("Mit választasz?\n1. Kő\n2. Papír\n3. Olló\nVálasztásod (szöveggel): ");
        Scanner sc = new Scanner(System.in);
        String szoveg = sc.nextLine().toLowerCase();;
        
        while(szoveg.isEmpty() && szoveg.isBlank())
        {
            System.out.println("Kő/papír/olló, ide írd a tipped: ");
            szoveg = sc.nextLine().toLowerCase();
        }
 
        Random rnd = new Random();
        int randomszam = rnd.nextInt(1, 4);
        randomszam = 3;
        
        String eszkoz = "";

        
        switch (randomszam) {
            case 1:
                eszkoz = "kő";
                break;
            case 2:
                eszkoz = "papír";
                break;
            default:
                eszkoz = "olló";
                break;
        }
        System.out.println(eszkoz);
        
        String meccs = "Nem nyert";
        if (szoveg.equals(eszkoz))
        {
            meccs = "Nyert";
        }
        
        System.out.println("Az eredmény: " + meccs);
        
        // Tanári változat
        System.out.println("-------------------------");
        System.out.println("Mit választasz?\n1. Kő\n2. Papír\n3. Olló\nválasztásod (1,2,3): ");
        int valasztas = sc.nextInt();
        System.out.println("A gép választása: " + randomszam);
                
        if(randomszam == valasztas)
        {
            meccs = "Nyertél";
        }

        System.out.println("Az eredmény: " + meccs);
    }
    
}
