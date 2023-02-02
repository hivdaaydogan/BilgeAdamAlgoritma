package lesson004;

import javax.print.DocFlavor.STRING;

public class Question035 {

	public static void main(String[] args) {
		// Java,Spring,Postgre,React
		
		//Java
		//Spring
		//Postgre
		//React
		
		String list = "Java,Spring,Postgre,React";
		String[] str = list.split(",");
		System.out.println(str[0]);
		System.out.println(str[1]);
	    System.out.println(str[2]);
	    System.out.println(str[3]);
	
	    
//		String text = "Java,Spring,Postgre,React";
//		System.out.println(text.substring(0, 4)); 
//		System.out.println(text.substring(5, 11)); 
//		System.out.println(text.substring(12, 19)); 
//		System.out.println(text.substring(20, 25));   // kullanışlı bir çözüm değil
	    
	    System.out.println("\n************\n");
	    
	    String stringText = "Java,Spring,Postgre,React";
	    int index = 0;
	    for (int i=0; i<stringText.length();i++) {
	    	
	    	if(stringText.charAt(i)== ',') {
	    		System.out.println(stringText.substring(index,i));
	    		//index =0 ,i=4
	    		//index =5 ,i=11
	    		index =i+1;
	    		//index 5
	    		//index == 12
	    	}
	    }
	    System.out.println(stringText.substring(index));
		

	    
	}    
}
