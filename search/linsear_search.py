def linearSearch(arr, key):
   n = len(arr)
   for i in range(0, n):
      if arr[i] == key:
         return i
   return -1

list = [1,2,3,4,5]
key = 2
pos = linearSearch(list, key)
print ("position = ", pos )
if pos == -1: 
  print("not found" )
else:
  print (" ",  list[pos])

key = -1
pos = linearSearch(list, key)
print ("position = ", pos )
if pos == -1: 
  print(" not found" )
else:
  print ( list[pos])


if __name__ == '__main__':
    import timeit
    import random
    t1 = timeit.Timer("list=range(100000); k = random.randint(1,100000); key=k; linearSearch(list,key)", "from __main__ import linearSearch, random")
    print("linear search ran:", t1.timeit(number=100), "milliseconds")

    t1 = timeit.Timer("list=range(1000000); k = random.randint(1,1000000); key=k; linearSearch(list,key)", "from __main__ import linearSearch, random")
    print("linear search ran:", t1.timeit(number=100), "milliseconds")

