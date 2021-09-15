#include <stdio.h>
#include <iostream>
#include <string>
using namespace std;

int main()
{
	int n;
	cin>>n;
	string ansbox[n];
	string u = "";
	string v = "";
	for(int i = 0; i < n; i++)
	{
		cin>>u;
		cin>>v;
		int count = 0;
		int move1 = 0;
		int start = 0;
		string combi = "";
		string precombi = "";
		if(u.length() < v.length())
		{
			while(count < u.length())
			{
				move1 = count;
				for(int j = 0; j < v.length(); j++)
				{
					if(u[move1] == v[j])
					{
						precombi += u[move1];
						move1++;
					} else {
						move1 = count;
						if(precombi.length() > combi.length())
						{
							combi = precombi;
							precombi = "";
						}
					}
				}
				count++;
			}
			cout<<combi;
		}
	}
	
}
