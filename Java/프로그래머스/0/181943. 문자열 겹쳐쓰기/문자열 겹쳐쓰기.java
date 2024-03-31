class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        char[] myArr = my_string.toCharArray(); 
        char[] overArr = overwrite_string.toCharArray(); 
        
        int j = 0; 
        for (int i = s; i < s + overArr.length; i++) {
            myArr[i] = overArr[j++];  
        }
        
        String answer = new String(myArr);
        return answer;
    }
}