/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.io.BufferedWriter;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PUGAZHENDI
 */
public class writefile {
    
   void write_to_file(String s){
        
       
       
     BufferedWriter f=null;
       try {
           f = new BufferedWriter(new FileWriter("Record.txt",true));
           f.write("\n"+s);
           
       } catch (IOException ex) {
           Logger.getLogger(writefile.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
           try {
               f.close();
           } catch (IOException ex) {
               Logger.getLogger(writefile.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
    }
}
