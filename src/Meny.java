
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
public class Meny {
    
    //En instans av klassen Scanner skapad utanför metoderna för att möjliggöra dess använding i alla metoder/klasser ihop med static.
    public static Scanner scan = new Scanner(System.in);
    
    //Huvudmenyn som visas vid programmets uppstart
    //Loopas även efter andra menyval är gjorda
    
    public static void standardMeny(){
        System.out.println("-----------------------------------");
        System.out.println("Välj vilken typ av produkt du vill köpa genom att skriva siffran för respektive produkt");
        System.out.println("1. Drickor");
        System.out.println("2. Kläder");
        System.out.println("9. för att mata in pengar");
        System.out.println("0. för att avsluta ditt köp och få tillbaka dina pengar");       
        System.out.println("");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Du har " + Plånbok.automatPengar +"kr i automaten"); //skriver ut saldot i automaten via variabeln automatPengar i Plånbok klassen
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        
        
        
       
        
        
        String val = scan.nextLine();
        switch(val){
            case "1":
                valDricka();
                break;
                case "2":
                    //här ska en metod från klassen Kläder implementeras
            case "9":
                Plånbok.mataInPengar();
                break;
            case "0":
                Plånbok.avslutaOchGeTillbakaPengar();
                break;
                    
                    
                default:
                    System.out.println("Du valde inget alternativ");
        }
        
    }
    //Metod som körs ifall användaren väljer alternativet drickor i standardMeny metoden
    public static void valDricka(){
        
        
        System.out.println("Dessa drickor finns tillgängliga för köp");
        
        
        
        
        System.out.println("1. cola");
        System.out.println("2. fanta");
        
        
        
        
        System.out.println("0. för att avsluta köpet");
        
        String userInput = scan.nextLine();
        switch (userInput){
            case "1":
                Dricka.cola.Description();
                break;
                case "2":
                    
                    Dricka.fanta.Description();
                    break;
                case "0":
                    
                    break;
                
                    
                default:
                    
                    System.out.println("du skrev inte in ett av alternativen vänligen försök igen!");
                    Meny.valDricka();
        }
        
        
        
        }
    
}
