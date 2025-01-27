public class Solution {
    public int solution(String s) {
        int count = 0;   // 분리된 문자열의 개수를 셀 변수
        int xCount = 0;  // x의 개수
        int otherCount = 0; // x가 아닌 문자들의 개수
        
        char firstChar = s.charAt(0); // 첫 번째 문자를 x로 설정
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자와 첫 번째 문자가 같으면 x의 개수 증가
            if (s.charAt(i) == firstChar) {
                xCount++;
            } else {
                otherCount++;
            }
            
            // x의 개수와 다른 문자의 개수가 같으면 분리
            if (xCount == otherCount) {
                count++;   // 하나의 문자열이 분리됨
                xCount = 0;  // x의 개수 초기화
                otherCount = 0;  // 다른 문자의 개수 초기화
                if (i + 1 < s.length()) {
                    firstChar = s.charAt(i + 1);  // 새로운 x 설정
                }
            }
        }
        
        // 남은 부분이 있으면 한 번 더 분리
        if (xCount != 0 || otherCount != 0) {
            count++;
        }
        
        return count;
    }
}
