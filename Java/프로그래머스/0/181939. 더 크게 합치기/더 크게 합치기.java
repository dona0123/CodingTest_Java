class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = String.valueOf(a) + "" + String.valueOf(b); 
        String str2 = String.valueOf(b) + "" + String.valueOf(a); 
        
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        
        if (num1 < num2) {
            answer = num2; 
        } else {
            answer = num1;
        }
        return answer;
    }
}