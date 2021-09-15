#include <iostream>
#include <stdio.h>
#include <algorithm>
using namespace std;

int main()
{
	int n;
	cin>>n;
	int ans = 0;
	int hero[n];
	for(int i = 0; i < n; i++)
	{
		cin>>hero[i];
	}
	int villain;
	cin>>villain;
	sort(hero, hero+n);
	int pow = 0;
	int count = 0;
	for(int i = n-1; i >= 0; i--)
	{
		pow+=hero[i];
		count++;
		if(pow > villain)
		{
			ans+=count;
			break;
		}
	}
	if(ans > 0)
	{
		cout<<ans;
	} else {
		cout<<"YOU DIE";
	}
}
