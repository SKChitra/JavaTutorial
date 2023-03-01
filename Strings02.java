package sampleHello;

public class Strings02 {

	public static void main(String[] args) {
		String text = "Welcome to JavaQuEst";
		//System.out.println(text.toUpperCase());
		//System.out.println(text.toLowerCase());
		//System.out.println(text.length());
		//System.out.println(text.charAt(3));
		//System.out.println(text.replace("a", "o"));
		//System.out.println(text.indexOf("e"));
		System.out.println(text.lastIndexOf("e"));//case sensitive
		
		String text2 = "Lets Code";
		System.out.println(text.concat(text2));
		
		
	}

}
