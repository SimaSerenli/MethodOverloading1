/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloadig1;

/**
 *
 * @author SİMA SERENLİOĞLU
 */
public class MethodOverloadig1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int first = 4;
       int second = 7;
       double num1 = 2.3;
       double num2 = 6.8;
       
       int absolute_int = difference(first,second) ;
       System.out.println(first + " ve "+ second + " mutlak farkı " + absolute_int);
       double absolute_double = difference(num1,num2);
        System.out.println(num1 + " ve "+ num2 + " mutlak farkı " + absolute_double);
    }
   
    public static int difference(int x,int y){
        int difference;
        if(x>y){
         difference = x-y;
        }
        else{
         difference = y-x;
        }
        return difference;
        
    }
    public static double difference(double x,double y){
        double difference;
        if(x>y){
         difference = x-y;
        }
        else{
         difference = y-x;
        }
        return difference;
    }
}

