package main.java.yaksha;

import java.util.Scanner;

public class CinemaTicket {

	public boolean calculateCost(int no, String ref, String cou, String cir) {
		float cost=1;
		 
         if(cir.equalsIgnoreCase("k")){
             cost=(float)(no*75);
             if(no>20){
                 cost=(float)(cost*0.9);
             }
            
         if(cou.equalsIgnoreCase("y")){
                cost=(float)(cost*0.98);
            } 
             
         if(ref.equalsIgnoreCase("y")){
                 cost=(float)(cost+(no*50));
            }
            System.out.printf("Ticket cost:%.2f",cost);
            }
         else if(cir.equalsIgnoreCase("q")){
             cost=(float)(no*150);
             if(no>20){
                 cost=(float)(cost*0.9);
             }
            
         if(cou.equalsIgnoreCase("y")){
                cost=(float)(cost*0.98);
            } 
             
         if(ref.equalsIgnoreCase("y")){
                 cost=(float)(cost+(no*50));
            }
            System.out.printf("Ticket cost:%.2f",cost);
            }
         else{
               System.out.print("Invalid Input");
           }
		return true;
	}

	  
}
