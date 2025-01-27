import java.util.HashMap;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 최소 입력 횟수를 저장할 HashMap
        HashMap<Character, Integer> minKeyPress = new HashMap<>();
        
        // keymap에서 각 문자의 최소 입력 횟수 계산
        for (String keys : keymap) {
            for (int i = 0; i < keys.length(); i++) {
                char c = keys.charAt(i);
                minKeyPress.put(c, Math.min(minKeyPress.getOrDefault(c, Integer.MAX_VALUE), i + 1));
            }
        }
        
        // 각 target 문자열에 대해 최소 입력 횟수 계산
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int totalPress = 0;
            for (char c : targets[i].toCharArray()) {
                if (minKeyPress.containsKey(c)) {
                    totalPress += minKeyPress.get(c);
                } else {
                    totalPress = -1;
                    break;
                }
            }
            answer[i] = totalPress;
        }
        
        return answer;
    }
}
