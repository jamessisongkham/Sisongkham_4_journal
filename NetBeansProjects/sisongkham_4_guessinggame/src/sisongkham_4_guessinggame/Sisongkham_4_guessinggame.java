/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisongkham_4_guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jamessisongkham
 */
public class Sisongkham_4_guessinggame {

    static String username;
    static int guess;
    static int magicnumber;
    static Random randy = new Random(); 
    static boolean playagain;
    
    
    public static void main(String[] args) {
        playagain = true;
        magicnumber = randy.nextInt(100);
        System.out.println("hello, would you like to play a game?");
        System.out.println("what is your name?");
        Scanner userinputname = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        //two main ones we need
        int something = sc.nextInt();
       
    }
    
}
