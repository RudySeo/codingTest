import sys

input = sys.stdin.readline

arr = set()

for _ in range(10):
    num = int(input())
    answer = num % 42
    arr.add(answer)
print(len(arr))
