
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
   public static Scanner scan = new Scanner(System.in);
   public static Dricka hatt = new Dricka(200, "cola", "stor mössa");
   public static Dricka tröja = new Dricka(500, "fanta", "luvtröja");
    
    public Kläder(int kostnad, String namn, String beskrivning) {
        super(kostnad, namn, beskrivning);
    }

    @Override
    public void Description() {
        System.out.println(namn + " Är en väldigt " + beskrivning +" dryck som kostar " + kostnad );
        System.out.println("Vill du gå vidare till menyn för att köpa drycken?");
        Buy();
    }

    @Override
    public void Buy() {
        System.out.println("Är du säker på att du vill köpa"+ " "+ namn + " för " + kostnad+" kr?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        
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
    public void Use() {
        System.out.println("Du tog på dig din mössa " + namn);
    }
    
}
