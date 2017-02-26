/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iim2015002;

import java.util.ArrayList;

/**
 *
 * @author Arulprakaash
 */
public class Couple {
     String couple_id;
    Boy bob;
    int compatibility;
    int happiness;
    Girl gob;
    ArrayList<Gift> gift_arr=new ArrayList<>();
    Couple(Boy b,Girl g)
    {
        couple_id=b.boy_id+"_"+g.girl_id;
        bob=b;
        gob=g;
        happiness=0;
        compatibility=0;
    }
    
}
