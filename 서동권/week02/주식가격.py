def solution(prices):
    answer = [0] * len(prices)
    stack = []

    for i, price in enumerate(prices):
        # 가격이 떨어지는 순간까지 비교
        while stack and prices[stack[-1]] > price:
            j = stack.pop()
            answer[j] = i - j  # 가격이 떨어질 때까지 걸린 시간
        stack.append(i)

    # 끝까지 가격이 떨어지지 않은 경우 처리
    for i in stack:
        answer[i] = len(prices) - 1 - i
    return answer


if __name__ == "__main__":
    # 테스트 케이스
    prices = [1, 2, 3, 2, 3]
    result = solution(prices)
    print(f"주식가격 유지 시간: {result}")