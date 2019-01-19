#include<bits/stdc++.h>
using namespace std;

int numberSwaps(int a[], int n){
  int numSwaps = 0;
  bool vis[n];
  for(int i = 0; i < n; i++){
    vis[i] = false;
  }
  
  for(int i = 0; i < n; i++){
    if(a[i] != i+1){
      int j = a[i] - 1;
      while(!vis[j]){
        vis[j] = true;
        numSwaps++;
        int temp = a[j];
        a[j] = j+1;
        j = temp - 1;
      }
      numSwaps -= 1;
    }
    else{
      vis[i] = true;
    }
  }
  
  return numSwaps;
}

void winningStgy(int a[], int n){
  for(int i = 0; i < n; i++){
    if(a[i] - i > 3){
      cout << "NO";
      return;
    }
  }
  cout << "YES" << endl;
  cout << numberSwaps(a, n) << endl;
}


int main() {
	// Write your code here
  int n;
  cin >> n;
  int a[n];
  for(int i = 0; i < n; i++){
    cin >> a[i];
  }
  
  winningStgy(a, n);
  return 0;
}