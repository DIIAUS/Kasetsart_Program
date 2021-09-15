#include <stdio.h>
#include <iostream>
using namespace std;

int main()
{
	int count = 0;
	cin>>count;
	string ansbox[count];
	for(int i = 0; i < count; i++)
	{
		string ans = "";
		string preans = "";
		int time = 0;
		cin>>ans;
		cin>>time;
		for(int j = 0; j < time; j++)
		{
			int pos1 = 0;
			int pos2 = 0;
			cin>>pos1>>pos2;
			preans = ans;
			pos1-=1;
			pos2-=1;
			int w = pos2;
			for(int m = pos1; m <= pos2; m++)
			{
				ans[m] = preans[w];
				w--;
			}
			preans = ans;
		}
		ansbox[i] = ans;
	}
	for(int i = 0; i < count; i++)
	{
		cout<<ansbox[i]<<endl;
	}
}
