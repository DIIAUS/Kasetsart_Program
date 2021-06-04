#include <bits/stdc++.h>

using namespace std;

int main()
{
    int len,hlen;
    string word;
    getline(cin,word);
    len = word.length();
    hlen =(word.length())/2; 

    for(int i=0;i<len;i++){
        if(word[i]>=65 && word[i]<=92)
            word[i]=word[i]+32;
    }
    
    
    
    for(int i=0;i<=hlen;i++){
        if(word[i]!=word[--len])
          {  
            cout<<"NO";
            return 0;
          }
    }
    cout<<"YES";
    return 0;
    
    
    
    //cout<<word 
    //cout<<hlen;

}