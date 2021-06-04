#include <iostream>

using namespace std;

int main()
{

    int w, h;
    cin >> w >> h;
    int arr[w][h];
    int count = 0;
    for (int i=0;i<h;i++)
    {
        for (int j=0;j<w;j++)
        {
            cin>>arr[i][j];
        }
    }

    for (int i=0;i<h;i++)
    {
        for (int j=0;j<w;j++)
        {
            if (arr[i][j]==1)
            {
                
                for (int m=i-1;m<i+2;m++)
                {
                    for (int n=j-1; n<j+2;j++)
                    {
                        if (arr[m][n]==1)
                            ++count;
                    }
                }
                if (count<3)
                {
                    cout<<"NO";
                    return 0 ;
                }
            }
        }
    }
    cout<<"YES";
    return 0;
}