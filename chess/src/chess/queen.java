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
public class queen {
    
    
    void horizontal_and_vertical(int x1,int y1,char p,chessboard cb) //----------------------------------------- Possible Horizontal and vertical cb.moves check
		{  
		char c;
		int x,y;
		String m="";
		 
			
			for( x=x1+1,y=y1;x<8;x++)
			{
				if(cb.board[x][y].equals("   ".toString()))
				{
				c= (char) ((char)y+97);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);
				    m="";
				
				}
				
				else if((!cb.board[x][y].equals("   ".toString())) )
			 {
				if((p=='W' && cb.board[x][y].charAt(0)=='B' ) || (p=='B' && cb.board[x][y].charAt(0)=='W'))
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				    break;
				}
				else if(cb.board[x][y].charAt(0)==p) 
			         break;
				
				
			 } 
			  
			}
			
			//
				for(x=x1-1,y=y1;x>=0;x--)
			{
				if(cb.board[x][y].equals("   ".toString()))
				{
				c=(char) ((char)y+97);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);
				    m="";
				}
				
				else if(!cb.board[x][y].equals("   ".toString()))
			    {   
				if((p=='W' && cb.board[x][y].charAt(0)=='B' ) || (p=='B' && cb.board[x][y].charAt(0)=='W'))
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				    break;
				}
				else if(cb.board[x][y].charAt(0)==p) 
			         break; 
				
			 } 
			   
			}
			
			//
				for( x=x1,y=y1+1;y<8;y++)
			{
				if(cb.board[x][y].equals("   ".toString()))
				{
				c=(char) ((char)y+97);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);
				    m="";
				}
				
				else if((!cb.board[x][y].equals("   ".toString())) )
			 {
				if((p=='W' && cb.board[x][y].charAt(0)=='B' ) || (p=='B' && cb.board[x][y].charAt(0)=='W'))
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				    break;
				}
				else if(cb.board[x][y].charAt(0)==p) 
			         break;
				
			 } 
			  
			}
			
			for( x=x1,y=y1-1;y>=0;y--)
			{
				if(cb.board[x][y].equals("   ".toString()))
				{
				c=(char) ((char)y+97);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);
				    m="";
				}
				
				else if((!cb.board[x][y].equals("   ".toString())) )
			 {
				if((p=='W' && cb.board[x][y].charAt(0)=='B' ) || (p=='B' && cb.board[x][y].charAt(0)=='W'))
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";
					break;	
				}
				else if(cb.board[x][y].charAt(0)==p) 
			         break;
				
			 } 
			   
			}
			
		}
    //------------------------------------------
    
    	void diagonal(int x1,int y1,char p,chessboard cb) //----------------------------------------- Possible Diagonal cb.moves check  
		{
			char c;
		      int x, y;
		String m="";
			
			
			for( x=x1+1,y=y1+1;x<8 && y<8;x++,y++)
			{
				if(cb.board[x][y].equals("   ".toString()))
				{
				c=(char)(y+97);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);  //----------------------------  storing the cb.moves in vector
				    m="";
				
				}
				
				else if((!cb.board[x][y].equals("   ".toString())) )
			 {
				if((p=='W' && cb.board[x][y].charAt(0)=='B' ) || (p=='B' && cb.board[x][y].charAt(0)=='W'))  // check if the position is able to capture
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				    break;
				}
				else if(cb.board[x][y].charAt(0)==p) 
			         break;
				
				
			 } 
			  
			}
			
			for(x=x1-1 , y=y1-1; x>=0 && y>=0;x--,y--)
			{
				if(cb.board[x][y].equals("   ".toString()))
				{
				c=(char) ((char)y+97);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);
				    m="";
				}
				
				else if(!cb.board[x][y].equals("   ".toString()))
			    {   
				if((p=='W' && cb.board[x][y].charAt(0)=='B' ) || (p=='B' && cb.board[x][y].charAt(0)=='W'))
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					
				    cb.moves.push(m);
				    m="";	
				    break;
				}
				else if(cb.board[x][y].charAt(0)==p) 
			         break; 
				
			 } 
			   
			}
			
			//
				for(x=x1-1,y=y1+1;y<8 && x>=0;y++,x--)
			{
				if(cb.board[x][y].equals("   ".toString()))
				{
				c=(char) ((char)y+97);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);
				    m="";
				}
				
				else if((!cb.board[x][y].equals("   ".toString())) )
			 {
				if((p=='W' && cb.board[x][y].charAt(0)=='B' ) || (p=='B' && cb.board[x][y].charAt(0)=='W'))
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					//System.out.println(m;
				    cb.moves.push(m);
				    m="";	
				    break;
				}
				else if(cb.board[x][y].charAt(0)==p) 
			         break;
				
			 } 
			  
			}
			
			for(x=x1+1,y=y1-1;y>=0 && x<8;y--,x++)
			{
				if(cb.board[x][y].equals("   ".toString()))
				{
				c=(char) ((char)y+97);
				System.out.println(c+""+(8-(x))+" ");
				m+=c;
				m+=(char)(48+8-(x));
				cb.moves.push(m);
				    m="";
				}
				
				else if((!cb.board[x][y].equals("   ".toString())) )
			 {
				if((p=='W' && cb.board[x][y].charAt(0)=='B' ) || (p=='B' && cb.board[x][y].charAt(0)=='W'))
				{
					c=(char) ((char)y+97);
					System.out.println("Capture-"+c+""+(8-(x))+" ");
					m+=c;
					m+=(char)(48+8-(x));
					
				    cb.moves.push(m);
				    m="";
					break;	
				}
				else if(cb.board[x][y].charAt(0)==p) 
			         break;
				
			 } 
			   
			}

		}
    
}
