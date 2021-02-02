//Skill W2L1
#include <iostream>
#include<cmath>
#include<cstring>


using namespace std ;

int main()
{

    int x=0;
    int y=0; 
    char name[100] ; 
    cin >> name ;

    for (int i=0 ; i<=strlen(name)-1;i++)
    {
        if (name[i]=='N')
        {
            y+=1;
            continue;
        }
        if (name[i]=='S')
        {
            y-=1;
            continue;
        }
        if (name[i]=='W')
        {
            x-=1;
            continue;
        }
        if (name[i]=='E')
        {
            x+=1;
            continue;
        }
        if (name[i]=='Z')
        {
            y=0;
            x=0;
            continue;
        }
    }
    cout << x<<' '<<y;

}