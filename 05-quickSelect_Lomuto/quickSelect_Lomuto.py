def partition(a, pivot, high):
    i = pivot + 1
    j = high
    while True:
        while i < high and a[i] < a[pivot]:
            i += 1
        while j > pivot and a[j] > a[pivot]:
            j -= 1
        if j <= i:
            break
        a[i], a[j] = a[j], a[i]
        i += 1
        j -= 1
    a[pivot], a[j] = a[j], a[pivot]
    return j


def selection(a, low, high, k):
    pivot = partition(a, low, high)
    if k < pivot:
        return selection(a, low, pivot-1, k)
    elif k == pivot:
        return a[k]
    else:
        return selection(a, pivot+1, high, k)


input_list = [40, 20, 50, 70, 65, 90, 35, 10, 15, 60, 55, 80, 25, 75]
K = input('(k-1) 값을 입력하라(0부터 ' + str((len(input_list)-1)) + '): ')
kth_smallest = selection(input_list, 0, len(input_list)-1, int(K))
print('{:2}번째 작은 수는 {:2}이다.'.format(int(K)+1, kth_smallest))
