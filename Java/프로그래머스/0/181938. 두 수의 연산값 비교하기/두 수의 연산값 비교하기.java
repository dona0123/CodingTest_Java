class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str = String.valueOf(a) + "" + String.valueOf(b);
        int num1 = Integer.parseInt(str); 
        int num2 = 2 * a * b;
        
        if (num1 < num2) {
            answer = num2; 
        } else {
            answer = num1; 
        }
            
        return answer;
    }
}