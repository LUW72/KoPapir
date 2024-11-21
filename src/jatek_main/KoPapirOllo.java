package jatek_main;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author LUW72
 */
public class KoPapirOllo 
{
    
    public static int randomGenerator(int also_hatar, int felso_hatar)
    {
        Random rnd = new Random();
        int randomszam = rnd.nextInt(also_hatar, felso_hatar +1);
        //randomszam = 3;
        
        return randomszam;
    }

    private static String Bekeres_szoveg(){
        Scanner sc = new Scanner(System.in);
        String szoveg = "";
        
        System.out.println("Kő/papír/olló, ide írd a tipped: ");
        szoveg = sc.nextLine();
        
        while(szoveg.isBlank() && szoveg.isEmpty()){
            szoveg = sc.nextLine();
        }
        
        return szoveg.toLowerCase();
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Mit választasz?\n1. Kő\n2. Papír\n3. Olló\nVálasztásod (szöveggel): ");
        
        String atengedett_szoveg = Bekeres_szoveg();
        
        String eszkoz = "";

        switch (randomGenerator(1,3)) 
        {
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
        //System.out.println(eszkoz);
        
        String meccs = "Nem nyert";
        if (atengedett_szoveg.equals(eszkoz))
        {
            meccs = "Nyert";
        }
        
        System.out.println("Az eredmény: " + meccs);
        
        // ----------------------------------------
        // Tanári változat
        
        meccs = "Nem nyertél";
        
        System.out.println("-------------------------");
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
