package String;

public class Vowels {
	public static void main(String[] args) {
		
		String S= "Hello aunty,How are you ?";
		int count=0;
		
		
		String L = S.toLowerCase();
		
		for (int i=0;i<L.length();i++) {
			char C= L.charAt(i);
			if(C=='a' || C=='e' || C=='i' || C=='o' || C=='u' ) {
				
				count++;
				System.out.println(C);
			}
			
		}
		System.out.println("The Total No of Vowles is: "+count);
		
	}

}
