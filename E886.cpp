#include <bits/stdc++.h>
using namespace std;
#define ll long long int
bool check(ll mid, ll arr[], ll n, ll c){
      ll ans = 0;
      for(int i =0;i<n;i++){
        ll temp=2*mid+arr[i];
        ans =ans+(temp*temp);
        if(ans>c){
          return false;
        }
      }
      return true;
}
int main(){
  ll t;
  cin >> t;
  while(t--){
    ll n, c;
    cin >>n>>c;
    ll arr[n];
    for(int i =0;i <n;i++){
      cin>>arr[i];
    }

    ll s=1;
    ll e=1e9;
    ll ans=-1;
    while(s<=e){
      ll mid =(s+e)/2;
      if(check(mid,arr,n,c)){
        ans=mid;
        s=mid+1;
      }else{
        e=mid-1;
      }
    }
    cout <<ans<<endl;
  }
  return 0;
}

