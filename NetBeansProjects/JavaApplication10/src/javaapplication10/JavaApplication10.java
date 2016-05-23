/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author jamessisongkham
 */ 
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication10 {
static int myx, myy =0;
    public static void main(String[] args) {
        while(true){
       thegame();
       getmove();
        }
    }
    static void thegame(){
        char[][] map = new char[10][10];
        map[0][0] = 'x';
        map[2][3] = 'x';
        map[4][4] = 'x';
        map[7][7] = 'x';
        map[8][8] = 'x';
        map[myx] [myy]='J';
        for (int i = 0; i <= map[0].length - 1; i++) {
            for (int j = 0; j <= map[1].length - 1; j++) {
                if (j < map[1].length - 1) {
                    if (map[i][j] != 'J') {
                        System.out.print(".");
                    } else {
                        System.out.print(map[i][j]);
                    }
                } else {
                    if (map[i][j] != 'J') {
                        System.out.println(".");
                    } else {
                        System.out.println(map[i][j]);
                
                    }
                }
            }
        }
    }
    static void getmove(){
         Scanner sc = new Scanner(System.in);
        System.out.println("where would you like to go?");
        myx=sc.nextInt(); 
        System.out.println("where would you like to go?");
        myy=sc.nextInt();}
   
    static void enemy(){
        

        
         
        
    }
                   
    
}
                
            
