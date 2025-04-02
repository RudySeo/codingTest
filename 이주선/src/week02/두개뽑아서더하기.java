package week02;

import java.util.*;

class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int n = numbers[i] + numbers[j];
                set.add(n);
            }
        }

        int[] answer = new int[set.size()];
        int index = 0;
        for(int s : set) {
            answer[index++] = s;
        }

        Arrays.sort(answer);
        return answer;
    }
}
