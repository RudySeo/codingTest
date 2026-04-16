import sys

input = sys.stdin.readline

n = input().strip()

for _ in range(int(n)):
    words = input().strip()
    print(words[0] + words[-1])
