package week04;

import java.util.*;

class HIndex {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        int left = 0;
        int right = citations.length;

        while(left <= right) {
            int mid = (left + right) / 2;
            int count = 0;

            for(int c : citations) {
                if(c >= mid) {
                    count++;
                }
            }

            if(count >= mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}
