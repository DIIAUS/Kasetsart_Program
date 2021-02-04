#include <iostream>
#include <algorithm>
#include <iterator> 
#include <bits/stdc++.h>
#include <numeric>

using namespace std;


int main()
{
    int N,T;
    cin>>N>>T;

    int arr[N];
    int sum=0;
    if(N>1 and T<=100000)
    {
        for(int i = 0 ; i < N ; i++) cin >> arr[i];

        int len = *(&arr +1)-arr;
        
        sort(arr,arr+len);

        for(int y = (N-T) ; y < N;y++)
        {
            //cout << arr[y]<<" ";
            sum=sum+arr[y];
        }
        cout<< sum;
    }
}