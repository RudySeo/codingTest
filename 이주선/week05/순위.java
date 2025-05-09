package week05;

class 순위 {
    public int solution(int n, int[][] results) {
        int[][] array = new int[n + 1][n + 1];
        for(int[] result : results) {
            int win = result[0];
            int lose = result[1];

            array[win][lose] = 1; // 이기면 1
            array[lose][win] = -1; // 지면 -1
        }

        // i에서 j까지 k를 경유하여 갈 수 있는지 판단
        for(int k = 1; k <= n; k++) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    // i가 k를 이기고 k가 j를 이기면 i는 j를 이김
                    if(array[i][k] == 1 && array[k][j] == 1) {
                        array[i][j] = 1;
                        array[j][i] = -1;
                    }

                    if(array[i][k] == -1 && array[k][j] == -1) {
                        array[i][j] = -1;
                        array[j][i] = 1;
                    }
                }
            }
        }

        int answer = 0;
        for(int i = 1; i <= n; i++) {
            int know = 0;
            for(int j = 1; j <= n; j++) {
                if(i == j) continue;
                // 승패 결과를 확실히 알 수 있을 경우
                if(array[i][j] != 0) know++;
            }

            if(know == n -1) answer++;
        }
        return answer;
    }
}
