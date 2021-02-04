//Skill W5
#include<iostream>

using namespace std;


int prime_number(int x)
{
    int i, n;
    bool isPrime = true;

    n=x;

    // 0 and 1 are not prime numbers
    if (n == 0 || n == 1) {
        isPrime = false;
    }
    else {
        for (i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    if (isPrime)
        return 1 ;
    else
        return 0;

} 

int main()
{
    int human = 0 ;
    int devil = 0;
    
    int all ;
    int kill;
    cin>>all>>kill;
    
    int WiWalk[all];
    
    
    
    // Input WiWalk size all
    for(int i=0;i<all;i++)
    {
        cin >> WiWalk[i];
    }

    for (int j=0 ; j<all ; j++)
    {
        if(prime_number(WiWalk[j])==1){
            human+=1;
        }

        else if (prime_number(WiWalk[j])==0){
            devil+=1;
        }
        //cout<<prime_number(WiWalk[j])<<endl;
        
    }

    // cout<< "human = "<< human+kill << " " << "Devil = "<< devil;
    if(human+kill>devil)
    {
        cout<<"YES";
    }
    else if (human+kill<=devil)
    {
        cout<<"NO";
    }

// WiWalk Display
    // for (int pos = 0 ; pos<all ; pos++)
    // {
    //     cout<< WiWalk[pos] << ' ';
    // }
    
}

