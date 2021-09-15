#include <stdio.h>
#include <iostream>
using namespace std;

string read;
void onetonine(int number)
{
	switch(number)
	{
		case 1:
			read += "one";
			break;
		case 2:
			read += "two";
			break;
		case 3:
			read += "three";
			break;
		case 4:
			read += "four";
			break;
		case 5:
			read += "five";
			break;
		case 6:
			read += "six";
			break;
		case 7:
			read += "seven";
			break;
		case 8:
			read += "eight";
			break;
		case 9:
			read += "nine";
			break;
	}
}

void ten(int number)
{
	switch(number)
	{
		case 0:
			read += "ten";
			break;
		case 1:
			read += "eleven";
			break;
		case 2:
			read += "twelve";
			break;
		case 3:
			read += "thirteen";
			break;
		case 4:
			read += "fourteen";
			break;
		case 5:
			read += "fifteen";
			break;
		case 6:
			read += "sixteen";
			break;
		case 7:
			read += "seventeen";
			break;
		case 8:
			read += "eighteen";
			break;
		case 9:
			read += "nineteen";
			break;
	}
}

void tenzero(int number)
{
	switch(number)
	{
		case 2:
			read += "twenty";
			break;
		case 3:
			read += "thirty";
			break;
		case 4:
			read += "forty";
			break;
		case 5:
			read += "fifty";
			break;
		case 6:
			read += "sixty";
			break;
		case 7:
			read += "seventy";
			break;
		case 8:
			read += "eighty";
			break;
		case 9:
			read += "ninety";
			break;
	}
}

int main()
{
	int number = 0;
	int count = 0;
	int countn = 0;
	cin>>count;
	for(int i = 0; i < count; i++)
	{
		cin>>number;
		read = "";
		if(number == 10000)
		{
			cout<<"ten thousand";
		}
		if(number == 0)
		{
			cout<<"zero";
		}
		else {
			countn = (number/1000)%10;
			if(countn >= 1)
			{
				onetonine(countn);
				read += " thousand ";
				number = number-countn*1000;
			}
			countn = (number/100)%10;
			if(countn >= 1)
			{
				onetonine(countn);
				read += " hundred ";
				number = number-countn*100;
			}
			countn = (number/10)%10;
			if(countn >= 1)
			{
				number -= countn*10;
				if(countn == 1)
				{
					countn = number%10;
					ten(countn);
				} else {
					tenzero(countn);
					countn = number%10;
					if(countn > 0)
					{
						read += "-";
						onetonine(countn);
					}
				}
				number -= countn;
			}
			countn = number%10;
			if(countn >= 1)
			{
				onetonine(countn);
				number -= countn;
			}
		}
		cout<<read<<endl;
	}
}
