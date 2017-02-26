/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iim2015002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.System.in;

/**
 *
 * @author Arulprakaash
 */
public class Girl {
    String girl_id;
    int attractiveness;
    int intelligence;
    boolean comm_or_not;
    int happiness;
    int maintenance_cost;
    String type;  
    Girl(String s,int a,int i,int b,String t)
    {
        this.girl_id=s;
        this.attractiveness=a;
        this.intelligence=i;
        this.maintenance_cost=b;
        this.type=t;
        this.happiness=0;
        this.comm_or_not=false;
    }
    
    }
