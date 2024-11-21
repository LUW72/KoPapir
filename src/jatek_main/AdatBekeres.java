package jatek_main;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author LUW72
 */
public class AdatBekeres 
{

    public static void main(String[] args) 
    {
        // Kérdés, amire a választ várjuk
        System.out.println("Szöveg: ");
        
        // Szöveg bekérés
        
        // A konzolról való beolvasást a Scanner osztály valósítja meg Java nyelven, azaz a Java API biztosítja
        // Scanner osztály használatához a Scanner osztályból létrehozunk egy objektumot sc néven (sc -> példány)
        // Az sc-n keresztüle lérjük a Scanner szolgáltatásait
        Scanner sc = new Scanner(System.in);
        
        String szoveg = sc.nextLine();
        
        System.out.println("A szöveg:" + szoveg);
        
        // Szám bekérés
        
        System.out.println("Szám: ");
        int egesz = sc.nextInt(); // Azért, mert az int után ott marad a \r\n (enter), és azt olvassa ki
        
        System.out.println("A szám: " + egesz);     
           
    }
    
}
