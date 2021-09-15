#include <stdio.h>
#include <iostream>
#include <cmath>
using namespace std; 

int main()
{
	int x, y, x1, y1, x2, y2;
	cin>>x>>y>>x1>>y1>>x2>>y2;
	int ans1 = abs(x-x2)*abs(y-y1);
	int ans2 = abs(x-x1)*abs(y-y2);
	if(ans1 > ans2)
	{
		cout<<ans1;
	} 
	else {
		cout<<ans2;
	}
}
