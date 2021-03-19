/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
/**
 *
 * @author PUGAZHENDI
 */
public class newgame {

    /**
     * @param args the command line arguments
     */
    writefile w=new writefile();
    SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date d=new Date();
    chessboard cb=new chessboard();
        player p1=new player();
        player p2=new player();
    public void start()
    {
       
       int e=1;
       
       w.write_to_file("------------- New game on "+df.format(d)+" -------------------------");
       
       while(true)
       {
        cb.print();
        if(e%2==1)
        {
            try {
                   boolean x = p1.makemove(e,cb);
                   if(x)
                    {
                       // System.out.println(x);
                        if(cb.uf==1)
                        {
                            e--;
                            cb.uf=0;
                            //continue;
                        }
                        else
                        {
                            e++;
                        }
                    }
                   else
                   {
                       e=1;
                      continue;
                   }
                } catch (Exception ex) {
                        System.out.println(ex);
                }
        
        
        }
       // System.out.println();
        else
        {
         try {
                   boolean x=p2.makemove(e,cb);
                   if(x)
                    {
                        
                        if(cb.uf==1)
                        {
                            e--;
                            cb.uf=0;
                            continue;
                        }
                        else
                        {
                            e++;
                        }
                    }
                   else
                   {
                       e=1;
                       continue;
                       //e--;
                   }
                } catch (Exception ex) {
                        System.out.println(ex);
                }
        }
       
        
       // System.out.println(e);
       }
    }
    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        
        
      newgame g=new newgame();
      g.start();
       
       // System.out.println((char)(8-x+'0'));
        
        
        
    }
    
}
