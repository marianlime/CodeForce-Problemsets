#include <bits/stdc++.h>

using namespace std;

mt19937_64 RNG(chrono::steady_clock::now().time_since_epoch().count());


void Solve(){
  int n; cin>>n;
  vector <int> a(n+2, 0);
  for(int i =0;i <n;i++)
  cin>>a[i+1];

  int ans= 0;

  for(int i = 1;i<=n;i++){
    int ok = max(a[i-1], a[i+1]);
    ok = min(ok, a[i]);
    ans += a[i] - ok + abs(ok - a[i-1]);
    a[i] = ok;
  }
  ans += a[n];

  cout<<ans<<"\n";
}
int32_t main(){
  auto begin = std::chrono::high_resolution_clock::now();
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  int t = 1;
  cin >> t;
  for(int i = 1;i <= t; i++){

    //cout << "Case # " << i << ": "
    Solve();
  }
  auto end = std::chrono::high_resolution_clock::now();
  auto elapsed = std::chrono::duration_cast<std::chrono::nanoseconds>(end-begin);
  cerr<<"Time measured: " << elapsed.count() * 1e-9 << " seconds.\n";
  return 0;

}