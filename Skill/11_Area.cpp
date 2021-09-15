#include <stdio.h>
#include <iostream>
using namespace std;

int main()
{
	int X1, Y1, W1, H1;
	int X2, Y2, W2, H2;
	cin>>X1>>Y1>>W1>>H1;
	cin>>X2>>Y2>>W2>>H2;
	int OverlapX = max(0,(min(X1+W1, X2+W2)-max(X1,X2)));
	int OverlapY = max(0,(min(Y1+H1, Y2+H2)-max(Y1,Y2)));
	if(OverlapX*OverlapY > 0)
	{
		cout<<(W1*H1)+(W2*H2)-(OverlapX*OverlapY);
	} else {
		cout<<(W1*H1)+(W2*H2);
	}
}
