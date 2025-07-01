package week08;

class 타겟넘버 {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, 0, target);
        return answer;
    }

    public void dfs(int index, int[] numbers, int current, int target) {
        if(index == numbers.length) {
            if(current == target) {
                answer++;
            }
        } else {
            dfs(index + 1, numbers, current + numbers[index], target);
            dfs(index + 1, numbers, current - numbers[index], target);
        }
    }
}
