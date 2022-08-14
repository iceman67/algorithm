def binarySearch(arr, item):
    if len(arr) == 0:
        return False
    else:
        midpoint = len(arr)//2
        if arr[midpoint]==item:
          return True
        else:
          if item<arr[midpoint]:  # midpoint 보다 작은곳에서 찾음
            return binarySearch(arr[:midpoint],item)
          else:
            return binarySearch(arr[midpoint+1:],item)

testlist = [0, 1, 2, 8, 13, 17, 19, 32, 42,]
print(binarySearch(testlist, 3))
print(binarySearch(testlist, 13))