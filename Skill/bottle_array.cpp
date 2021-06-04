#include <iostream>

using namespace std;


int main()
{
    int row; cin>>row;
    int column; cin>>column;
    int arr[column][row]; 
    
    for (int i=0 ; i<row ;i++)
    {
        cin>>arr[0][i];
    }

    int h ;
    for (int i=1 ; i<=column ;i++)
    {
        cin>>h;
        for(int j=0 ;j<row ;j++)
        {
            arr[i][j]=h;
        }
        
    }
    for(int i=1;i<=row;i++)
    {
        for(int j=0;j<row;j++)
        {
            if(arr[i][j]<arr[0][j])  //bottle more than barack ;
            {
                if(arr[0][0])
                {
                    if(arr[0][1]==0)
                    {
                        arr[0][0]=0;
                    }
                    else if (arr[0][1]!=0)
                    {
                        arr[0][0]=0;
                        arr[0][1]=0;
                    }
                }
                if(arr[0][row-1])
                {
                    if(arr[0][row-2]==0)
                    {
                        arr[0][row-1]=0;
                    }
                    else if(arr[0][row-2]!=0)
                    {
                        arr[0][row-1]=0;
                        arr[0][row-2]=0;
                    }
                }
            }
        }
    }
    

    for (int i=0 ; i<row ;i++)
    {
        cout<<arr[0][i];
        
    }

}