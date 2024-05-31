package String;

public class Rearrange {
	public static void main(String[] args) {
        String I = "12345";
        String O = transformNumber(I);
        System.out.println("Output: " + O);
    }
    
    public static String transformNumber(String number) {
        // Rearrange the digits by swapping the second digit with the last digit
        char[] R = number.toCharArray();
        char temp = R[0];
        R[0] = R[4];
        R[4] = temp;
        
        // Convert the character array back to a string
        String output = new String(R);
        
        return output;
    }

}
