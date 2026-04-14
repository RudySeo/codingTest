import sys

input = sys.stdin.readline

N = input()

for _ in range(int(N)):
    a, b = map(int, input().split())
    print(a + b)

