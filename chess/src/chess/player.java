/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;
import java.io.*;
import static java.lang.System.exit;
import java.util.*;
/**
 *
 * @author PUGAZHENDI
 */
public class player{
    
    String m1;
    int m,n;
    Scanner sc=new Scanner(System.in);
    pawn p=new pawn();
    king k=new king();
    knight kn=new knight();  
    queen q=new queen();
    boolean z;
    String undo;
    public boolean makemove(int e ,chessboard cb)throws Exception
    {
        if(e%2==1)
            System.out.print("\nPlayer 1 (White)");
        else
            System.out.print("\nPlayer 2 (Black)");
        
        
        System.out.println("\nChoose the coin / undo / exit:\n");
        
        m1=sc.nextLine();
        
        
        
        if(m1.equals("undo"))
        {
            	return cb.undo();
          
           //return true;
	
        }
         
        if(m1.equals("exit"))
        {
            exit(0);
        }
        
        
        if(m1.length()==2 && (m1.charAt(0)>='a')&& (m1.charAt(0)<='h')&& (m1.charAt(1)>='1')&&(m1.charAt(1)<='8'))
        {


                m=8-((int)m1.charAt(1)-48);
                n=m1.charAt(0)-97;



                if(((cb.board[m][n].charAt(0)=='W')&&(e%2==1))||((cb.board[m][n].charAt(0)=='B')&&(e%2==0)))
                {

                        if(cb.board[m][n].charAt(0)=='W')
                           System.out.print("White_");

                        if(cb.board[m][n].charAt(0)=='B')
                           System.out.print("Black_");

                        if(cb.board[m][n].charAt(2)=='P')
                        {
                                System.out.print("Pawn");
                                System.out.println("\nThe possible moves are:\n");
                                
                                
                                if(p.pawnmove(m,n,cb.board[m][n].charAt(0),cb))
                                {
                                    //System.out.println("in player");
                                    return true;
                                }
                                 
                        }

                        if(cb.board[m][n].charAt(2)=='K')
                        {
                                System.out.println("King");
                                System.out.println("\nThe possible moves are:\n");
                                if(k.kingmove(m,n,cb.board[m][n].charAt(0),cb))
                                {
                                    return true;
                                }
                                
                        }
                      if(cb.board[m][n].charAt(2)=='N')
                        {
                                System.out.println("Knight");
                                System.out.println("\nThe possible moves are:\n");
                                if(kn.knightmove(m,n,cb.board[m][n].charAt(0),cb))
                                 {
                                    return true;
                                }
                        }
                        if(cb.board[m][n].charAt(2)=='R')
                        {
                                System.out.println("Rook");
                                System.out.println("\nThe possible moves are:\n");
                                q.horizontal_and_vertical(m,n,cb.board[m][n].charAt(0),cb);
                                if(cb.move(m,n))
                                 {
                                    return true;
                                }
                        }
                        if(cb.board[m][n].charAt(2)=='B')
                        {
                                System.out.println("Bishop");
                                System.out.println("\nThe possible moves are:\n");
                                q.diagonal(m,n,cb.board[m][n].charAt(0),cb);
                                if(cb.move(m,n))
                                 {
                                    return true;
                                }
                        }
                        if(cb.board[m][n].charAt(2)=='Q')
                        {
                                System.out.println("Queen");
                                System.out.println("\nThe possible moves are:\n");
                                q.horizontal_and_vertical(m,n,cb.board[m][n].charAt(0),cb);
                                q.diagonal(m,n,cb.board[m][n].charAt(0),cb);
                                if(cb.move(m,n))
                                        
                                 {
                                    return true;
                                }
                        }

                }
                else
                {
                        System.out.println("Invalid Player/Position");
                       
                }

   }
        
        
        
        
        return false;
        
    }
    
}
