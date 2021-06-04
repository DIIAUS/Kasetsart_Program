#include<bits/stdc++.h>
using namespace std ; 

int main()
{
    int numX = 0, numY=0 ,count=0 , N ;
    cin >> N ; 
    int arr[N][3];

    for(int i=0 ; i<N;i++)
        {
            cin>>arr[i][0]>>arr[i][1]>>arr[i][2];
            if(arr[i][0]>numX)
                numX=arr[i][0];
            if(arr[i][1]>numY)
                numY=arr[i][1]; 
        }
    for(int i=0 ; i<N ;i++)
    {
        if(arr[i][0]==0 || arr[i][0]==numX || arr[i][1]==numY || arr[i][1]==0)
        {
            if (arr[i][2]==0)
            {
                count++;
            }
        }
    }
    cout<< count;  
}