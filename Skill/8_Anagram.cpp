#include <stdio.h>
#include <iostream>
using namespace std;

int main()
{
	string ans = "";
	string text1 = "";
	string text2 = "";
	string box1[1000];
	string box2[1000];
	bool swap = false;
	int move1 = 0;
	int move2 = 0;
	int count;
	int skip = 0;
	cin>>count;
	for(int i = 0; i < count*2; i++)
	{
		string x;
		cin>>x;
		if(swap == false)
		{
			box1[move1] = x;
			swap = true;
			move1++;
		}
		else if(swap == true)
		{
			box2[move2] = x;
			swap = false;
			move2++;
		}
	}
	move1 = 0;
	move2 = 0;
	for(int i = 0; i < count; i++)
	{
		int canskip = 0;
		string letter1;
		string letter2;
		letter1 = box1[i];
		letter2 = box2[i];
		int size1 = letter1.length();
		int size2 = letter2.length();
		if(size1 != size2)
		{
			cout<<"NOT ANAGRAM"<<endl;
		} else {
			for(int j = 0; j < size1; j++)
			{
				for(int k = 0; k < j; k++)
				{
					if(letter1[j] == letter1[k])
					{
						canskip = 1;
						break;
					}
				}
				if(canskip == 1)
				{
					canskip = 0;
				}
				else if(canskip == 0)
				{
					int total = 0;
					int same = 0;
					for(int k = 0; k < size1; k++)
					{
						if(letter1[j] == letter1[k])
						{
							total += 1;
						}
					}
					for(int l = 0; l < size1; l++)
					{
						if(letter1[j] == letter2[l])
						{
							same += 1;
						}
					}
					if(total != same)
					{
						skip = 1;
						cout<<"NOT ANAGRAM"<<endl;
						break;
					} else {
						ans = "ANAGRAM";
					}
				}
			}
			if(skip == 0)
			{
				cout<<ans<<endl;
			}
			skip = 0;
		}
	}
}
