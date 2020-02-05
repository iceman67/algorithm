//
//  swap_sort.c
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
    int array[10], n, i, j, max;
    int k;
    int swap_count = 0;
    
    printf("Enter number of elements\n");
    scanf("%d", &n);
    
    printf("Enter %d integers\n", n);
    
    for ( i = 0 ; i < n ; i++ )
        scanf("%d", &array[i]);
    
    
    for (i =  n-1; i >= 1; i-- )
    {
        max = i;
        for ( j = 0 ; j <= i ; j++ )
        {
            // poition having the  largest number
            if ( array[max] < array[j] )
                max = j;
            if ( max != i )
            {
                swap(&array[i], &array[max]);
		swap_count++;
                /*
                 temp = array[i];
                 array[i] = array[max];
                 array[max] = temp;
                 */
                
            }
        }// for i
        printf("Partial Result of  Selection Sort :\n");
        for ( k = 0 ; k < n ; k++ )
            printf("%d ", array[k]);
        printf("\n");

    } // for j
    printf("Sorted list in ascending order:\n");
    for ( i = 0 ; i < n ; i++ )
        printf("%d\n", array[i]);

    printf("The number of swap count during selection Sort:");
    printf("%d \n", swap_count);    
    return 0;
}
