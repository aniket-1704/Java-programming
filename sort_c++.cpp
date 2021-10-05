#include <iostream>
#include <bits/stdc++.h>
using namespace std;
bool compare(int a,int b)
{
    return a>=b;
}
int main()
{
    int n=8;
    int a[]={3,5,2,6,7,2,4,9};
    sort(a,a+n,compare);
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }

return 0;
}




