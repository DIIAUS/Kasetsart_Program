#include <stdio.h>
#include <iostream>
using namespace std; 

int main()
{
	int ans = 0;
	int n, d, r;
	int k = 0;
	int ansbox[k];
	while(true)
	{
		cin>>n>>d>>r;
		if(n == 0 && d == 0 && r == 0)
		{
			break;
		} else {
			int use = 10000;
			int lineup[n];
			int linedown[n];
			for(int i = 0; i < n; i++)
			{
				cin>>lineup[i];
			}
			for(int i = 0; i < n; i++)
			{
				cin>>linedown[i];
			}
			for(int i = 0; i < n; i++)
			{
				if(lineup[i]+linedown[i] > d && lineup[i]+linedown[i] < use)
				{
					use = lineup[i]+linedown[i];
					ans = (use-d)*r;
				}
			}
		}
		ansbox[k] = ans;
		ans = 0;
		k++;
	}
	for(int i = 0; i < k; i++)
	{
		cout<<ansbox[i]<<endl;
	}
}
