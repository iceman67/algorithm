// SequencialSearch.cpp: 콘솔 응용 프로그램의 진입점을 정의합니다.
//

#include "stdafx.h"


#include <stdio.h>
#include <time.h>
#include <stdlib.h>

# define MAX 50
typedef int keytype;
int data[MAX];

int make_dataset() {
	int i = 0;
	time_t t;

	/* Intializes random number generator */
	srand((unsigned)time(&t));

	/* Print 5 random numbers from 0 to 65534*/
	while (i++ < MAX) {
		int r = (rand() % 65535);
		data[i] = r;
	}
	return 0;
}

void seqsearch(int n,			 
	keytype S[],	 
	keytype x,		 
	int *  location)	 
{
	int loc =  1;
	while (loc <= n && S[loc] != x)
		loc++;
	if (loc > n)
		*location = -1;
	else
		*location = loc;
}


int main() {

	int index;
	int key;

	make_dataset();
	int i = 0;


	while(i++ < MAX)
     	printf(" %4d [%d]", data[i], i);
	printf("\n");
 
	printf("input a key : ");
	scanf_s("%d", &key);

	//key = data[1];
	seqsearch(MAX, data, key, &index);

	if (index < 0)
		printf("자료를 찾지 못함 \n");
	else
	    printf("key = %d  data[%d] = %d \n", key, index, data[index]);

	getchar();
	getchar();

}