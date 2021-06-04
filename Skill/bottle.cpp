#include <iostream>
#include<string>
#include<stdio.h>

// import libary  to programe  ; 

using namespace std ; 

void botle()
{
  int x,y;
  cin >> x >> y ;
  int arr[x];
 
  for (int i=0 ; i<x ; i++)
  {
    cin>>arr[i];
  }
  
  int p = 0 ;
  int xxx;
  const int mnArry = arr[0];
  const int mxArry = arr[x-1];
  int sm[y];
  int a = 0;

  while (p<y)
  {
    cin>>xxx;
    for(int c = 0 ; c<x ;c++)
    {

      if(xxx<arr[c]) 
      {
        if(arr[c]==mnArry && c==0) 
        { 
          if(arr[c+1]==0)
          {
            arr[c]=0;
            a+=1;
          }
          else
          {
            arr[c]=0;
            arr[c+1]=0;
            a+=2;
          }
        }
        else if(arr[c]==mxArry && c==(x-1)) 
        { 
          if(arr[c-1]==0)
          {
            arr[c]=0;
            a+=1;
          }
          else
          {
            arr[c]=0;
            arr[c-1]=0;
            a+=2;
          }
        }
        else
        {
          if(arr[c]==0)
          {
            continue;
          }
          else if(arr[c-1]==0)
          {
            if(arr[c+1]>=arr[c])
            {
              arr[c]=0;
              a+=1;
            }
            
            else
            {
              if(arr[c+1]==0 && arr[c-1]==0)
              {
                arr[c]=0;
                a+=1;
              }
              else
              {
                arr[c]=0;
                arr[c+1]=0;
                a+=2;
              }
              
              
            }
          }

          else if(arr[c+1]==0)
          {
            if(arr[c+1]==0 && arr[c-1]==0)
            {
              arr[c]=0;
              a+=1;
            }
            else
            {
              arr[c]=0;
              arr[c-1]=0;
              a+=2;
            }
            
            
          }
          else if (arr[c-1]!=0 && arr[c+1]!=0)
          {
            if(arr[c+1]>=arr[c])
            {
              arr[c]=0;
              arr[c-1]=0;
              a+=2;
            }
            else
            {
              arr[c]=0;
              arr[c-1]=0;
              arr[c+1]=0;
              a+=3;
            }
            
          }
          
        }
        
      }
    }
    sm[p]=a;
    a=0;
    p++;   
  }
  
  for(int out=0 ; out<x ; out++)
  {
    cout<<arr[out]<<" ";
  }

  cout<<endl;


  for(int ot = 0 ;  ot<y ; ot++)
  {
    cout<<sm[ot]<<endl;
  }
}




int main()
{
  botle();
  
}