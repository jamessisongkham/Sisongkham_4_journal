/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisongkham_4_challenge0;

/**
 *
 * @author jamessisongkham
 */
public class Sisongkham_4_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for(int i = 0;i < 1000;i++){
                          if (isdivisibleby11(i) & isdivisibleby5(i) ){
                              System.out.println("animatethis");
                          } else if(isdivisibleby11(i) & isdivisibleby3(i)){
                              System.out.println("herr direktor");
                                      }    else if(isdivisibleby11(i) & isdivisibleby2(i)){
                                          
                          }    else if(isdivisibleby11(i) & isdivisibleby5(i)){
         }
                                    
        // TODO code application logic here
                                      }                                 }
                          
static boolean isdivisibleby2 (int somenum0){
        return (somenum0 % 2 ==0);
    }
static boolean isdivisibleby3 (int somenum1){
        return (somenum1 % 3 ==0);
    }

static boolean isdivisibleby5 (int somenum2){
        return (somenum2 % 5 ==0);
    }
static boolean isdivisibleby11 (int somenum3){
        return (somenum3 % 11 ==0);
    }




}
