import sys

input = sys.stdin.readline
a = int(input().strip())
b = input().strip()

print(a * int(b[2]))
print(a * int(b[1]))
print(a * int(b[0]))
print(a * int(b))

# 파이썬에서 숫자는 인덱스 사용 불가능하다 