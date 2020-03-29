
max = 0
def linearSearch(arr, key):
   n = len(arr)
   for i in range(0, n):
      if arr[i] == key:
         return i
   return -1

def binarySearch(arr, item):
    first = 0
    last = len(arr)-1
    found = False
    count = 0
    global max
    while first<=last and not found:
        midpoint = (first + last)//2
        count = count + 1
        if arr[midpoint] == item:
            found = True
            if max <count:
               max = count
            #print ("found  " , item, "comp  = ", count, " max = ", max)
            count = 0
        else:
            if item < arr[midpoint]:
                last = midpoint-1
            else:
                first = midpoint+1

    return found

arr = list(range(0,1001))

for i in range(0,1000):
    binarySearch(arr, i)

list = [1,2,3,4,5]
key = 2

pos = binarySearch(list, key)
print ("position = ", pos )
if pos == -1:
  print("not found" )
else:
  print (" ",  list[pos])

key = -1
pos = binarySearch(list, key)
print ("position = ", pos )
if pos == -1:
  print(" not found" )
else:
  print ( list[pos])


if __name__ == '__main__':
    import timeit
    import random
    t1 = timeit.Timer("list=range(100000); k = random.randint(1,100000); key=k; linearSearch(list,key)", "from __main__ import linearSearch, random")
    print("linearSearch search :", t1.timeit(number=100), "milliseconds")

    t1 = timeit.Timer("list=range(1000000); k = random.randint(1,1000000); key=k; binarySearch(list,key)", "from __main__ import binarySearch, random")
    print("binary search :", t1.timeit(number=100), "milliseconds")