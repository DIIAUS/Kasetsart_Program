//Skill W1L4
#include <iostream>
#include<cmath>
using namespace std;

int isPrimeNumber(int);
int prime(int);

int main()
{
    int inp ; 
    int hight = 0 ; 
    int low = 0;
    cout<<"Enter: ";
    cin>>inp;
    int loop = inp+50;
    bool isPrime;
   
    for(int n = 1; n <=loop; n++) {
     
      isPrime = isPrimeNumber(n);
    
        if(isPrime == false)
         {
             if (inp == n)
             {
                 inp-=1 ;
                 //cout << n ; 
                
                low+=1;
                continue;
             }
             
             
            
         }
        else if(isPrime == true)
        {
            if(inp == n)
            {
                cout <<n<<endl;
                break;
            }
        }
      
   }
   cout << low ;
}

// Function that checks whether n is prime or not
int isPrimeNumber(int n) 
{
   int isPrime = 1;
    if (n == 1)
    {
        isPrime = 0 ;
    }
    else 
    {
        for(int i = 2; i<= sqrt(n); i++) {
            if (n%i == 0)
             {
                isPrime = 0;
                break;
            }
        }
   }  
   return isPrime;
}

int prime(int x)
{
    bool isPrime;
   for(int n = 1; n <=100; n++) {
     
      isPrime = isPrimeNumber(n);
      if (isPrime == false)
      {
          //cout <<n<<" " ;
      }
      if(isPrime == true)
         cout<<n<<endl;
   }
   return 0;
}
