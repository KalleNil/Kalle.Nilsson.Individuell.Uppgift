
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
        
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        
        
        
       
        
        
        String val = scan.nextLine();
        switch(val){
            case "1":
                //här ska en metod från klassen Dricka implementeras
                break;
                case "2":
                    //här ska en metod från klassen Kläder implementeras
            case "9":
                //här ska en metod från klassen Plånbok implementeras
                break;
            case "0":
                //här ska en metod från klassen Plånbok implementeras
                break;
                    
                    
                default:
                    System.out.println("Du valde inget alternativ");
        }
        
    }
    
}
