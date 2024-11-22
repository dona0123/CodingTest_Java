import java.util.HashMap; 

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] answer = new int[photo.length]; 
        
        // name과 yearning을 Map에 삽입 
        HashMap<String, Integer> score = new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
            score.put(name[i], yearning[i]); 
        }
        
        // 각 1차원 배열마다 그리움 점수 계산 
        for(int i=0; i<photo.length; i++) {
            int sum = 0; 
            for(int j=0; j<photo[i].length; j++) {
                sum += score.getOrDefault(photo[i][j],0); 
            }
            answer[i] = sum; 
        }
        
        return answer;
    }
}