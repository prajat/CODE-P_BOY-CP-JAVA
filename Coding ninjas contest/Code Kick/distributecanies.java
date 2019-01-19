#include<bits/stdc++.h>
using namespace std;
long long arr[500010];
bool check(long long value,long long x,long long l)
{
    if(x==1)return true;
    long long sum=0;
    for(long long i=l-1;i>=0;i--)
    {
        sum+=((arr[i])/value);
    }
    if(sum>=x)return true;
    else return false;
}
void bs(long long l,long long key)
{
    long long low=1;
    long long high=arr[l-1]+1;
    long long mid=0;
    while(low<high)
    {
        mid=(low+high)/2;
        if(check(mid,key,l))low=mid+1;
        else high=mid-1;
    }
    cout<<low-1<<endl;
}
int main()
{
    long long t;
    cin>>t;
    while(t--)
    {
        long long n,k;
        cin>>n>>k;
        for(long long i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        sort(arr,arr+n);
        bs(n,k);
    }
    return 0;
}