A = [89, 25, 12, 22, 11,88] 

# Traverse through all array elements 
for i in range(len(A)-1,1,-1):  
    max_idx = i 
    for j in range(0, i): 
        if A[max_idx] < A[j]: 
            max_idx = j   
    A[i], A[max_idx] = A[max_idx], A[i] 
  
print ("Sorted array") 
for i in range(len(A)): 
    print("%d" %A[i]),

