
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
public class Plånbok {
    //scanner till valmöjlighet, går även att ärva från andra klasser med static..
    public static Scanner scan = new Scanner(System.in);
    
    //Alla valörer med deras antal som värde
    public static int enKrona = 10;
    public static int femKrona = 10;
    public static int tioKrona = 10;
    public static int tjugoSedel =10;
    public static int femtioSedel =10;
    public static int hundraSedel =10;
    public static int tvåhundraSedel =10;
    public static int femhundraSedel =10;
    public static int tusenSedel =10;
    public static int automatPengar = 0;
    
    //Metod för att kolla saldot av valörer i sin plånbok
    public static void pengarIplånboken(){
        
        System.out.println("Din plånbok består av dessa valörer: ");
        System.out.println( enKrona + ": stycken enkronor");
        System.out.println( femKrona + ": stycken 5kronor");
         System.out.println( tioKrona + ": stycken 10kronor");
         System.out.println( tjugoSedel + ": stycken 20 sedlar");
         System.out.println( femtioSedel + ": stycken 50 sedlar");
            System.out.println( hundraSedel + ": stycken 100 sedlar");
            System.out.println( tvåhundraSedel + ": stycken 200 sedlar");
            System.out.println( femhundraSedel + ": stycken 500 sedlar");
            System.out.println( tusenSedel+ ": stycken 1000 sedlar");
            System.out.println("-----------------------------------");
            
            
            
            
        
       
        
        
    } 
    
}
