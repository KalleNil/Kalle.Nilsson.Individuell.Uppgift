
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
    public static void mataInPengar(){
        //Meny till vilken valör som vill matas in
        System.out.println("1. för att mata in 1kronor");
        System.out.println("2. för att mata in 5kronor");
        System.out.println("3. för att mata in 10kronor");
        System.out.println("4. för att mata in 20sedlar");
        System.out.println("5. för att mata in 50sedlar");
        System.out.println("6. för att mata in 100sedlar");
        System.out.println("7. för att mata in 200sedlar");
        System.out.println("8. för att mata in 500sedlar");
        System.out.println("9. för att mata in 1000sedlar");
        
        // switch case med användar-input.
        int inmatning = scan.nextInt();
        switch (inmatning){
            case 1:
                System.out.println("Skriv antalet enkronor du vill mata in, du har " + enKrona + " stycken just nu");
                int kollaValörSaldo = scan.nextInt();
                
                if (kollaValörSaldo>enKrona){
                    System.out.println("!!!Du kan inte mata in mer mynt än du har i plånboken!!!");
                    
                }
                 // Går inmatningen igenom kommer automatsaldot öka och valörens värde minskas med samma som inputen.
                else{
                    enKrona = enKrona - kollaValörSaldo;
                automatPengar += kollaValörSaldo;
                
                }
                
                System.out.println(inmatning);
                break;
                case 2:
                    System.out.println("Skriv antalet enkronor du vill mata in, du har " + femKrona + " stycken just nu");
                int kollaValörSaldo5Kronor = scan.nextInt();
                
                if (kollaValörSaldo5Kronor>femKrona){
                    System.out.println("!!!Du kan inte mata in mer mynt än du har i plånboken!!!");
                    
                } 
                //Liknar case 1 fast med "* 5" som speglar valörens värde
                else{
                    femKrona = femKrona - kollaValörSaldo5Kronor;
                automatPengar += kollaValörSaldo5Kronor * 5;
                }
                break;
                
                
                case 3:
                System.out.println("Skriv antalet enkronor du vill mata in, du har " + tioKrona + " stycken just nu");
                int kollaValörSaldo10Kronor = scan.nextInt();
                
                if (kollaValörSaldo10Kronor>tioKrona){
                    System.out.println("!!!Du kan inte mata in mer mynt än du har i plånboken!!!");
                    
                } else{
                    tioKrona = tioKrona - kollaValörSaldo10Kronor;
                automatPengar += kollaValörSaldo10Kronor * 10;
                
                }
                break;
                case 4:
                System.out.println("Skriv antalet enkronor du vill mata in, du har " + tjugoSedel + " stycken just nu");
                int kollaValörSaldo20Sedel = scan.nextInt();
                
                if (kollaValörSaldo20Sedel>tjugoSedel){
                    System.out.println("!!!Du kan inte mata in mer mynt än du har i plånboken!!!");
                    
                } else{
                    tjugoSedel = tjugoSedel - kollaValörSaldo20Sedel;
                automatPengar += kollaValörSaldo20Sedel * 20;
                
                }
                break;
                case 5:
                System.out.println("Skriv antalet enkronor du vill mata in, du har " + femtioSedel + " stycken just nu");
                int kollaValörSaldo50Sedel = scan.nextInt();
                
                if (kollaValörSaldo50Sedel>femtioSedel){
                    System.out.println("!!!Du kan inte mata in mer mynt än du har i plånboken!!!");
                    
                } else{
                    femtioSedel = femtioSedel - kollaValörSaldo50Sedel;
                automatPengar += kollaValörSaldo50Sedel * 50;
                
                }
                break;
                case 6:
                System.out.println("Skriv antalet enkronor du vill mata in, du har " + hundraSedel + " stycken just nu");
                int kollaValörSaldo100Sedel = scan.nextInt();
                
                if (kollaValörSaldo100Sedel>hundraSedel){
                    System.out.println("!!!Du kan inte mata in mer mynt än du har i plånboken!!!");
                    
                } else{
                    hundraSedel = hundraSedel - kollaValörSaldo100Sedel;
                automatPengar += kollaValörSaldo100Sedel * 100;
                
                }
                break;
                case 7:
                System.out.println("Skriv antalet enkronor du vill mata in, du har " + tvåhundraSedel + " stycken just nu");
                int kollaValörSaldo200Sedel = scan.nextInt();
                
                if (kollaValörSaldo200Sedel>tvåhundraSedel){
                    System.out.println("!!!Du kan inte mata in mer mynt än du har i plånboken!!!");
                    
                } else{
                    tvåhundraSedel = tvåhundraSedel - kollaValörSaldo200Sedel;
                automatPengar += kollaValörSaldo200Sedel * 200;
                
                }
                break;
                default:
                    System.out.println("Skriv in ett gitligt alternativ!");
                    
                
                
                
                
        }
        
        
    }
    //nya variabler som motsvarar respektive valör
    public static void avslutaOchGeTillbakaPengar(){
        int uttag1000sedel = 0;
        int uttag500sedel = 0;
        int uttag200sedel = 0;
        int uttag100sedel = 0;
        int uttag50sedel = 0;
        int uttag20sedel = 0;
        int uttag10Krona = 0;
        int uttag5Krona = 0;
        int uttag1Krona = 0;
        //sparar värdet på pengarna som finns i automaten i en enskild variabel
        int spararAutomatPengarna = automatPengar;
        
        //en while loop för att ge tillbaka pengar till användaren avrundat uppåt med hjälp av prioriterinsregeln
        while (automatPengar>0){
            if (automatPengar>=1000){
                automatPengar += -1000;
                uttag1000sedel += 1;
                
            }else if(automatPengar>=500){
                automatPengar += -500;
                uttag500sedel +=1;
            }else if (automatPengar>=200){
                automatPengar += -200;
                uttag200sedel += 1;
            }else if(automatPengar>=100){
                automatPengar += -100;
                uttag100sedel += 1;
            }else if(automatPengar>=50){
                automatPengar += -50;
                uttag50sedel +=1;
            }else if(automatPengar>=20){
                automatPengar += -20;
                uttag20sedel += 1;
            }else if(automatPengar>=10){
                automatPengar += -10;
                uttag10Krona += 1;
            }else if(automatPengar>=5){
                automatPengar += -5;
                uttag5Krona += 1;
            }else{
                automatPengar += -1;
                uttag1Krona +=1;
            }
           
                
        
        }
         System.out.println("Du fick tillbaka totalt " + spararAutomatPengarna +" kr");
            System.out.println( uttag1000sedel + ": stycken 1000 sedlar");
            System.out.println( uttag500sedel + ": stycken 500 sedlar");
            System.out.println( uttag200sedel + ": stycken 200 sedlar");
            System.out.println( uttag100sedel + ": stycken 100 sedlar");
            System.out.println( uttag50sedel + ": stycken 50 sedlar");
            System.out.println( uttag20sedel + ": stycken 20 sedlar");
            System.out.println( uttag10Krona + ": stycken 10kronor");
            System.out.println( uttag5Krona + ": stycken 5kronor");
            System.out.println( uttag1Krona + ": stycken enkronor");
            Main.setIt = false;
            
        
        
        
                
        }
    
}
