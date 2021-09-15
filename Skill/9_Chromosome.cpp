#include <stdio.h>
#include <iostream>
#include <string>
using namespace std;

int main()
{
	int i = 0;
	string s;
	cin>>s;
	if(s[i] == 'A' || s[i] == 'B' || s[i] == 'C' || s[i] == 'D' || s[i] == 'E' || s[i] == 'F')
	{
		if(s[i] != 'A')
		{
			i++;
		}
		if(s[i] == 'A')
		{
			while(s[i] == 'A')
			{
				i++;
			}
			if(s[i] == 'F')
			{
				while(s[i] == 'F')
				{
					i++;
				}
				if(s[i] == 'C')
				{
					while(s[i] == 'C')
					{
						i++;
					}
					if(i == s.length())
					{
						cout<<"Infected!";
						return 0;
					}
					if(s[i] == 'A' || s[i] == 'B' || s[i] == 'C' || s[i] == 'D' || s[i] == 'E' || s[i] == 'F')
					{
						if(i+1 == s.length())
						{
							cout<<"Infected!";
							return 0;
						}
					}
				}
			}
		}
	}
	cout<<"Good";
}
