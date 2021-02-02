//Skill W1L3
#include<iostream>
#include<string.h>

using namespace std ; 
int main () 
{
  int x ;
  cin >> x ;
  int last = x%10;
  
  
     while (x>=10)
     {
       x=x/10;
       continue;
     }
    int first = x ;
    cout <<first<<last ; 
  }

  