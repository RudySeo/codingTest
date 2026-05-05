def solution(array):
    num = 0
    data = 0
    for i in set(array):
        if array.count(i) > num:
            num = array.count(i)
            data = i
        elif array.count(i) == num:
            data = -1
    return data
