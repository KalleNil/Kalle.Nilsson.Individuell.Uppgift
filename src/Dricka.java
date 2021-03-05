
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class Dricka extends Varor implements VarorFunktioner{
    //scanner som fungerar i hela klassen
   Scanner scan = new Scanner(System.in);
   //2 instanser av Dricka
   public static Dricka cola = new Dricka(10, "cola", "söt");
   public static Dricka fanta = new Dricka(10, "fanta", "surt");
    
    public Dricka(int kostnad, String namn, String beskrivning) {
        super(kostnad, namn, beskrivning);
    }

    @Override
    
    public void Description() {
        System.out.println(namn + " Är en väldigt " + beskrivning +" dryck som kostar " + kostnad );
        System.out.println("Vill du gå vidare till menyn för att köpa drycken?");
        //kallar på Buy metoden för att säkerställa köpet
        Buy();
    
    }

    @Override
    public void Buy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Use() {
        
        System.out.println("Du drack upp en 50cl " + namn);
    
    }
    
}
