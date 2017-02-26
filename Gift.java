/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iim2015002;

/**
 *
 * @author Arulprakaash
 */
public class Gift {
    String type;
    int cost;
    int value;
    String gift_id;
    Gift(String t,int c,int v,String gi)
    {
        this.type=t;
        this.cost=c;
        this.value=v;
        this.gift_id=gi;
    }
}
