#include <bits/stdc++.h>

using namespace std;

long long inversion_cnt(string s){
  long long res = 0;
  long long cnt = 0;
  for(int i=s.length()-1; i>=0;i--){
    if(s[i] == '0'){
      cnt++;
    }else{
      res += cnt;
    }
  }
  return res;
}

int main(){
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  int tc;
  cin >> tc;
  while(tc--){
    int n;
    cin >> n;
    string s, s2, s3;
    bool f2=1, f3=1;
    for(int i =0;i<n;i++){
      char c;
      cin >> c;
      s += c;
      if(f2 && c == '0'){
        s2 += '1';
        f2 = 0;
      } else{
        s2 += c;
      }
      s3 += c;
    }
    for(int i =n-1; i >= 0;i--){
        if(s3[i] == '1'){
          s3[i] = '0';
          break;
        }
    }
    cout << max(max(inversion_cnt(s), inversion_cnt(s2)), inversion_cnt(s3)) << "\n";
  }
}