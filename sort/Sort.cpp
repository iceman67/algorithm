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

void printArray(int A[], int size)
{
	int i;
	for (i = 0; i < size; i++)
		printf("%d ", A[i]);
	printf("\n");
}

int theLargest(int A[], int size) {

	int largest = 0; //가장 큰값을 갖는 위치
	for (int i = 1; i <= size; i++)
		if (A[i] > A[largest]) largest = i;
	return largest;
}

void selection_sort(int A[], int size)
{

	int last = size - 1;
	int temp;
	for (; last >= 1; last--)
	{
		int k;
		k = theLargest(A, last);
		//printf("largerst =%d \n", A[k]);
		temp = A[last];
		A[last] = A[k];
		A[k] = temp;
		printArray(A, size);
	}
}
void insertion_sort(int A[], int size)
{
	int i, j, k;
	int newValue;
	for (i = 1; i < size; i++)
	{
		newValue = A[i];
		j = i;
		while (j > 0 && A[j - 1] > newValue) {
			A[j] = A[j - 1];
			j--;
		}
		A[j] = newValue;

		printf("Partial Result of list taken by insertion sort :\n");
		for (k = 0; k < size; k++)
			printf("%d ", A[k]);
		printf("\n");

	}
}
void bubble_sort(int A[], int size)
{
	int n, i, j, k;

	for (i = size - 1; i >= 1; i--)
	{
		printf("data size of sorting %d \n", i + 1);
		for (j = 0; j < i; j++)
		{
			// poition having the  largest number
			if (A[j] > A[j+1]) {
				swap(&A[j], &A[j+1]);
			}
		}
		printf("Partial Result of  Bubble Sorted list :\n");
		for (k = 0; k < size; k++)
			printf("%d ", A[k]);
		printf("\n");

	}
}
int main()
{
	int i=10, j=20;
	int arr[] = { 5, 4, 3, 2, 1 };
	int arr_size = sizeof(arr) / sizeof(arr[0]);


	printf("i = %d  j = %d \n", i, j);
	swap(&i, &j);
	printf("i = %d  j = %d \n", i, j);
	getchar();

	printf("Given array is \n");
	printArray(arr, arr_size);
	getchar();
	

	printf("arr size = %d \n", arr_size);
	bubble_sort(arr, arr_size);

	printf("\nSorted array is \n");
	printArray(arr, arr_size);
	getchar();

	int arr1[] = { 5, 4, 3, 2, 1 };
	int arr_size1 = sizeof(arr1) / sizeof(arr1[0]);
	printf("\Selection sort \n");

	printf("Given array is \n");
	printArray(arr1, arr_size1);
	getchar();

	selection_sort(arr1, arr_size1);
	printf("\nSorted array is \n");
	printArray(arr1, arr_size1);
	getchar();

	int arr2[] = { 5, 4, 3, 2, 1 };
	int arr_size2 = sizeof(arr2) / sizeof(arr2[0]);
	printArray(arr2, arr_size2);
	getchar();
	insertion_sort(arr2, arr_size2);
	printf("\nSorted array is \n");
	printArray(arr2, arr_size2);
	getchar();
	
}



