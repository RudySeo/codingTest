package week03;

import java.util.*;

class 프로세스 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }

        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            boolean flag = false;

            for(int[] q : queue) {
                if(q[0] > temp[0]) {
                    flag = true;
                    break;
                }
            }

            if(flag) {
                queue.add(temp);
            } else {
                answer++;
                if(temp[1] == location) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
