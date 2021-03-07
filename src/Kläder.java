
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
public class Kläder extends Varor implements VarorFunktioner{
    //Utanför någon metod och gjord som static för att nås i övriga klasser utan en instans
   public static Scanner scan = new Scanner(System.in);
   public static Kläder hatt = new Kläder(200, "mössa", "mjuk");
   public static Kläder tröja = new Kläder(500, "tröja", "skön");
    
    public Kläder(int kostnad, String namn, String beskrivning) {
        super(kostnad, namn, beskrivning);
    }

    @Override
    //Visar information om produkterna
    public void Description() {
        System.out.println("-----------------------------------");
        System.out.println(namn + " Är en väldigt " + beskrivning +" sak som kostar " + kostnad + "kr" );
        System.out.println("Vill du gå vidare till menyn för att köpa plagget?");
        //kallar på Buy metoden för att säkerställa köpet
        Buy();
    }

    @Override
    public void Buy() {
        System.out.println("Är du säker på att du vill köpa"+ " "+ namn + " för " + kostnad+"kr?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        //genomför köpet ifall användaren matar in "1" och har tillräckligt med pengar i automaten
        String buyOrNot = scan.nextLine();
        if (buyOrNot.equals("1") && Plånbok.automatPengar >= kostnad){
            Plånbok.automatPengar += -kostnad;
            Use();
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
        System.out.println("Du tog på dig din " + namn);
    }
    
}
