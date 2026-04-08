import sys

input = sys.stdin.readline

a, b, c = map(int, input().split())
if a == b == c:
    result = 10000 + a * 1000

elif a == b:
    result = 1000 + a * 100

elif b == c:
    result = 1000 + b * 100

elif a == c:
    result = 1000 + a * 100

else:
    num = max(a, b, c)
    result = num * 100

print(result)

# 둘중하나 코드를 생각해보자
