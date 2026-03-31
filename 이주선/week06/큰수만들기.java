package week06;

import java.util.*;

class 큰수만들기 {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>(); // 9 4
        for(char c : number.toCharArray()) {
            while(!stack.isEmpty() && stack.peek() < c && k > 0) {
                stack.pop();
                k--;
            }

            stack.push(c);
        }

        while(k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        // for-each로 순회하면 FIFO
        for(char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}