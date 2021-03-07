
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
   //Utanför någon metod och gjord som static för att nås i övriga klasser utan en instans
   public static Dricka cola = new Dricka(10, "cola", "söt");
   public static Dricka fanta = new Dricka(10, "fanta", "surt");
    
    public Dricka(int kostnad, String namn, String beskrivning) {
        super(kostnad, namn, beskrivning);
    }

    @Override
    //Visar information om produkterna
    public void Description() {
        System.out.println("-----------------------------------");
        System.out.println(namn + " Är en väldigt " + beskrivning +" dryck som kostar " + kostnad + "kr");
        System.out.println("Vill du gå vidare till menyn för att köpa drycken?");
        
        //kallar på Buy metoden för att säkerställa köpet
        Buy();
    
    }

    @Override
    public void Buy() {
        System.out.println("Är du säker på att du vill köpa"+ " "+ namn + " för " + kostnad+"kr?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        
        String buyOrNot = scan.nextLine();
        //genomför köpet ifall användaren matar in "1" och har tillräckligt med pengar i automaten
        if (buyOrNot.equals("1") && Plånbok.automatPengar >= kostnad){
            Plånbok.automatPengar += -kostnad;
            Use();
            System.out.println("Och blev av med " + kostnad + " kr");
        } else if (buyOrNot.equals("2")){
            System.out.println("Du avbröt köpet");
        } else if (buyOrNot.equals("1")){
            System.out.println("Du har inte matat in tillräckligt med pengar till automaten");
            
        }else{
            System.out.println("Du skrev inte in något av alternativen");
        }
        
    }

    @Override
    //anropas ifall köpet går igenom
    public void Use() {
        
        System.out.println("Du drack upp en 50cl " + namn);
    
    }
    
}
