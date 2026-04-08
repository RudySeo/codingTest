import sys

input = sys.stdin.readline
h, m = map(int, input().split())

if m >= 45:
    m = m - 45
else:
    h = h - 1
    m = m + 60 - 45

    if h < 0:
        h = 23

print(h, m)

# 조건문을 잘 사용하자 45분 기준으로 부족하면 시간에서 빼서 사용해야 한다