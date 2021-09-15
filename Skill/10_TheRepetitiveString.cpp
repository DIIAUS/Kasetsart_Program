#include <stdio.h>
#include <iostream>
using namespace std;

int main()
{
	string word;
	cin>>word;
	string letterbox[word.length()] = {};
	int p1 = 0;
	int p2 = 0;
	for(int i = 0; i < word.length(); i++)
	{
		letterbox[i] = word[i];
	}
	for(int i = 0; i < word.length(); i++)
	{
		for(int j = i+2; j < word.length(); j++)
		{
			if(letterbox[i] == letterbox[j])
			{
				if(letterbox[i] != letterbox[j-1])
				{
					p1 = 1;
					break;
				}
			}
		}
	}
	if(p1 == 0)
	{
		cout<<"NO";
	} else {
		cout<<"YES";
	}
}
