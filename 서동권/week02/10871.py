import sys

input = sys.stdin.readline
a, b = map(int, input().split())
arr = list(map(int, input().split()))
answer = []
for i in arr:
    if i < b:
        answer.append(i)

for i in answer:
    print(i, end=" ")
