//Skill W4
#include <iostream>
using namespace std;
int main()
{
    int sam;
    int n;
    cin>>n;
    int arr[n];

    for(int i=0 ; i<n;i++)
    {
        int c;
        cin>>c;
        arr[i]=c;

    }
    int x;
    cin>>x;

    for(int y=0 ; y<=n-3;y++)
    {
        for(int t=y+1 ; t<=n-2;t++)
        {
            for(int l=t+1 ; l<=n-1;l++)
            {
                for(int w=l+1 ; w<=n;w++)
                    {
                        sam=arr[y]+arr[t]+arr[l]+arr[w];
                        if (sam==x)
                        {
                             cout<<"YES";
                             return 0;
                            
                        }
                    }
            }
        }
    }
    cout<<"NO";
    return 0;
}


