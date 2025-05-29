package week06;

import java.util.*;

class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // 도난당한 학생들을 저장
        for(int l : lost) {
            lostSet.add(l);
        }

        // 여벌이 있는데 도난을 당하지 않았으면 -> 빌려줄 수 있음
        // 여벌이 있는데 도난을 당했으면 -> 빌려줄 수 없음
        for(int r : reserve) {
            if(lostSet.contains(r)) {
                lostSet.remove(r);
            } else {
                reserveSet.add(r);
            }
        }

        for(int r : reserveSet) {
            if(lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if(lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }

        return n - lostSet.size();
    }
}
