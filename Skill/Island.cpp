#include <iostream>

using namespace std;

int main()
{
    int N;
    cin>>N;
    char arr[N][N];

    for(int i=0 ; i<N ; i++)
    {
        for(int j=0 ; j<N ; j++)
        {
            cin>>arr[i][j];
        }
    }
    // cout<<endl;
    // for(int x=0 ; x<N ; x++)
    // {
    //     for(int y=0 ; y<N ; y++)
    //     {
    //         cout<<arr[x][y];
    //     }
    //     cout<<endl;
    // }

    int max=0,row=0,column=0 ;
    for(int i=0 ; i<N ;i++)
    {
        for(int j=0 ;j<=N ;j++)
        {
            if(arr[i][j]!='0')
            {
                int count=0;
                bool check = true;
                while (check)
                {
                    count++;
                    if(i+count>=N)
                    {
                        check=false;
                    }
                    if(j+count>=N)
                    {
                        check==false;
                    }
                    if(check)
                    {
                        for(int x=0;x<=count;x++)
                        {
                            if(arr[i+x][j+count]=='0')
                            {
                                check=false;
                            }
                            if(arr[i+count][j+x]=='0')
                            {
                                check=false;
                            }
                        }
                    }
                }
                if(count>max)
                {
                    max=count;
                    row=i;
                    column=j;
                }
                
            }
        }
    }
    cout<<row+1<<" "<<column+1<<endl;
    cout<< max*max;
    
}