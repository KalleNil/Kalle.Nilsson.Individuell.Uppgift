/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
//abstract klass med funktioner för varorna
abstract public class Varor {
    //nödvändiga attribut till varor
        int kostnad;
        String namn;
        String beskrivning;
        //parametrar till initiering av varor
        public Varor(int kostnad, String namn, String beskrivning){
            this.kostnad = kostnad;
            this.namn = namn;
            this.beskrivning = beskrivning;
        }

    
    
}
