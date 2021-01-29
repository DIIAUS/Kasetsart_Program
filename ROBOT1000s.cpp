#include <iostream>
#include <cstdio>
#include <cstring>
#include <cstdlib>

using namespace std;

int main(void)
{
    char c[200];
    int k;
    scanf("%s", c);
    scanf("%d", &k);

    int l = strlen(c);

    int n = 0;
    int e = 0;
    int s = 0;
    int w = 0;

    for(int i = 0; i < l; i++)
    {
        if(c[i] == 'N')
        {
            n++;
        }
        else if(c[i] == 'E')
        {
            e++;
        }
        else if(c[i] == 'S')
        {
            s++;
        }
        else
        {
            w++;
        }
    }

    if(n <= s && n > 0)
    {
        while(n <= s && n > 0 && k > 0)
        {
            n--;
            k--;
        }
    }
    else if(s < n && s > 0)
    {
        while(s < n && s > 0 && k > 0)
        {
            s--;
            k--;
        }
    }

    if(e <= w && e > 0)
    {
        while(e <= w && e > 0 && k > 0)
        {
            e--;
            k--;
        }
    }
    else if(w < e && w > 0)
    {
        while(w < e && w > 0 && k > 0)
        {
            w--;
            k--;
        }
    }

    while(k > 0)
    {
        if(n > 0)
        {
            n--;
        }
        else if(s > 0)
        {
            s--;
        }
        else if(e > 0)
        {
            e--;
        }
        else
        {
            w--;
        }
        k--;
    }

    int sumv = abs(n - s);
    int sumh = abs(e - w);

    printf("%d\n", 2 * (sumv + sumh));

    return 0;
}