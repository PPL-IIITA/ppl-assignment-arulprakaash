/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iim2015002;
import java.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author Arulprakaash
 */
public class Boy {
    String boy_id;
    int attractiveness;
    int intelligence;
    boolean comm_or_not;
    int budget;
    int atr_req;
    int happiness;
    String type;
    Boy(String s,int a,int i,int b,String t,int ar)
    {
        this.boy_id=s;
        this.attractiveness=a;
        this.intelligence=i;
        this.budget=b;
        this.atr_req=ar;
        this.type=t;
        this.comm_or_not=false;
        this.happiness=0;
    }
}
    
    
    
    

