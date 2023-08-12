//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution{
  public:
    string prefix(string a, string b){
        string str = "";
        int len = min(a.length(), b.length());
        for(int i = 0; i<len; i++){
            if(a[i] != b[i]){
                break;
            }else{
                str += a[i];
            }
        }
        if(str.length() == 0) return "-1";
        else
        return str;
    }
    string longestCommonPrefix (string arr[], int N)
    {
        // your code here
        if(N == 1) return arr[0];
        string ans = prefix(arr[0], arr[1]);
        for(int i = 2; i<N; i++){
            ans = prefix(ans, arr[i]);
        }
        return ans;
    }
};

//{ Driver Code Starts.
int main()
{
    int t; cin >> t;
    while (t--)
    {
        int n; cin >> n;
        string arr[n];
        for (int i = 0; i < n; ++i)
            cin >> arr[i];
        
        Solution ob;
        cout << ob.longestCommonPrefix (arr, n) << endl;
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends