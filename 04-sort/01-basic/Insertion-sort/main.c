//
//  main.c
//  Insertion-sort
//
//  Created by Yunhee on 3/28/13.
//  Copyright (c) 2013 Yunhee. All rights reserved.
//

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
    int newValue;
    
    printf("Enter number of elements\n");
    scanf("%d", &n);
    
    printf("Enter %d integers\n", n);
    
    for ( i = 0 ; i < n ; i++ )
        scanf("%d", &array[i]);
    
    
    for (i = 1; i < n; i++)
    {
        newValue = array[i];
        j = i;
        while (j > 0 && array[j - 1] > newValue) {
            array[j] = array[j - 1];
            j--;
        }
        array[j] = newValue;

        printf("Partial Result of list taken by selection sort :\n");
        for ( k = 0 ; k < n ; k++ )
            printf("%d ", array[k]);
        printf("\n");
        
    }
    printf("Selection Sort list in ascending order:\n");
    for ( i = 0 ; i < n ; i++ )
        printf("%d\n", array[i]);
    
    return 0;
}
