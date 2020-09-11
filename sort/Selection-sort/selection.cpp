// Selection_Sort.cpp: 콘솔 응용 프로그램의 진입점을 정의합니다.
//
//#include "stdafx.h"
#include<stdlib.h>
#include<stdio.h>


/* UTILITY FUNCTIONS */
/* Function to print an array */
void printArray(int A[], int size)
{
	int i;
	for (i = 0; i < size; i++)
		printf("%d ", A[i]);
	printf("\n");
}

int theLargest(int A[], int size) {

	int largest = 0;
	for (int i = 1; i <= size; i++)
		if (A[i] > A[largest]) largest = i;
	return largest;
}

void SelectionSort(int A[], int size)
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
	}
}



int main()
{
	int arr[] = { 12, 11, 13, 5, 6, 7 };

	//int arr[] = { 5, 4, 3, 2, 1 };

	int arr_size = sizeof(arr) / sizeof(arr[0]);

	printf("Given array is \n");
	printArray(arr, arr_size);

	SelectionSort(arr, arr_size);

	printf("\nSorted array is \n");
	printArray(arr, arr_size);

	getchar();
	getchar();
	return 0;
}
