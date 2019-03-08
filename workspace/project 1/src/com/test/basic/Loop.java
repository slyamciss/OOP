package com.test.basic;

public class Loop {

	public static void main(String[] args) {
		  for (int i = 0; i < 10 ; i= i+1) {
		      System.out.println("This is Test "+i);			  
		  }	  
	  int Loop_value = 15;				  
	  while (Loop_value < 10 ) {
		    System.out.println("Value of Loop value is "+Loop_value);	
		    if (Loop_value == 5) {
				break;
			}
		    Loop_value = Loop_value + 1 ;
	     }	  
	  int loop_var = 15; 
	  
	    do {
		    System.out.println("Value of Loop Variable is "+loop_var);
		    loop_var++;
	     } while (loop_var < 10);
	}

}
