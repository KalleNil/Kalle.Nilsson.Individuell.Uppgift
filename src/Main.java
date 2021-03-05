/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class Main {
    //Utanför en metod och gjord till static för att andra klasser ska kunna ändra värdet på "setIt"
    
    public static boolean setIt = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hej och välkommen till Kalles automat!");
        
        //while loopen ser till att menyn repeteras tills det att setIt blir false
        while (setIt){
        //anropar metoden som innehåller alla standard menyn
        Meny.standardMeny();
    }
    }
}
