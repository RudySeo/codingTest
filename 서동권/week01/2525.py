import sys

input = sys.stdin.readline

h, m = map(int, input().split())
a = int(input().strip())

h += a // 60
m += a % 60

if m >= 60:
    h += 1
    m -= 60

# 입력 3 번
if h >= 24:
    h -= 24

print(h, m)

# 시,분을  나머지 숫자를 기준으로 추가해주고 분이나 시 60,24 기준점을 넘으면 추가해준다