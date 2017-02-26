/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iim2015002;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author Arulprakaash
 */
public class Iim2015002 {

   
    /*public static void questionOne(List nameList,int pos, List boyList, int boyPos, List girlList, int girlPos, int boyCount, int girlCount) throws FileNotFoundException, IOException {
        File fout = new File("log.txt");
        fout.createNewFile();
        System.out.println("filecreated");
	//FileOutputStream fos = new FileOutputStream(fout);
 
	//OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter osw=null;
        FileWriter fos=null;
        BufferedReader rbw=null;
        FileReader rfw=null;
        fos=new FileWriter("dat.txt");
            osw=new BufferedWriter(fos);
	String gender;
        int j=pos;
        for(pos=j;pos<nameList.size();pos++)
        {gender= (String) nameList.get(pos);
        if(gender.equals("boy"))
        {
            System.out.println("gender is boy");
            int flag=0;
            Boy tempBoy= (Boy)boyList.get(boyPos);
            if((tempBoy.comm_or_not )==true)
                continue;
            for( int i= girlPos;i <girlCount && flag== 0;i++)
            {
                Girl tempGirl= (Girl) girlList.get(i);
                if(tempGirl.comm_or_not == false && tempBoy. budget>= tempGirl.maintenance_cost)
                {
                    
                    java.util.Date date = new java.util.Date();
                    tempBoy.comm_or_not=true;
                    tempGirl.comm_or_not=true;
                    
                    osw.write(tempBoy.boy_id + "commited with" + tempGirl.girl_id+ date.toString());
                    //buy gifts and put it into file too
                    flag=1;
                    boyPos++;
                }
                if(flag==1)
                    break;
            }
            
        }
        else
        {
            
            int flag=0;
            Girl tempGirl= (Girl) girlList.get(girlPos);
            if(tempGirl.comm_or_not==true)
                continue;
            for( int i= boyPos;i <boyCount && flag== 0;i++)
            {
                Boy tempBoy= (Boy) girlList.get(i);
                if(tempBoy.comm_or_not == false && tempBoy.budget >= tempGirl.maintenance_cost)
                {
                    
                    java.util.Date date;
                    date = new java.util.Date();
                    tempBoy.comm_or_not=true;
                    tempGirl.comm_or_not=true;
                    
                    osw.write(tempBoy.boy_id + "commited with" + tempGirl.girl_id+ date.toString());
                    //buy gifts and put it into file too
                    flag=1;
                    girlPos++;
                }
                if(flag==1)
                    break;
            }
        }
        
		//osw.write("something");
        }
}*/
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        utility u= new utility();
       FileReader fw;
        BufferedReader rw;
        ArrayList<Boy> boy_arr = new ArrayList<>();
        ArrayList<Girl> girl_arr = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Couple> couple_arr = new ArrayList<>();
        ArrayList<Gift> gift_arr = new ArrayList<>();
        try {
            fw = new FileReader("dat.txt");
            rw = new BufferedReader(fw);

            String s;
            Boy b;
            int nb, ng, i, at, intl, bud,atr_req;
            nb = Integer.parseInt(rw.readLine());
            for (i = 1; i <= nb; i++) {
                s = rw.readLine();
                StringTokenizer st = new StringTokenizer(s, ",");
                String name = st.nextToken();
                at = Integer.parseInt(st.nextToken());
                intl = Integer.parseInt(st.nextToken());
                bud = Integer.parseInt(st.nextToken());
                atr_req = Integer.parseInt(st.nextToken());
                String type = st.nextToken();
                b = new Boy(name, at, intl, bud, type,atr_req);
                boy_arr.add(b);
            }
            ng = Integer.parseInt(rw.readLine());
            Girl g;
            for (i = 1; i <= ng; i++) {
                s = rw.readLine();
                StringTokenizer st = new StringTokenizer(s, ",");
                String name = st.nextToken();
                at = Integer.parseInt(st.nextToken());
                intl = Integer.parseInt(st.nextToken());
                bud = Integer.parseInt(st.nextToken());
                String type = st.nextToken();
                g = new Girl(name, at, intl, bud, type);
                girl_arr.add(g);
            }
        
        System.out.println("running ques 1 and  question 2");
        
     Couple couple;
            int j, k;
            for (i=0, k=0;i<nb;i++){
                for (j=0;j<ng;j++){
                    if (girl_arr.get(j).comm_or_not==false && boy_arr.get(i).atr_req<=girl_arr.get(j).attractiveness && boy_arr.get(i).budget>=girl_arr.get(j).maintenance_cost){
                        boy_arr.get(i).comm_or_not=true;
                        girl_arr.get(j).comm_or_not=true;
                        couple=new Couple(boy_arr.get(i), girl_arr.get(j));
                        couple_arr.add(couple);
                        k++;
                        break;
                    }
                }
            }
            DateFormat dateFormat= new SimpleDateFormat ("yyyy/mm/dd HH:mm:ss");
            Date date= new Date();
            
            
            try ( //Print Output
                    PrintWriter writer = new PrintWriter("log.txt", "UTF-8")) {
                for ( i = 0; i<k; i++) {
                    writer.println(couple_arr.get(i).couple_id + " at "+ dateFormat.format(date));
                }
                //int boyPos=0,girlPos=0,pos=0;
                //questionOne(nameList,pos,boy_arr,boyPos,girl_arr,girlPos,nb,ng);
            }
        
        
        
        
        
    }
         catch (IOException | NumberFormatException e) {

        }
        try {
            fw = new FileReader("gift.txt");
            rw = new BufferedReader(fw);
            String s, ty, gid;
            int ng, i, cs, vl;
            ng = Integer.parseInt(rw.readLine());
            for (i = 1; i <= ng; i++) {
                s = rw.readLine();
                StringTokenizer st = new StringTokenizer(s, ",");
                gid = st.nextToken();
                cs = Integer.parseInt(st.nextToken());
                vl = Integer.parseInt(st.nextToken());
                ty = st.nextToken();
                Gift g = new Gift(ty, cs, vl, gid);
                gift_arr.add(g);
            }
        } catch (IOException | NumberFormatException e) {

        }
        Collections.sort(gift_arr, new Compare());
        int i, j, x, y, mc = 0;
        for (i = 0; i < gift_arr.size(); i++) {
            //System.out.println(gift_arr.get(i).cost + " " + gift_arr.get(i).value);
        }
        for (i = 0; i < couple_arr.size(); i++) {
            if (couple_arr.get(i).bob.type.equals("Miser")) {
                mc = couple_arr.get(i).gob.maintenance_cost;
                j = 0;
                x = 0;
                while (j < mc) {
                    j += gift_arr.get(x).cost;
                    couple_arr.get(i).gift_arr.add(gift_arr.get(x));
                    x++;
                }
            } else if (couple_arr.get(i).bob.type.equals("Generous")) {
                mc = couple_arr.get(i).bob.budget;
                j = 0;
                x = 0;
                while (j < mc) {
                    j += gift_arr.get(x).cost;
                    couple_arr.get(i).gift_arr.add(gift_arr.get(x));
                    x++;
                }
            } else {
                mc = couple_arr.get(i).gob.maintenance_cost;
                j = 0;
                x = 0;
                while (j < mc) {
                    j += gift_arr.get(x).cost;
                    couple_arr.get(i).gift_arr.add(gift_arr.get(x));
                    x++;
                }
                y = couple_arr.get(i).bob.budget - j;
                for (j = 0; j < gift_arr.size(); j++) {
                    if (gift_arr.get(j).type.equals("Luxury") && y >= gift_arr.get(j).cost) {
                        couple_arr.get(i).gift_arr.add(gift_arr.get(x));
                    }
                }
            }
        }
        try ( //Print Output
                    PrintWriter writer = new PrintWriter(new FileOutputStream(new File("log.txt"), true /* append = true */)))  {
        for(i=0;i<couple_arr.size();i++)
         {
         writer.println(couple_arr.get(i).couple_id);
         for(j=0;j<couple_arr.get(i).gift_arr.size();j++)
         {
         writer.print(couple_arr.get(i).gift_arr.get(j).gift_id + " ");
         }
         writer.println();
         }}
        for (i = 0; i < couple_arr.size(); i++) {
            //System.out.println(couple_arr.get(i).couple_id);
            x=0;
            y=0;
            int hapg=0,hapb=0;
            for (j = 0; j < couple_arr.get(i).gift_arr.size(); j++) {
                x+=couple_arr.get(i).gift_arr.get(j).cost;
                y+=couple_arr.get(i).gift_arr.get(j).value;
            }
            mc = couple_arr.get(i).gob.maintenance_cost;
            if(couple_arr.get(i).gob.type.equals("Choosy"))
            {
                hapg+=Math.log10(x-mc+2*y);
                //System.out.println(x-mc+2*y+" "+hapg+" "+couple_arr.get(i).couple_id);
            }
            else if(couple_arr.get(i).gob.type.equals("Desperate"))
            {
                hapg+=Math.exp((x-mc)%20);
                //System.out.println(x-mc+" "+hapg+" "+couple_arr.get(i).couple_id);
            }
            else
            {
                hapg+=x-mc+y;
                //System.out.println(x-mc+y+" "+hapg+" "+couple_arr.get(i).couple_id);
            }
            if(couple_arr.get(i).bob.type.equals("Miser"))
            {
                hapb+=couple_arr.get(i).bob.budget-x;
            }
            else if(couple_arr.get(i).bob.type.equals("Generous"))
            {
                hapb=hapg;
            }
            else
            {
                hapb=couple_arr.get(i).gob.intelligence;
            }
            //System.out.println(hapb+" "+hapg+" "+couple_arr.get(i).couple_id);
            couple_arr.get(i).bob.happiness=hapb;
            couple_arr.get(i).gob.happiness=hapg;
            couple_arr.get(i).happiness=hapb+hapg;
            couple_arr.get(i).compatibility=couple_arr.get(i).bob.budget-mc+Math.abs(couple_arr.get(i).gob.attractiveness-couple_arr.get(i).bob.attractiveness)+Math.abs(couple_arr.get(i).gob.intelligence-couple_arr.get(i).bob.intelligence);
        }
        Collections.sort(couple_arr,new Cmp());
         DateFormat dateFormat= new SimpleDateFormat ("yyyy/mm/dd HH:mm:ss");
            Date date= new Date();
            try ( //Print Output
                    PrintWriter writer = new PrintWriter(new FileOutputStream(new File("log.txt"), true /* append = true */)))  {
                writer.println("order of couple with hapiness");
        for(i=0;i<couple_arr.size();i++)
        {
            writer.println(couple_arr.get(i).couple_id+" "+couple_arr.get(i).happiness );
        }
        Collections.sort(couple_arr,new Cmpp());
        writer.println("order of couple with compatiblity");
        for(i=0;i<couple_arr.size();i++)
        {
            writer.println(couple_arr.get(i).couple_id + " " +couple_arr.get(i).compatibility);
            //writer.println(couple_arr.get(i).couple_id+" "+couple_arr.get(i).happiness);
        }
    
    
    }}}
