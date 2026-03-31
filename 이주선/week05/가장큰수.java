package week05;

import java.util.*;

class 가장큰수 {
    public String solution(int[] numbers) {
        String[] s = new String[numbers.length];
        for(int i = 0; i < s.length; i++) {
            s[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(s, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 만약 정렬 시 원소가 0만 존재한다면(0 또는 양의 정수가 담긴 배열이므로)
        if(s[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length; i++) {
            sb.append(s[i]);
        }
        return sb.toString();
    }
}
