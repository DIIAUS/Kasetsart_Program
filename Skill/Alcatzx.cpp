//Skill W5
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int X,Y,N;
    cin >> X >>Y >>N;

    bool cx =true;
    int H=0;
    int arr[N]; //[0,1,2,3,4,5,6,7]
    int sum=0;
    if(Y>X) return 0;
    if (Y<=100&&N>=1 )
    {
        for (int iarr=0 ; iarr<N ;iarr++) 
        {
            cin>>arr[iarr];
            if (arr[iarr]>1000)
            {
                return 0 ;
            }
        }





        for (int i=0;i<N;i++)
        {
            cx=true;
            H=arr[i];
            
            if (X!=Y)
            {
                while(cx)
                {
                    if(H!=X)
                    {
                        H=H-(X-Y);
                        sum=sum+1;
                        if (H<=0)
                        {
                            H=0;
                            cx=false;
                        }
                    }
                    else if (H==X)
                    {
                        H=H-H;
                        sum=sum+1;
                        if(H<=0)
                        {
                            H=0;
                            cx=false;
                        }
                    }
                    
                }
                
            }
            else if(X==Y)
            {
                if(H<=X)
                {
                    sum=sum+1;
                }
                
                else if(H>X)
                {
                    sum=0;
                    break;
                }
                
            }
            
            
        }
    }
    cout << sum;
}