#include <stdio.h>
#include <iostream>
#include <cmath>
using namespace std; 

int main()
{
	int x1, y1, z1, w1, l1, h1;
	cin>>x1>>y1>>z1>>w1>>l1>>h1;
	int x2, y2, z2, w2, l2, h2;
	cin>>x2>>y2>>z2>>w2>>l2>>h2;
	int a1 = abs(x1-x2);
	int a2 = abs(y1-y2);
	int a3 = abs(z1-z2);
	if(a1 == a2 == a3)
	{
		cout<<a1*a2*a3;
	} else {
		cout<<0;
	}
}
