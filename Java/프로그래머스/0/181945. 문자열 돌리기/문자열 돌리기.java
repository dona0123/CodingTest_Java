import java.util.Scanner;
import java.util.Arrays; 


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] str = a.toCharArray(); 
        for (char c : str) {
            System.out.println(c);
        }
    }
}