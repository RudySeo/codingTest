package week07;

class 가장큰정사각형 {
    public int solution(int [][]board)
    {
        int answer = 0;

        int n = board.length;
        int m = board[0].length;

        // dp[i][j] : i행 j열을 오른쪽 아래 꼭짓점으로 하는 정사각형 최대 변 길이
        // 그렇기 떄문에 첫 행과 첫 열은 초기값 직접 설정
        int dp[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            dp[i][0] = board[i][0];
        }

        for (int j = 0; j < m; j++) {
            dp[0][j] = board[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (board[i][j] == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer = Math.max(answer, dp[i][j]);
            }
        }
        return answer * answer;
    }
}