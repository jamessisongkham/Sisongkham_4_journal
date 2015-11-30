/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgamejamessisongkham_4_;

import java.util.Scanner;



/**
 *
 * @author jamessisongkham
 */
class player {
    static Scanner james = new Scanner(System.in);
    static String answer;
    static String choice;
    static String username;
    static String pickup;
    static int money =0;
    static int xp =0;
    static boolean goodAnswer = false;
    
    
    public static void main(String[] args) {
        start();
    }

    
        static void start() {
        Scanner yesorno = new Scanner(System.in);
        System.out.println("do you want to play a game");
        choice = yesorno.nextLine();
        
        if ("yes".equalsIgnoreCase(choice)){
        entercastle(); 
        
        }       
        else if("no".equalsIgnoreCase(choice)){
        start();    
        }
        
    }
    static void entercastle(){
        System.out.println("you need to PICKUPSWORD " + username + " in order to move on.");
        Scanner pickup1 = new Scanner (System.in);
        pickup = pickup1.nextLine();
        if("pickupsword".equalsIgnoreCase(pickup)){
            enternextroom();
        }
    } 
       static void enternextroom(){  
           Scanner killormoveon = new Scanner(System.in);
           System.out.println("kill everyone in the room(kill) or move on to the next(moveon)");
           choice = killormoveon.nextLine();
           
           if ("kill".equalsIgnoreCase(choice)){
           money +=100;
           System.out.println("+100points");
           enterroom2();
           }
               
           else if("moveon".equalsIgnoreCase(choice)){
             enterroom2();    
           }}
           
           
       
      
        static void enterroom2(){
            Scanner leftdoororrightdoor = new Scanner(System.in);
            System.out.println("choose door on the LEFT or door on the RIGHT");
            choice = leftdoororrightdoor.nextLine();
            
            if("left".equalsIgnoreCase(choice)){
                System.out.println("opening the door activates a trapdoor in which you fall into and die");
            }
                 
            else if("right".equalsIgnoreCase(choice)){
                        enterroom3();{
            }}
        }
                    
        static void enterroom3(){
            System.out.println("you must PICKUPREDBOOK " + username + " in order to move on ");
            Scanner pickup1 = new Scanner (System.in);
        pickup = pickup1.nextLine();
        
        if("pickupredbook".equalsIgnoreCase(pickup)){
            readbook();
}

        }
            
        static void readbook(){
            xp +=500;
            
            
            
}
           
       }      
            
              
                
            
                        

                                            

        
        // TODO code application logic here
    

        
    

    
