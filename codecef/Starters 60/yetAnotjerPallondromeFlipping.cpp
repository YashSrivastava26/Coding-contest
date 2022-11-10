#include <bits/stdc++.h> 
using namespace std; 
int main() { 
    int tes; 
    cin >> tes; 
    while (tes--) { 
        int size; 
        cin >> size; 
        int arr[size]; 
        vector<int> vtr; 
        for (int i = 0; i < size; i++) { 
            cin >> arr[i]; 
        } 
        int i = 0, j = size - 1; 
        while (i < size / 2 || j >= size / 2) { 
            vtr.push_back(arr[j] - arr[i]); 
            i++; 
            j--; 
        } 
        int k = vtr[0]; 
        for (int i = 0; i < vtr.size() - 1; i++) { 
            if (vtr[i] < 0) { 
                k = -1; 
                break; 
            } 
            if (vtr[i] < vtr[i + 1]) { 
                k = -1; 
                break; 
            } 
        } 
        if (vtr[vtr.size() - 1] < 0) { 
            cout << -1 << endl; 
        } 
        else { 
            cout << k << endl; 
        } 
    } 
    return 0; 
}