package String;

public class Reverse {
	public static void main(String[] args) {
		String s="YTNUA olleH";
		String R="";
		
		char[] a= s.toCharArray();
		
		for (int i=0;i<=a.length;i++) {
			for (int j=i-1;j>=0;j--)
			R=R+a[j];
			
			}
		System.out.println(R);
		
		
	}

}
