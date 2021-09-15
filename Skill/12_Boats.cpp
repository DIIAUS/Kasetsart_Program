#include <iostream>
#include <stdio.h>
#include <algorithm>
using namespace std;

int main()
{
	int ans = 0;
	int n1, n2;
	cin>>n1>>n2;
	int boat1[n1];
	int boat2[n2];
	for(int i = 0; i < n1; i++)
	{
		cin>>boat1[i];
	}
	for(int i = 0; i < n2; i++)
	{
		cin>>boat2[i];
	}
	sort(boat1, boat1+n1);
	sort(boat2, boat2+n2);
	int c1 = n1-1;
	int c2 = n2-1;
	for(int i = c1; i >= 0; i--)
	{
		for(int j = c2; j >= 0; j--)
		{
			if(boat1[i] >= boat2[j] && boat2[j] != 0)
			{
				boat2[j] = 0;
				c1--;
				ans+=1;
				break;
			}
		}
	}
	cout<<ans;
}
