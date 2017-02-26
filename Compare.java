/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iim2015002;

import java.util.Comparator;

/**
 *
 * @author arulprakaash
 */
public class Compare implements Comparator{
    @Override
    public int compare(Object o1,Object o2)
    {
        Gift g1,g2;
        g1=(Gift)o1;
        g2=(Gift)o2;
        if(g1.cost>g2.cost)
        {
            return 1;
        }
        else if(g1.cost<g2.cost)
        {
            return -1;
        }
        else if(g1.value<g2.value)
        {
            return 1;
        }
        else if(g1.value>g2.value)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
