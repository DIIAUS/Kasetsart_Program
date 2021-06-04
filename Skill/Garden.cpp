#include <bits/stdc++.h>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    int max=0;
    

    int garden[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        {
            cin>>garden[i][j];
            if(garden[i][j]>max){
                max=garden[i][j];
            }
        }
    }

    for(int i=0;i<n;i++){
        cout<<endl;
        for(int y=0;y<m;y++)    
        {
            cout<<garden[i][y]<<" ";
        }
    }
    cout<<endl<<max;
}