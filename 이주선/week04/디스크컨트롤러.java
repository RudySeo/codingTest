package week04;

import java.util.*;

class 디스크컨트롤러 {
    public int solution(int[][] jobs) {
        int answer = 0; // 총 반환시간

        // 시작시간이 빠른 순으로
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        // 시작시간이 같다면 작업 소요시간이 짧은 것
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        int completedJobs = 0; // 완료된 작업의 수
        int time = 0; // 현재 시간
        int index = 0;

        while(completedJobs < jobs.length) {
            // 현재시간에서 실행가능한 작업을 모두 큐에 넣는다.
            while (index < jobs.length && jobs[index][0] <= time) {
                queue.add(jobs[index]);
                index++;
            }

            if(queue.isEmpty()) {
                time = jobs[index][0];
            } else {
                int[] current = queue.poll();
                time += current[1];
                answer += time - current[0];
                completedJobs++;
            }
        }
        return answer / jobs.length;
    }
}