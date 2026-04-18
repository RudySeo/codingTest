import sys

input = sys.stdin.readline

n = int(input().strip())

for _ in range(n):
    r, s = input().split()
    r = int(r)

    result = ""

    for ch in s:
        result += ch * r

    print(result)
