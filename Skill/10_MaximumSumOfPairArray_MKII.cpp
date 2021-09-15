#include <stdio.h>
#include <iostream>
using namespace std;

int main()
{
	int n;
	int ans = 0;
	int minus = 0;
	int plus = 0;
	int cminus = 0;
	int cplus = 0;
	cin>>n;
	int array[n];
	for(int i = 0; i < n; i++)
	{
		cin>>array[i];
	}
	for(int i = 0; i < n; i++)
	{
		if(array[i] <= 0)
		{
			minus++;
		}
	}
	for(int i = 0; i < n; i++)
	{
		if(array[i] > 0)
		{
			plus++;
		}
	}
	for(int y = 0; y < minus; y+=2)
	{
		int first = 0;
		int second = 0;
		if(cminus == minus-1)
		{
			for(int f = 0; f < n-cminus; f++)
			{
				if(array[f] <= 0)
				{
					ans += array[f];
					break;	
				}
			}
		}
		else
		{
			if(array[0] < array[1])
			{
				first = array[0];
			    second = array[1];
			} else {
				first = array[1];
			    second = array[0];
			}
			for(int i = 2; i < n-cminus; i++)
			{
			    if(array[i] < first)
			    {
			        second = first;
			        first = array[i];
			    }
			    else if(array[i] < second)
			    {
			    	second = array[i];
				}
			}
			ans += first*second;
		}
		for(int r = 0; r < n-cminus; r++)
		{
			if(array[r] == first)
			{
				for(int s = r; s < n-cminus-1; s++)
				{
					array[s] = array[s+1];
				}
				break;
			}
		}
		for(int r = 0; r < n-cminus; r++)
		{
			if(array[r] == second)
			{
				for(int s = r; s < n-cminus-1; s++)
				{
					array[s] = array[s+1];
				}
				break;
			}
		}
		cminus += 2;
	}
	for(int y = 0; y < plus; y+=2)
	{
		int first = 0;
		int second = 0;
		if(cplus == plus-1)
		{
			for(int f = 0; f < n-cplus-minus; f++)
			{
				if(array[f] > 0)
				{
					ans += array[f];
					break;	
				}
			}
		}
		else
		{
			if(array[0] > array[1])
			{
				first = array[0];
			    second = array[1];
			} else {
				first = array[1];
			    second = array[0];
			}
			for(int i = 2; i < n-cplus-minus; i++)
			{
			    if(array[i] > first)
			    {
			        second = first;
			        first = array[i];
			    }
			    else if(array[i] > second)
			    {
			    	second = array[i];
				}
			}
			ans += first*second;
		}
		for(int r = 0; r < n-cplus-minus; r++)
		{
			if(array[r] == first)
			{
				for(int s = r; s < n-cplus-1-minus; s++)
				{
					array[s] = array[s+1];
				}
				break;
			}
		}
		for(int r = 0; r < n-cplus-minus; r++)
		{
			if(array[r] == second)
			{
				for(int s = r; s < n-cplus-1-minus; s++)
				{
					array[s] = array[s+1];
				}
				break;
			}
		}
		cplus += 2;
	}
	cout<<ans;
}
