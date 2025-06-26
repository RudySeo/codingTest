package week07;

class 등굣길 {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;

        int[][] dp = new int[n + 1][m + 1]; // n : 세로, m : 가로
        boolean[][] isPuddle = new boolean[n + 1][m + 1];

        for(int[] puddle : puddles) {
            int x = puddle[0];
            int y = puddle[1];
            isPuddle[y][x] = true;
        }

        dp[1][1] = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(isPuddle[i][j]) {
                    dp[i][j] = 0;
                    continue;
                }
                if(i > 1) dp[i][j] = (dp[i - 1][j] + dp[i][j]) % 1000000007; // 위
                if(j > 1) dp[i][j] = (dp[i][j - 1] + dp[i][j]) % 1000000007; //왼쪽
            }

        }

        return dp[n][m];
    }
}