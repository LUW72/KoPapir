package jatek_main;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author LUW72
 */
public class KoPapirOllo 
{
    
    private static int randomGenerator(int also_hatar, int felso_hatar)
    {
        Random rnd = new Random();
        int randomszam = rnd.nextInt(also_hatar, felso_hatar +1);
        //randomszam = 3;
        
        return randomszam;
    }

    private static String szovegBekero(){
        Scanner sc = new Scanner(System.in);
        String szoveg = "";
        
        String input_szoveg = "Ide írd a tipped:";
        System.out.println(input_szoveg);
        szoveg = sc.nextLine();
       
        while (szoveg == null || szoveg.isBlank() || !szoveg.matches("\\p{L}+([ \\p{L}]+)*")){
            System.out.println("Beviteli hiba! " + input_szoveg);
            szoveg = sc.nextLine();
        }
        
        return szoveg.toLowerCase();
    }
    
    private static String eszkozGenerator()
    {
        String eszkoz = "";
        eszkoz = switch (randomGenerator(1,3)) {
            case 1 -> "kő";
            case 2 -> "papír";
            default -> "olló";
        };
        return eszkoz;
    }
      
    public static void main(String[] args) 
    {
        // Szöveges bevitel
        
        System.out.println("Mit választasz?\n1. Kő\n2. Papír\n3. Olló\nVálasztásod (szöveggel)");
        
        String ellenorzott_szoveg = szovegBekero();
        String eszkoz = eszkozGenerator();

        System.out.println("A gép választása: " + eszkoz);
        
        String meccs = "Nem nyert";
        if (ellenorzott_szoveg.equals(eszkoz))
        {
            meccs = "Nyert";
        }
        
        System.out.println("Az eredmény: " + meccs);
        
        // ----------------------------------------
        // Tanári változat - számos bevitel - input: nem ellenőrzött
        
        meccs = "Nem nyertél";
        
        System.out.println("-------------------------\nSzámos bevitellel:\n-------------------------");
        System.out.println("Mit választasz?\n1. Kő\n2. Papír\n3. Olló\nválasztásod (1,2,3): ");
        Scanner sc = new Scanner(System.in);
        
        int valasztas = sc.nextInt();
        
        int generalt = randomGenerator(1, 3);
        
        System.out.println("A gép választása: " + generalt);
        
        if(generalt == valasztas)
        {
            meccs = "Nyertél";
        }

        System.out.println("Az eredmény: " + meccs);
    }
}
