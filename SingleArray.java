package sampleHello;

import java.util.ArrayList;

public class SingleArray {
	public static void main (String [] args){
		String[] Dow = new String[7];
		Dow[0] = "Sunday";
		Dow[1] = "Monday";
		Dow[2] = "Tuesday";
		
		double[] floatArray = new double[3];
		floatArray[0]= 100;
		floatArray[1]= 122;
		System.out.println(floatArray[0]);
				
		
		
		

		
		String[]dow = {"Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Satuerday"};
		//System.out.println(dow.length);
		//System.out.println(dow[0].indexOf("a"));
		//System.out.println(dow[3].replace("Wednesday", "January"));
		//System.out.println(dow[3]);
		dow[3]= dow[3].replace("Wednesday", "January");
		//System.out.println(dow[3]);
		//System.out.println(dow[6].replace("e", ""));
		System.out.println(dow[0]);
		
		for(int i =0; i<dow.length; i++) {
			System.out.println(dow[i]);
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
}
