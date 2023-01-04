#include<bits/stdc++.h>

using namespace std;

int main(int argc, char const *argv[])
{
    int t;
    cin >> t;
    while(t-- != 0){
        int n;
        cin >> n;
        int freq[n];
        long long sum = 0;

        for (int i = 0; i < n; i++)
        {
            cin >> freq[i];
            sum += freq[i];
        }
        if(sum > n) {
            cout << "-1";
            continue;
        }

        int ans[n];
        map < int, pair < int, int > > freqMap; 
        int num = 1;

        for (int i = 0; i < n; i++)
        {
            if(freqMap.find(freq[i]) != freqMap.end()){
                ans[i] = freqMap[freq[i]].first;
                freqMap[freq[i]].second --;
                if(freqMap[freq[i]].second == 0){
                    freqMap.erase(freq[i]);
                }

            }
            else{
                if(freq[i] != 1) freqMap[freq[i]] = {num , freq[i] - 1};
                ans[i] = num;
                num++;
            }
        }

        for (auto it : ans)
        {
            cout << it << ' ';
        }
        cout << endl;
        

        
        
        
    }
    return 0;
}
