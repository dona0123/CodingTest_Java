import java.util.HashMap;
import java.util.Collections;
import java.util.Map; 

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        Map<String, Map<String, Integer>> giftRelate = new HashMap<>();
        Map<String, Integer> giftScore = new HashMap<>(); 
        Map<String, Integer> nextGift = new HashMap<>(); 
        
        // 각 해시맵에 이름 입력 
        for(String friend : friends) {
            giftRelate.put(friend, new HashMap<>()); 
            giftScore.put(friend, 0); 
            nextGift.put(friend, 0); 
        }
        
        // 두 사람 사이에서 주고받은 선물의 수 기록 + 선물 지수 계산 
        for(String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1]; 
            
            giftRelate.get(giver).put(receiver, giftRelate.get(giver).getOrDefault(receiver,0)+1); 
            giftScore.put(giver, giftScore.get(giver)+1);
            giftScore.put(receiver, giftScore.get(receiver)-1); 
            
        }
        
        // 다음달에 줄 선물 계산
        for(String giver : friends) {
            for(String receiver : friends) {
                if(!giver.equals(receiver)) {
                    int giverCount = giftRelate.get(giver).getOrDefault(receiver,0);
                    int receiverCount = giftRelate.get(receiver).getOrDefault(giver,0); 
                    
                    if (giverCount > receiverCount) {
                        nextGift.put(giver, nextGift.get(giver)+1);
                    } else if (giverCount == receiverCount && giftScore.get(giver) > giftScore.get(receiver)) {
                        nextGift.put(giver, nextGift.get(giver)+1);
                    }
                }
            }
        }
        
        // 선물을 가장 많이 받을 횟수 계산 
        answer = Collections.max(nextGift.values());
        
        return answer;
    }
}