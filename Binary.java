package String;

public class Binary {
	 public static void main(String[] args) {
	        int n = 110101;
	        boolean B = true;
	        String num = String.valueOf(n);

	        for (int i = 0; i < num.length(); i++) {
	            char digit = num.charAt(i);
	            if (digit != '0' && digit != '1') {
	                B = false;
	                break;
	            }
	        }
	        
	        System.out.println("Is binary: " + B);
	    }

}
