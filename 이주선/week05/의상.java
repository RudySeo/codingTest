package week05;

import java.util.*;

class 의상 {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            String[] s = clothes[i];
            String kind = s[1];

            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }

        for(String s : map.keySet()) {
            answer *= (map.get(s) + 1);
        }

        return answer - 1;
    }
}
