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
public class king {
    
    
    	boolean kingmove(int x,int y,char p,chessboard cb) throws Exception//////////////////////////////////////////     King logic
		{
			
			char c,a;
			 String m="";
			//System.out.println("king check";
			//
						
		  if(x+1<8 && y+1<8 && y-1>=0 )
		  {
			
			if((cb.board[x+1][y].equals("   ".toString())))
			{
				c=(char)(y+97);
				System.out.println(c+""+(8-(x+1))+" ");
				m+=c;
				m+=(char)(48+8-(x+1));
				cb.moves.push(m);
				    m="";
				
			}
			else if((cb.board[x+1][y]!="   ") && ((x+1)<8))
			{
				if((p=='W' && cb.board[x+1][y].charAt(0)=='B' )|| ((p=='B' && cb.board[x+1][y].charAt(0)=='W' )))
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x+1))+" ");
					m+=c;
					m+=(char)(48+8-(x+1));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				}
			
				
			}  
					
			//
			if(cb.board[x+1][y+1].equals("   ".toString()) )
			{
				c=(char) ((char)y+97+1);
				System.out.println(c+""+(8-(x+1))+" ");
				m+=c;
				m+=(char)(48+8-(x+1));
				cb.moves.push(m);
				    m="";
				
			}
			else if(cb.board[x+1][y+1]!="   " )
			{
				if(p=='W' && cb.board[x+1][y+1].charAt(0)=='B' || (p=='B' && cb.board[x+1][y+1].charAt(0)=='W' ) )
				{
					c=(char)(y+97+1);
					System.out.println("Capture-"+c+""+(8-(x+1))+" ");
					m+=c;
					m+=(char)(48+8-(x+1));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				}
				
				
			}
			//
			if(cb.board[x+1][y-1].equals("   ".toString()) )
			{
				c=(char)(y+97-1);
				System.out.println(c+""+(8-(x+1))+" ");
				m+=c;
				m+=(char)(48+8-(x+1));
				cb.moves.push(m);
				    m="";
				
			}
			else if(cb.board[x+1][y-1]!="   " )
			{
				if(p=='W' && cb.board[x+1][y-1].charAt(0)=='B' || (p=='B' && cb.board[x+1][y-1].charAt(0)=='W' ))
				{
					c=(char) ((char)y+97-1);
					System.out.println("Capture-"+c+""+(8-(x+1))+" ");
					m+=c;
					m+=(char)(48+8-(x+1));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				}
				
			}
		}
			
			if(cb.board[x][y+1].equals("   ".toString()))
			{
				c=(char) ((char)y+97+1);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);
				    m="";
				
			}
			else if(cb.board[x][y+1]!="   ")
			{
				if(p=='W' && cb.board[x][y+1].charAt(0)=='B' || (p=='B' && cb.board[x][y+1].charAt(0)=='W'))
				{
					c=(char) ((char)y+97+1);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				}
				
				
			}
			//
			if(cb.board[x][y-1].equals("   ".toString()))
			{
				c=(char) ((char)y+97-1);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);
				    m="";
				
			}
			else if(cb.board[x][y-1]!="   ")
			{
				if(p=='W' && cb.board[x][y-1].charAt(0)=='B' || (p=='B' && cb.board[x][y-1].charAt(0)=='W'))
				{
					c=(char) ((char)y+97-1);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				}
			
				
			}
			//
			//
		if(x-1>=0 && y+1<8 && y-1>=0)
		{
		
			
			if(cb.board[x-1][y].equals("   ".toString()))
			{
				c=(char) ((char)y+97);
				//System.out.println("hello";
				System.out.println(c+""+(8-(x-1))+" ");
				m+=c;
				m+=(char)(48+8-(x-1));
				cb.moves.push(m);
				m="";
				
			}
			else if(cb.board[x-1][y]!="  ")
			{
				if(p=='W' && cb.board[x-1][y].charAt(0)=='B' || (p=='B' && cb.board[x-1][y].charAt(0)=='W'))
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x-1))+" ");
					m+=c;
					m+=(char)(48+8-(x-1));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				}
			
				
			}
			//
			if(cb.board[x-1][y-1].equals("   ".toString()))
			{
				c=(char) ((char)y+97-1);
				System.out.println(c+""+(8-(x-1))+" ");
				m+=c;
				m+=(char)(48+8-(x-1));
				cb.moves.push(m);
				    m="";
				
			}
			else if(cb.board[x-1][y-1]!="   ")
			{
				if(p=='W' && cb.board[x-1][y-1].charAt(0)=='B' || (p=='B' && cb.board[x-1][y-1].charAt(0)=='W'))
				{
					c=(char) ((char)y+97-1);
					System.out.println("Capture-"+c+""+(8-(x-1))+" ");
					m+=c;
					m+=(char)(48+8-(x-1));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				}
			
				
			}
			//
			if(cb.board[x-1][y+1].equals("   ".toString()))
			{
				c=(char) ((char)y+97+1);
				System.out.println(c+""+(8-(x-1))+" ");
				m+=c;
				m+=(char)(48+8-(x-1));
				cb.moves.push(m);
				    m="";
				
			}
			else if(cb.board[x-1][y+1]!="   ")
			{
				if(p=='W' && cb.board[x-1][y+1].charAt(0)=='B' || (p=='B' && cb.board[x-1][y+1].charAt(0)=='W'))
				{
					c=(char) ((char)y+97+1);
					System.out.println("Capture-"+c+""+(8-(x-1))+" ");
					m+=c;
					m+=(char)(48+8-(x-1));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				}
				
			}
	   } 
	      
			////
			
			  try {
                                return cb.move(x,y);
                                 
                             } catch (Exception ex) {
                                     System.out.println(ex);
                                     return false;
                             }
						
			
		    
			
		
		}
}
