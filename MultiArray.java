package sampleHello;

public class MultiArray {

	public static void main(String[] args) {
		
	/*	String[][] multiArray = new String[2][2];
		multiArray[0][0]= "Toyota";
		multiArray[0][1]="Tesla";
		multiArray[1][0]="Prius";
		
		System.out.println("Car maker is  " 
				+multiArray[0][0] + 
				" & model is " + multiArray[1][0]);*/

		String[][] multiArray = 
		{
			{"Toyota", "Audi", "Tata", "Tesla"},
			{"Prius", "Q7", "Indica", "Model Y"},
			{"Japan", "Germany", "India", "USA"}
		};	
	
		System.out.println("Car Maker is " 
			+multiArray[0][0] + 
			" Model is " + multiArray[1][0]
	+" Country is "+multiArray[2][0]);
	
		System.out.println("Car Maker is " 
			+multiArray[0][1] +
			" Model is " + multiArray[1][1]
	+" Country is "+multiArray[2][1]);
	
		
	for(int i =0;i<multiArray[0].length; i++)
	{	System.out.println(
				multiArray[0][i] + " " +
				multiArray[1][i]+ " "+
				multiArray[2][i] 
				);
		}
	}

}
