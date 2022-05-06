#include <stdio.h>

void swap( int* A, int* B )
{
    int Temp = *A;
    *A = *B;
    *B = Temp;
}


void printArray(int A[], int size, int q)
{
	int i;
	for (i = 0; i < size; i++)
		if (i != q)
		     printf("%d ", A[i]);
		else 
			printf("%d *", A[i]);
	printf("\n");
}

int  Partition(int A[], int p, int r)
{
	int x;
	int i, j;

	i = p - 1; // i는  p보다 1적은 값을 가짐 
	x = A[r];

	for (j = p; j <= r - 1; j++)
		if (A[j] <= x) // 피봇과 j값 비교, 작거나 같으면 
			swap(&A[++i], &A[j]); // i값 증가와 교환 
	swap(&A[i + 1], &A[r]); // 피봇을 i_1의 값과 교환 
	return i + 1; // 중간값 반환 
}
int len = 0;

void QuickSort(int A[], int p, int r)
{

    int i;

    if ( p < r )
    {
        int q = Partition(A, p, r);
        
        printArray(A, len, q);

        QuickSort( A, p, q - 1 );
        QuickSort( A, q + 1, r );
    }
}

int main( void )
{
    //int A[] = {6, 4, 2, 3, 1, 9};
    int A[] = {1,5,3,2,9,7, 6, 4};
    int size = sizeof A / sizeof A[0];    
    int i = 0;
    len = size;

    printf("Input list : ");
    
    for ( i=0; i<size; i++ )
    {
        printf("%d ", A[i]);
    }
    printf("\n");

    QuickSort( A, 0, size-1 );
    printf("Sorted list in ascending order : ");
    
    for ( i=0; i<size; i++ )
    {
        printf("%d ", A[i]);
    }

    printf("\n");
    return 0;

}