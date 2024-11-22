class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n - 1 의 값 sub 구하기 
        int sub = n - 1; 
        
        // sub의 가장 작은 약수 구하기 (1 제외)
        for (int i=2; i<=Math.sqrt(sub); i++) {
            if(sub%i==0) {
                answer = i; 
                break;
            }
            // 약수를 찾지 못할 경우 (sub가 소수일 경우)
            answer = sub; 
        }
        
        return answer;
    }
}