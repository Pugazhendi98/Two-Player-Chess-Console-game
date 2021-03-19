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
public class knight {
    
    boolean knightmove(int x,int y,char p,chessboard cb) //    Knight logic checking all possible cb.moves
    {

            char c,a;
            //m="";m1="";
            String m="";

            ////




            if((x-2>=0 && y-1>=0)&& cb.board[x-2][y-1].equals("   ".toString()))
            {
                    c=(char) ((char)y+97-1);
                    System.out.println(c+""+(8-(x-2))+"");
                    m+=c;
                    m+=(char)(48+8-(x-2));
                    cb.moves.push(m);
                        m="";

            }
            else if((x-2>=0 && y-1>=0)&&!(cb.board[x-2][y-1].equals("   ".toString())))
            {
                    if((p=='W' && cb.board[x-2][y-1].charAt(0)=='B' )|| ((p=='B' && cb.board[x-2][y-1].charAt(0)=='W' )))
                    {
                            c=(char) ((char)y+97-1);
                            System.out.println("Capture-"+c+""+(8-(x-2))+"");
                            m+=c;
                            m+=(char)(48+8-(x-2));
                    //	System.out.println(m;
                        cb.moves.push(m);
                        m="";	
                    }


            } 

            if((x-2>=0 && y+1<8)&& cb.board[x-2][y+1].equals("   ".toString()))
            {
                    c=(char) ((char)y+97+1);
                    System.out.println(c+""+(8-(x-2))+"");
                    m+=c;
                    m+=(char)(48+8-(x-2));
                    cb.moves.push(m);
                        m="";

            }
            else if((x-2>=0 && y-1>=0)&&!(cb.board[x-2][y+1].equals("   ".toString())))
            {
                    if((p=='W' && cb.board[x-2][y+1].charAt(0)=='B' )|| ((p=='B' && cb.board[x-2][y+1].charAt(0)=='W' )))
                    {
                            c=(char) ((char)y+97+1);
                            System.out.println("Capture-"+c+""+(8-(x-2))+"");
                            m+=c;
                            m+=(char)(48+8-(x-2));
                    //	System.out.println(m;
                        cb.moves.push(m);
                        m="";	
                    }


            }

            if((x-1>=0 && y-2>=0) && cb.board[x-1][y-2].equals("   ".toString()))
            {
                    c=(char) ((char)y+97-2);
                    System.out.println(c+""+(8-(x-1))+"");
                    m+=c;
                    m+=(char)(48+8-(x-1));
                    cb.moves.push(m);
                        m="";

            }
            else if((x-1>=0 && y-2>=0) &&!(cb.board[x-1][y-2].equals("   ".toString())))
            {
                    if((p=='W' && cb.board[x-1][y-2].charAt(0)=='B' )|| ((p=='B' && cb.board[x-1][y-2].charAt(0)=='W' )))
                    {
                            c=(char) ((char)y+97-2);
                            System.out.println("Capture-"+c+""+(8-(x-1))+"");
                            m+=c;
                            m+=(char)(48+8-(x-1));
                    //	System.out.println(m;
                        cb.moves.push(m);
                        m="";	
                    }

       }

       if((x-1>=0 && y+2<8)&& cb.board[x-1][y+2].equals("   ".toString()))
            {
                    c=(char) ((char)y+97+2);
                    System.out.println(c+""+(8-(x-1))+"");
                    m+=c;
                    m+=(char)(48+8-(x-1));
                    cb.moves.push(m);
                        m="";

            }
            else if((x-1>=0 && y+2<8)&&!(cb.board[x-1][y+2].equals("   ".toString())))
            {
                    if((p=='W' && cb.board[x-1][y+2].charAt(0)=='B' )|| ((p=='B' && cb.board[x-1][y+2].charAt(0)=='W' )))
                    {
                            c=(char) ((char)y+97+2);
                            System.out.println("Capture-"+c+""+(8-(x-1))+"");
                            m+=c;
                            m+=(char)(48+8-(x-1));
                            //System.out.println(m;
                        cb.moves.push(m);
                        m="";	
                    }

       }





            if((x+2<8 && y+1<8) && cb.board[x+2][y+1].equals("   ".toString()))
            {
                    c=(char) ((char)y+97+1);
                    System.out.println(c+""+(8-(x+2))+"");
                    m+=c;
                    m+=(char)(48+8-(x+2));
                    cb.moves.push(m);
                        m="";

            }
            else if((x+2<8 && y+1<8) &&!(cb.board[x+2][y+1].equals("   ".toString())))
            {
                    if((p=='W' && cb.board[x+2][y+1].charAt(0)=='B' )|| ((p=='B' && cb.board[x+2][y+1].charAt(0)=='W' )))
                    {
                            c=(char) ((char)y+97+1);
                            System.out.println("Capture-"+c+""+(8-(x+2))+"");
                            m+=c;
                            m+=(char)(48+8-(x+2));
                           // System.out.println(m;
                        cb.moves.push(m);
                        m="";	
                    }


            } 

            if((x+2<8 && y-1>=0) && cb.board[x+2][y-1].equals("   ".toString()))
            {
                    c=(char) ((char)y+97-1);
                    System.out.println(c+""+(8-(x+2))+"");
                    m+=c;
                    m+=(char)(48+8-(x+2));
                    cb.moves.push(m);
                        m="";

            }
            else if((x+2<8 && y-1>=0) &&!(cb.board[x+2][y-1].equals("   ".toString())))
            {
                    if((p=='W' && cb.board[x+2][y-1].charAt(0)=='B' )|| ((p=='B' && cb.board[x+2][y-1].charAt(0)=='W' )))
                    {
                            c=(char) ((char)y+97-1);
                            System.out.println("Capture-"+c+""+(8-(x+2))+"");
                            m+=c;
                            m+=(char)(48+8-(x+2));
                            //System.out.println(m;
                        cb.moves.push(m);
                        m="";	
                    }


            } 



        if((x+1<8 && y+2<8) && cb.board[x+1][y+2].equals("   ".toString()))
            {
                    c=(char) ((char)y+97+2);
                    System.out.println(c+""+(8-(x+1))+"");
                    m+=c;
                    m+=(char)(48+8-(x+1));
                    cb.moves.push(m);
                        m="";

            }
            else if((x+1<8 && y+2<8) && !(cb.board[x+1][y+2].equals("   ".toString())))
            {
                    if((p=='W' && cb.board[x+1][y+2].charAt(0)=='B' )|| ((p=='B' && cb.board[x+1][y+2].charAt(0)=='W' )))
                    {
                            c=(char) ((char)y+97+2);
                            System.out.println("Capture-"+c+""+(8-(x+1))+"");
                            m+=c;
                            m+=(char)(48+8-(x+1));
                            //System.out.println(m;
                        cb.moves.push(m);
                        m="";	
                    }

       }

           if((x+1<8 && y-2>=0) && cb.board[x+1][y-2].equals("   ".toString()))
            {
                    c=(char) ((char)y+97-2);
                    System.out.println(c+""+(8-(x+1))+"");
                    m+=c;
                    m+=(char)(48+8-(x+1));
                    cb.moves.push(m);
                        m="";

            }
            else if((x+1<8 && y-2>=0) &&!(cb.board[x+1][y-2].equals("   ".toString())))
            {
                    if((p=='W' && cb.board[x+1][y-2].charAt(0)=='B' )|| ((p=='B' && cb.board[x+1][y-2].charAt(0)=='W' )))
                    {
                            c=(char) ((char)y+97-2);
                            System.out.println("Capture-"+c+""+(8-(x+1))+"");
                            m+=c;
                            m+=(char)(48+8-(x+1));

                        cb.moves.push(m);
                        m="";	
                    }

       }





           
               return cb.move(x,y);
                                 
                            


    }
    
}
