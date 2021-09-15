#include <stdio.h>
#include <iostream>
#include <sstream>
using namespace std;

bool isNondecreasing(long long unsigned num)
{
	int total = 10;
	while(num > 0)
	{
		if(num%10 <= total)
		{
			total = num%10;
			num/=10;
		} else {
			return false;
		}
	}
	return true;
}

unsigned long long last(long long unsigned num)
{
	long long unsigned p = (num%10)+1;
	num-=p;
	while(!isNondecreasing(num))
	{
		if(num%(p*10) == (p*10)-1)
		{
			p*=10;
		}
		num-=p;
	}
	return num;
}

int main()
{
	int T;
	cin>>T;
	string ansbox[T];
	long long unsigned n;
	for(int i = 0; i < T; i++)
	{
		cin>>n;
		string preans = "";
		if(isNondecreasing(n))
		{
			int a = i+1;
			stringstream ss;
			ss<<a;
			string s = ss.str();
			preans += "Case #";
			preans += s;
			preans += ": ";
			stringstream kk;
			kk<<n;
			string nn = kk.str();
			preans += nn;
			ansbox[i] = preans;
			preans = "";
		} else {
			int a = i+1;
			stringstream ss;
			ss<<a;
			string s = ss.str();
			preans += "Case #";
			preans += s;
			preans += ": ";
			stringstream kk;
			kk<<last(n);
			string nn = kk.str();
			preans += nn;
			ansbox[i] = preans;
			preans = "";
		}
	}
	for(int i = 0; i < T; i++)
	{
		cout<<ansbox[i]<<endl;
	}
}
