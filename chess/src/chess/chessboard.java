/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.io.*;
import static java.lang.System.exit;
import java.util.Scanner;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PUGAZHENDI
 */
public class chessboard {
    
    
         int px=0,py=0,cx=0,cy=0,p1x,p1y,f=0;
   	    String cc="",mv,undo;
    	Stack<String> moves =new Stack<>();  //-------------------------------- for storing possible moves
		
	Stack<String> record =new Stack<>();
        
        writefile w=new writefile();
        String sp="   ";
        int uf=0;
        
       
        
          
            
        
        
		
	String[][] board= {{"B_R","B_N","B_B","B_Q","B_K","B_B","B_N","B_R"},  
			             {"B_P","B_P","B_P","B_P","B_P","B_P","B_P","B_P"},
				     {"   ","   ","   ","   ","   ","   ","   ","   "},
		         	     {"   ","   ","   ","   ","   ","   ","   ","   "},
				     {"   ","   ","   ","   ","   ","   ","   ","   "},
				     {"   ","   ","   ","   ","   ","   ","   ","   "},
				     {"W_P","W_P","W_P","W_P","W_P","W_P","W_P","W_P"},
				     {"W_R","W_N","W_B","W_Q","W_K","W_B","W_N","W_R"}}; 

//---------------chess board initialization
                
boolean move(int x,int y)    //---------moving and capturing coins logic  
{  String m="",m1="";
    String mv="",temp;
    Scanner sc=new Scanner(System.in);
    
   
        if(moves.size()==0) // if the coin cannot be moved
                {
                        System.out.println("Unfortunately this coin cannot be moved");
                        temp=sc.nextLine();
                        return false;
                }

         for(;;)
          {

                System.out.println("\nEnter your choice...");
                m1=sc.nextLine();
              

             for(int i=0;i<moves.size();i++)   // checking whether the requested move is available in possible moves vector
            {
                    m=moves.elementAt(i);
                   // System.out.println(m+m1);
                   
                    if(m.equals(m1))
                       { 
                         f=1;
                        
                        cc=board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97];
                        mv+=(char)(48+(x));
                        mv+=(char)(48+(y));
                        mv+=(char)(48+8-(m1.charAt(1)-48));
                        mv+=(char)(48+(m1.charAt(0)-97));
                        mv+=cc;
                      
                        record.push(mv);
                       

                         

                         if(board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97].equals("   "))    //if the destination is empty simply move there
                         {
                              System.out.println(board[x][y]+" : "+(char)(y+97)+(char)(48+8-(x))+"-->"+m1+"\n\n");
                             try {
                                 w.write_to_file(board[x][y]+" : "+(char)(y+97)+(char)(48+8-(x))+"-->"+m1);
                             } catch (Exception ex) {
                                 Logger.getLogger(chessboard.class.getName()).log(Level.SEVERE, null, ex);
                             }
                           board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97]=board[x][y];
                           board[x][y]= board[x][y].replaceAll(board[x][y].toString(),"   ");
                          
                           moves.clear();
                          
                        
                          return true;
                          
                           }
                         if(!board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97].equals("   "))   //if the destination is occupied by enemy capture that position
                         {
                            System.out.println(board[x][y]+" Captures "+board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97]);

                             try {
                                 w.write_to_file(board[x][y]+" Captures "+board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97]);
                             } catch (Exception ex) {
                                 Logger.getLogger(chessboard.class.getName()).log(Level.SEVERE, null, ex);
                             }
                            if(board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97].charAt(2)=='K') // if one player captures another's king, game over
                            {
                                    if(board[x][y].charAt(0)=='W')
                                    {
                                            System.out.println("\n    Player 1 Wins!!!!!       Game over");
                                        try {
                                            w.write_to_file("    Player 1 Wins!!!!!       Game over");
                                        } catch (Exception ex) {
                                            Logger.getLogger(chessboard.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                            exit(0);
                                             }
                                             if(board[x][y].charAt(0)=='B')
                                    {
                                            System.out.println("\n    Player 2 Wins!!!!!       Game over");
                                        try {
                                            w.write_to_file("    Player 2 Wins!!!!!       Game over");
                                        } catch (Exception ex) {
                                            Logger.getLogger(chessboard.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                            exit(0);
                                             }
                                     }

                            board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97]=board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97].replaceAll(board[8-((int)m1.charAt(1)-48)][m1.charAt(0)-97].toString(),board[x][y].toString());
                            board[x][y]=board[x][y].replaceAll(board[x][y].toString(),"   ".toString());

                             moves.clear();
                            // f=1;
                            return true;

                             }
                       }

            }
          if (f==0)
          {
               
            System.out.println("INVALID CHOICE");
          }
          
                     
          }
        
      
}      

  	void print()  ///////////////////////////////////////////////////////////////     Printing the chess board
		{
			char d='a';
			int a=8;
			System.out.print("\n\n\n");
			for(int i=0;i<8;i++)
			{
				if(i==0)
					{
					    System.out.print(" |");		
					    for(int j=0;j<8;j++)
					    System.out.print("__"+(d++)+"__|");
					    System.out.print("\n");
					}
				System.out.print("\n"+(a--)+"|");
				for(int j=0;j<8;j++)
				{
				
                                {
                                     System.out.print(" "+board[i][j]+" |");
                                }
                               
													
				}
                                System.out.print("\n");;
			}
			                          
                            
                               
                        
			
		}
        
        boolean undo()
        {
            uf=0;
            if(record.size()==0)
                {
                       System.out.println("Can't Undo");
                      return false;
                       
                }
                undo=record.pop();

               // System.out.println(undo);

                cc=undo.substring(4,7);
                px=undo.charAt(0)-48;
                py=undo.charAt(1)-48;
                cx=undo.charAt(2)-48;
                cy=undo.charAt(3)-48;
                //cout<<undo;
               //21`,./ System.out.println(board[px][py]+" "+board[cx][cy]);
                if(cc.equals(sp))
                {
                        //fout<<board[cx][cy]<<" Releases "<<cc<<endl;
                   w.write_to_file("Undo "+board[cx][cy]+": "+(char)(cy+97)+(char)(48+8-(cx))+"-->"+(char)(py+97)+(char)(48+8-(px)));
                   board[px][py]= board[px][py].replaceAll(board[px][py].toString(),board[cx][cy].toString());
                    board[cx][cy]= board[cx][cy].replaceAll(board[cx][cy].toString(),"   ");
                   
                     uf=1;
                     return true;
                }
                else
                {
               // fout<<"Undo "<<board[cx][cy]<<": "<<char(cy+97)<<char(48+8-(cx))<<"-->"<<char(py+97)<<char(48+8-(px))<<endl;
                    w.write_to_file(board[cx][cy]+" Releases "+cc);
                    board[px][py]=board[px][py].replaceAll(board[px][py].toString(),board[cx][cy]);
                   board[cx][cy]= board[cx][cy].replaceAll( board[cx][cy].toString(),cc.toString());
                   // System.out.println("hello");
                    
                   uf=1;
                   return true;
              // board[cx][cy]="hi";
               
              // board[cx][cy]="   ";

           }
        }



}


