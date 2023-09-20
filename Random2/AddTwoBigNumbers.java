import java.util.*;

public class AddTwoBigNumbers{
    public static void main(String[] args){
        String num1 = "9913455656567576587"; //  100 n=3
        String num2 = "9999956445645646467"; //  100 m =3
        
        String num = add(num1, num2);
        System.out.println(num);
    }
    
    private static String add(String num1, String num2){
        int carry = 0;
        int maxLength = Math.max(num1.length(), num2.length()); // 3
        int[] result = new int[maxLength + 1]; // 4
        int index = 0;
        for(int i = num1.length() - 1, j = num2.length()-1; i>=0 || j>= 0 || carry > 0; i--, j--){
            int digit1 = i>=0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j>=0 ? num2.charAt(j) - '0' : 0;
            
            int sum = digit1 + digit2 + carry;
            result[index] = sum%10;
            carry = sum/10;
            index++;
            
        } // TC = O(N)
        
        StringBuilder sumb = new StringBuilder();
        for(int i = result.length-1; i>=0; i--){
            if(i == result.length-1 && result[i] == 0){
                continue;
            }
            sumb.append(result[i]);
            
        } // O(N)
        return sumb.toString();
    }
}