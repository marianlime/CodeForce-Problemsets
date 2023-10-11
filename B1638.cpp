#include<bits/stdc++.h>
using namespace std;

int T, n;
int main(){
  for(scanf("%d", &T); T --;){
    scanf("%d", &n);
    int c0 = 0, c1 = 0;
    for(int i = 1, x; i <= n; ++ i){
      scanf("%d", &x);
      if(x & 1){
        if(c1 == -1 || x < c1)
        c1 = -1;
        else
        c1 = x;   
      }
      else{
        if(c0 == -1 || x < c0)
        c0 = -1;
        else
        c0 = x;
      }
    }
    puts(c1 != -1 && c0 != -1 ? "Yes" : "No");
  }
}