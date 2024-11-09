class Solution {
    public int solution(String ineq, String eq, int n, int m) { 
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(ineq);
        sb.append(eq);
        switch(sb.toString()) {
            case ">=":
                if(n>=m) {
                    answer=1;
                }
                break;
            case "<=": 
                if(n<=m) {
                    answer=1;
                }
                break;
            case ">!":
                if(n>m) {
                    answer=1;
                }
                break;
            case "<!":
                if(n<m) {
                    answer=1;
                }
                break;
            default: 
                break;
        }
        return answer;
    }
}