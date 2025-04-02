class 피보나치수 {
    public int solution(int n) {
        int[] dp = new int[100001];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        int answer = dp[n];
        return answer;
    }
}
