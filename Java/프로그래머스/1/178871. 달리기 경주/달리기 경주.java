import java.util.HashMap; 

class Solution {
    
    HashMap<String, Integer> playerMap = new HashMap<>(); 
    
    public String[] solution(String[] players, String[] callings) {
        
        // Map에 players 배열 삽입 
        for(int i=0; i<players.length; i++) {
            playerMap.put(players[i], i); 
        }
        
        // callings의 원소와 같은 players 값 찾아 순서 바꾸기 
        for(String calling : callings) {
            int i = playerMap.get(calling); 
            swap(players, i); 
        }

        return players;
    }
    
    // 두 배열의 위치 바꾸기 
    public void swap(String[] players, int i) {
        String temp = players[i]; 
        players[i] = players[i-1]; 
        players[i-1] = temp; 
        
        // Map 업데이트 
        playerMap.put(players[i-1], i-1);
        playerMap.put(players[i], i);
    }
}