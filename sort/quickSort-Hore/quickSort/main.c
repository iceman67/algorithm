//
//  main.c
//  quickSort
//
// http://login2win.blogspot.kr/2011/06/what-is-quick-sort-algorithm-how-to.html
//  Created by Yunhee on 4/6/13.
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

void print_array(int numbers[], char *msg, int p, q)
{
    int k;
    printf("%s", msg);
    for ( k = p; k <= q ; k++ )
        printf("%d ", numbers[k]);
    printf("\n");
}

int  partition_0(int numbers[], int left, int right)
{
    int pivot;
    int i,j;
    
    i = left;
    j = right;
    pivot = numbers[right];
    
    while (i < j)
    {
        while (numbers[i] < pivot)
            i++;

        while (numbers[j] > pivot)
            j--;
        
        if ( numbers[i] == numbers[j] )
            i++;
        else
        {
            swap(&numbers[i], &numbers[j]);
                        
        }
    }
   
    return j;
  }


int  partition_1(int numbers[], int left, int right)
{
    int pivot;
    int i,j;
    
    i = left;
    j = right;
    pivot = numbers[right];
    
    while (i < j)
    {
        while (numbers[i] <= pivot)
            i++;
        
        while (numbers[j] > pivot)
            j--;
        
        if ( i <= j )
        {
            swap(&numbers[i], &numbers[j]);
            
        }
    }
    printf("pivot = %d\n", j);
    return j;
}

int  partition(int numbers[], int left, int right)
{
    int pivot;
    int i,j;
    
    i = left-1;
    j = right;
    pivot = numbers[right];
    
    for (j= left; j <= right-1; j++)
        if ( numbers[j]  <= pivot )
            swap(&numbers[++i], &numbers[j]);
    swap(&numbers[i+1], &numbers[right]);
    return i+1;
}



void quickSort(int numbers[], int left, int right)
{
    
    if (left < right)
    {
       int pivot = partition(numbers, left, right);
    
       print_array(numbers, "left: ", left, pivot-1);
       printf("%d[%d]\n", pivot, numbers[pivot]);
       print_array(numbers, "right: ", pivot+1, right);
        
       quickSort(numbers, left, pivot-1);
       
       quickSort(numbers, pivot+1, right);
    }

}

int main()
{
    int array[10], n, i, k;
         
    printf("Enter number of elements\n");
    scanf("%d", &n);
    
    printf("Enter %d integers\n", n);
    
    for ( i = 0 ; i < n ; i++ )
        scanf("%d", &array[i]);
    
    
    quickSort(array, 0, n-1);
    
    printf("After sorting by quick sort \n");
    for ( k = 0 ; k < n ; k++ )
            printf("%d ", array[k]);
        printf("\n");
        
}