class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        // goal의 각 단어를 두 카드 뭉치에서 순서대로 비교 
        int i=0, j=0; 
        for(String word : goal) {
            if(i < cards1.length && cards1[i].equals(word)) {
                i++; 
            } else if (j < cards2.length && cards2[j].equals(word)){
                j++;
            } else {
                answer = "No"; 
            } 
        } 
        
        return answer;
    }
}