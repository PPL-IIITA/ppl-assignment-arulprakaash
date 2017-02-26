/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iim2015002;
import java.util.Comparator;

/**
 *
 * @author Arulprakaash
 */
public class Cmp implements Comparator{
    @Override
    public int compare(Object o1,Object o2)
    {
        Couple g1,g2;
        g1=(Couple)o1;
        g2=(Couple)o2;
        if(g1.happiness>g2.happiness)
        {
            return 1;
        }
        else if(g1.happiness<g2.happiness)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
