import sys

input = sys.stdin.readline

a, b = map(str, input().split())

a = a[::-1]
b = b[::-1]

answer = max(a, b)

print(answer)
