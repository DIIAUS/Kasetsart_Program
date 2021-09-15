#include <stdio.h>
#include <iostream>
#include <algorithm> 
using namespace std;

int main()
{
	int i = 0, j = 0, count = 0;
	int n;
	cin>>n;
	int A[n]; 
	int B[n];
	for(int t = 0; t < n; t++)
	{
		cin>>A[t];
	}
	for(int t = 0; t < n; t++)
	{
		cin>>B[t];
	}
	sort(A, A+n);
	sort(B, B+n);
	while(i < n && j < n)
	{
		if(A[i] == B[j])
		{
			i++;
			j++;
			count++;
		} else {
			if(A[i] < B[j])
			{
				i++;
			} else {
				j++;
			}
		}
	}
	cout<<count;
}
