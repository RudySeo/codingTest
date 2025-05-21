package week06;

import java.util.*;

class 가장큰수 {
    public String solution(int[] numbers) {
        String[] s = new String[numbers.length];
        for(int i = 0; i < s.length; i++) {
            s[i] = String.valueOf(numbers[i]);
        }

        // 내림차순 정렬 수행
        // "6" + "10" = "610" vs "10" + "6" = "106", "610"이 더 크므로 "6"이 앞에 옴
        Arrays.sort(s, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(s[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(String str : s) {
            sb.append(str);
        }

        return sb.toString();
    }
}
