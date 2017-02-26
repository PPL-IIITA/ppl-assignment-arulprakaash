/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iim2015002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author Arulprakaash
 */
public final class utility {
    final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

final java.util.Random rand = new java.util.Random();

// consider using a Map<String,Boolean> to say whether the identifier is being used or not 
final Set<String> identifiers = new HashSet<>();


    utility() throws FileNotFoundException, IOException{
        File f;
        BufferedWriter bw=null;
        FileWriter fw=null;
        BufferedReader rbw=null;
        FileReader rfw=null;
        Boolean b;
        try
        {
            f=new File("dat.txt");
            b=f.createNewFile();
            fw=new FileWriter("dat.txt");
            bw=new BufferedWriter(fw);
            Random rand=new Random();
            int nb,ng;
            ng=5+rand.nextInt(10);
            nb=ng+rand.nextInt(100);
            System.out.println(nb);
            bw.write(Integer.toString(nb));
            bw.newLine();
            int i,at,intl,bud,ty,atr_req ;
            for(i=1;i<=nb;i++)
            {
                String s;
                s="boy_"+Integer.toString(i);
                at=10+rand.nextInt(91);
                atr_req=10+rand.nextInt(91);
                intl=10+rand.nextInt(91);
                bud=100+rand.nextInt(1000);
                ty=rand.nextInt(3);
                bw.write(s);
                bw.write(",");
                bw.write(Integer.toString(at));
                bw.write(",");
                bw.write(Integer.toString(intl));
                bw.write(",");
                bw.write(Integer.toString(bud));
                bw.write(",");
                bw.write(Integer.toString(atr_req));
                bw.write(",");
                if(ty==0)
                {
                    bw.write("Miser");
                }
                else if(ty==1)
                {
                    bw.write("Generous");
                }
                else
                {
                    bw.write("Geek");
                }
                bw.newLine();
                //System.out.println(at+" "+intl+" "+bud);
            }
            bw.write(Integer.toString(ng));
            bw.newLine();
            for(i=1;i<=ng;i++)
            {
                String s;
                s="girl_"+Integer.toString(i);
                at=10+rand.nextInt(91);
                intl=10+rand.nextInt(91);
                bud=100+rand.nextInt(1000);
                ty=rand.nextInt(3);
                bw.write(s);
                bw.write(",");
                bw.write(Integer.toString(at));
                bw.write(",");
                bw.write(Integer.toString(intl));
                bw.write(",");
                bw.write(Integer.toString(bud));
                bw.write(",");
                if(ty==0)
                {
                    bw.write("Choosy");
                }
                else if(ty==1)
                {
                    bw.write("Normal");
                }
                else
                {
                    bw.write("Desperate");
                }
                bw.newLine();
                //System.out.println(at+" "+intl+" "+bud);
            }
            bw.close();
            fw.close();
        }catch(Exception e)
        {
        }
        try
        {
            f=new File("gift.txt");
            b=f.createNewFile();
            fw=new FileWriter("gift.txt");
            bw=new BufferedWriter(fw);
            Random rand=new Random();
            int x,vl,cs,i,ng,ty;
            ng=500+rand.nextInt(501);
            bw.write(Integer.toString(ng));
            bw.newLine();
            for(i=1;i<=ng;i++)
            {
                String s="gift_id_"+Integer.toString(i);
                bw.write(s);
                bw.write(",");
                cs=50+rand.nextInt(250);
                bw.write(Integer.toString(cs));
                bw.write(",");
                x=rand.nextInt(2);
                if(x==0)
                {
                    vl=cs+rand.nextInt(100);
                }
                else
                {
                    vl=cs-rand.nextInt(50);
                }
                bw.write(Integer.toString(vl));
                bw.write(",");
                ty=rand.nextInt(3);
                if(ty==0)
                {
                    bw.write("Essential");
                }
                else if(ty==1)
                {
                    bw.write("Luxury");
                }
                else
                {
                    bw.write("Utility");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch(Exception e)
        {
        }
    }
}
