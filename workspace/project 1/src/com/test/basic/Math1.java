package com.test.basic;

public class Math1 {

	public static void main(String[] args) {
		
	dividenumbers(20, 20);
	int mulvalue = mulnumbers(20, 20);
	System.out.println("Multiplied value is "+mulvalue);
}

public static void dividenumbers(int val1,int val2){		
	  int divnumber = val1/val2;
	  System.out.println("Divided value is "+divnumber);			  
}

public static int mulnumbers(int val1,int val2){		
	return val1*val2;


	}

}
