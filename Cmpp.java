package iim2015002;
import java.util.Comparator;


/**
 *
 * @author arulprakaash
 */
public class Cmpp implements Comparator{
    @Override
    public int compare(Object o1,Object o2)
    {
        Couple g1,g2;
        g1=(Couple)o1;
        g2=(Couple)o2;
        if(g1.compatibility>g2.compatibility)
        {
            return 1;
        }
        else if(g1.compatibility<g2.compatibility)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
