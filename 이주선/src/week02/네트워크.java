package week02;

class 네트워크 {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n];
        for(int i = 0; i < computers.length; i++) {
            if(!visited[i]) {
                dfs(visited, computers, i);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(boolean[] visited, int[][] computers, int num) {
        visited[num] = true;

        for(int i = 0; i < computers[num].length; i++) {
            if(computers[num][i] == 1 && !visited[i]) {
                dfs(visited, computers, i);
            }
        }
    }
}