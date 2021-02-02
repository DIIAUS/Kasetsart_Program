//Skill W1L2
#include<iostream>
#include<string.h>
using namespace std ; 


int main(){
   char t[100] ; 
   cin >> t ;
   long y = stol(t);
   //cout << y ;
   if (y >= 10 & y<=1000000) {
       cout << t[0] << t[strlen(t)-1] ;
   }
    
}
