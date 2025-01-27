public class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();
        boolean[] skipLetters = new boolean[26]; // 알파벳 건너뛸 문자 표시
        
        // skip에 포함된 문자를 skipLetters 배열에 기록
        for (char c : skip.toCharArray()) {
            skipLetters[c - 'a'] = true;
        }
        
        // 문자열 s를 순회하며 변환
        for (char c : s.toCharArray()) {
            if (c == ' ') { // 공백은 그대로
                result.append(' ');
                continue;
            }
            
            char current = c;
            int count = index; // 이동 횟수
            
            while (count > 0) {
                current++; // 다음 문자로 이동
                if (current > 'z') { // z 다음은 a로 순환
                    current = 'a';
                }
                if (!skipLetters[current - 'a']) { // 건너뛰는 문자에 포함되지 않은 경우
                    count--;
                }
            }
            result.append(current); // 변환된 문자 추가
        }
        
        return result.toString();
    }
}
