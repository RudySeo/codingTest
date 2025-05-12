package week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 공유기설치 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 집의 개수
        int c = Integer.parseInt(st.nextToken()); // 공유기의 개수

        int[] house = new int[n];
        for (int i = 0; i < n; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(house);

        // 공유기 사이의 거리를 최대로
        int left = 1;
        int right = house[n - 1] - house[0];

        int answer = 0;
        while (left <= right) {
            int mid = (left + right) / 2;

            int count = 1; // 설치 개수
            int lastInstalled = house[0]; // 가장 최근에 설치한 위치

            for (int i = 1; i < n; i++) {
                if(house[i] - lastInstalled >= mid) {
                    count++;
                    lastInstalled = house[i];
                }
            }

            if(count >= c) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
