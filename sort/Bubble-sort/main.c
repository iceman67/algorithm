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
    int array[10], n, i, j,k;
    int swap_count = 0; 
    
    printf("Enter number of elements\n");
    scanf("%d", &n);
    
    printf("Enter %d integers\n", n);
    
    for ( i = 0 ; i < n ; i++ )
        scanf("%d", &array[i]);
    
    
    for (i = n-1; i >= 1; i-- )
    {
        printf("Largest number bubbled %d \n", i + 1);
        for ( j = 1; j <= i ; j++ )
        {
            // poition having the  largest number
            if ( array[j-1] > array[j] ) {
                swap(&array[j-1], &array[j]);
    		swap_count++;
            }
        }
        printf("Partial Result of  Bubble Sorted list :\n");
        for ( k = 0 ; k < n ; k++ )
            printf("%d ", array[k]);
        printf("\n");
        
    }
    printf("Bubble Sorted list in ascending order:\n");
    for ( i = 0 ; i < n ; i++ )
        printf("%d\n", array[i]);
   
    printf("The number of swap count during bubble Sort:");
    printf("%d \n", swap_count);
    return 0;
}
