package sampleHello;

public class StringbufferExample {

	public static void main(String[] args) {
		String str = "Welcome";
		System.out.println(str.concat(" to Java Quest!"));
		
		//StringBuilder
		StringBuilder sbl = new StringBuilder("Welcome");
		System.out.println(sbl.append(" to Java Quest!"));
		System.out.println(sbl.replace(11, 15, "Selenium"));
		System.out.println(sbl.indexOf("Q"));
		
		//StringBuffer
		StringBuffer sbr = new StringBuffer("Hello");
		System.out.println(sbr.insert(5, " World"));
		System.out.println(sbr.delete(5,11));
		StringBuffer sbr1 = new StringBuffer("Hello World");
		System.out.println(sbr.compareTo(sbr1));
		
		//reverse
		String text = "Kayak";
		StringBuffer strB = new StringBuffer(text);
		//System.out.println(str.reverse());
		String reversedText = strB.reverse().toString();
		System.out.println(reversedText);
		if(text.equals(reversedText))
		{
			System.out.println("Its a palindrome " + reversedText);
		}else
		{
			System.out.println(reversedText + " is not a palindrome "+ text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}