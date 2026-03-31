package week05;

import java.util.*;

class k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0] - 1;
            int end = command[1];
            int index = command[2] - 1;

            int[] copy = Arrays.copyOfRange(array, start, end);
            Arrays.sort(copy);
            answer[i] = copy[index];
        }
        return answer;
    }
}