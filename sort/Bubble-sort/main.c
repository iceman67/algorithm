//
//  main.c
//  BubbleSort
//
//  Created by Yunhee on 3/27/13.
//  Copyright (c) 2013 Yunhee. All rights reserved.
//

#include <stdio.h>

//
//  main.c
//  sorting
//
//  Created by Yunhee on 3/27/13.
//  Copyright (c) 2013 Yunhee. All rights reserved.
//

#include <stdio.h>

void swap(int* i, int *j)
{
    int temp;
    temp = *i;
    *i = *j;
    *j = temp;
}
 
int main()
{
    int i, j,k;
    int swap_count = 0; 
    
    int arr[] = { 12, 11, 13, 5, 6, 7 };
     
    int arr_size = sizeof(arr) / sizeof(arr[0]);
     
    for (i = arr_size -1; i >= 1; i-- )
    {
        printf("Largest number bubbled %d \n", i + 1);
        for ( j = 1; j <= i ; j++ )
        {
            // poition having the  largest number
            if (arr[j-1] > arr[j] ) {
                swap(&arr[j-1], &arr[j]);
    		    swap_count++;
            }
        }
        printf("Partial Result of  Bubble Sorted list :\n");
        for ( k = 0 ; k < arr_size; k++ )
            printf("%d ", arr[k]);
        printf("\n");
        
    }
    printf("Bubble Sorted list in ascending order:\n");
    for ( i = 0 ; i < arr_size; i++ )
        printf("%d\n", arr[i]);
   
    printf("The number of swap count during bubble Sort:");
    printf("%d \n", swap_count);
    return 0;
}
