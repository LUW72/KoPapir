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
        System.out.println("Kő/papír/olló, ide írd a tipped: ");
        
        Scanner sc = new Scanner(System.in);
        
        String szoveg = sc.nextLine();
        
        Random rnd = new Random();
        int randomszam =  rnd.nextInt(1, 4);
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
        
        System.out.println(meccs);
        
        
    }
    
}
