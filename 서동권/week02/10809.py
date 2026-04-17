import sys

input = sys.stdin.readline

s = input().strip()

result = [-1] * 26

for i in range(len(s)):
    index = ord(s[i]) - ord("a")

    if result[index] == -1:
        result[index] = i

print(*result)

# 아스키 코드를 사용해서 a 기준으로 지금 내가 찾는 알바벳이 몇번째 숫자인지 확인한다
# 배열 (알파벳 숫자 사이즈 선언) -1이면 초기값 이므로 선언한적이 없기 떄문에 조건문 기준을 만듬