package week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {

    static int n;
    static int[] array;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        /**
         * 퀸은 같은 행, 열, 대각선을 공격할 수 있다.
         * 우선 퀸을 한 행에 두고 다음 행에 퀸이 가능한 위치들을 탐색
         * array[i] = j;  i행 j열에 퀸을 놓음
         */
        array = new int[n];
        solve(0);
        System.out.println(count);
    }

    public static void solve(int row) {
        if (row == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            array[row] = i;
            if (isValid(row)) {
                solve(row + 1);
            }
        }
    }

    public static boolean isValid(int row) {
        for (int i = 0; i < row; i++) {
            // 같은 열이나 대각선에 위치하는지 판단
            if (array[i] == array[row] || Math.abs(row - i) == Math.abs(array[row] - array[i])) {
                return false;
            }
        }
        return true;
    }
}
