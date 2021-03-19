/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author PUGAZHENDI
 */
public class pawn {
    char a,c,z;
    
    	boolean pawnmove(int x,int y,char p,chessboard cb)throws Exception //////////////////////////////////////////      Pawn logic
		 { 
              
		   int b;
		    String m="";
                     System.out.println(cb.board[x-1][y]);
		    
			if(p=='W') //---------------------------Player 1
			{
				if( cb.board[x-1][y].equals("   ".toString()))
				{
					c=(char)(y+'a');
					System.out.println(c+""+(8-(x-1))+" "); //(8-(x-1)+'0')
					m+=c;
					m+=(char)('0'+8-(x-1));
				    cb.moves.push(m);
				    m="";
				}
				
				if(x==6 && cb.board[x-1][y].equals("   ".toString())&& cb.board[x-2][y].equals("   ".toString()))
				{
							    
					System.out.println(c+""+(8-(x-2))+" ");
					m+=c;
					z=(char)('0'+8-(x-2));
					m+=z;
                                        //System.out.println(m);
				    cb.moves.push(m);
				    m="";
					
				}
				if(y+1<8 && y-1>=0)
                                {
				if(!cb.board[x-1][y+1].equals("   ".toString()) && cb.board[x-1][y+1].charAt(0)=='B')
				{
					c=(char)(y+'a'+1);
					System.out.println("Capture-"+c+""+(8-(x-1))+" ");
					m+=c;
					m+=(char)('0'+8-(x-1));
					//System.out.println(+m;
				    cb.moves.push(m);
				    m="";	
				}
			    if(!cb.board[x-1][y-1].equals("   ".toString()) && cb.board[x-1][y-1].charAt(0)=='B')
				{
					c=(char)(y+'a'-1);
					System.out.println("Capture-"+c+""+(8-(x-1))+" ");
					m+=c;
					m+=(char)('0'+8-(x-1));
				    cb.moves.push(m);
				    m="";	
				}
								
			         }
                                
                                
                                 try {
                                 boolean r=cb.move(x,y);
                                 return r;
                             } catch (Exception ex) {
                                     System.out.println(ex);
                             }
                               // System.out.println("in pawm"+r);
				
                        }
			if(p=='B') //--------------------------------------Player 2
			{
				if( cb.board[x+1][y].equals("   ".toString()))
				{
					c=(char)(y+'a');
					System.out.println(c+""+(8-(x+1))+" ");
					m+=c;
					m+=(char)('0'+8-(x+1));
				    cb.moves.push(m);
				    m="";
				}
				if(x==1 && cb.board[x+1][y].equals("   ".toString())&& cb.board[x+2][y].equals("   ".toString()))
				{
						    
					System.out.println(c+""+(8-(x+2))+" ");
					m+=c;
					z=(char)('0'+8-(x+2));
					m+=z;
				    cb.moves.push(m);
				    m="";
					
				}
			    
				if(y+1<8 && y-1>=0)
                                {
				if(!cb.board[x+1][y+1].equals("   ".toString()) && cb.board[x+1][y+1].charAt(0)=='W')
				{
					c=(char)(y+'a'+1);
					System.out.println("Capture-"+c+""+(8-(x+1))+" ");
					m+=c;
					m+=(char)('0'+8-(x+1));
					
				    cb.moves.push(m);
				    m="";	
				}
			    if(!cb.board[x+1][y-1].equals("   ".toString()) && cb.board[x+1][y-1].charAt(0)=='W')
				{
					c=(char)(y+'a'-1);
					//System.out.println(+x;
					System.out.println("Capture-"+c+""+(8-(x+1))+" ");
					m+=c;
					m+=(char)('0'+8-(x+1));
				    cb.moves.push(m);
				    m="";	
				}
				
				
						
			}
                                   try {
                                return cb.move(x,y);
                                 
                             } catch (Exception ex) {
                                     System.out.println(ex);
                                    // return false;
                             }
                        }
			return false;
		}
}
