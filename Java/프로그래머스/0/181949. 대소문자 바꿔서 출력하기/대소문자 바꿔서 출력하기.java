import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] cArr = a.toCharArray(); 
        
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i]; 
            if (Character.isUpperCase(c)) {
                cArr[i] = Character.toLowerCase(c); 
            } else if (Character.isLowerCase(c)) {
                cArr[i] = Character.toUpperCase(c); 
            }
            
        }
        
        String output = new String(cArr); 
            System.out.print(output); 
    }
}