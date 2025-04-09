import math

def solution(progresses, speeds):
    answer = []
    
    # 각 작업마다 개발 완료까지 걸리는 일수 계산
    days = [math.ceil((100 - p) / s) for p, s in zip(progresses, speeds)]
    
    count = 1 
    prev_day = days[0]  # 첫 번째 작업 완료일 기준 설정
    
    for day in days[1:]:
        if day <= prev_day:
            # 이전 배포일에 함께 배포 가능
            count += 1
        else:
            # 새로운 배포 시작
            answer.append(count)
            count = 1
            prev_day = day
    
    # 마지막 배포 처리
    answer.append(count)
    
    return answer
