//
//  Baekjoon_10845.cpp
//  baekjoon
//
//  Created by KoDakyung on 29/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int arr[10000] = {0,};
    int n;
    
    cin >> n;
    int b=0;
    int e=0;
    for (int i=0; i<n; i++) {
        string s;
        cin >> s;
        if (s == "push") {
            int v;
            cin >> v;
            arr[e++]=v;
        } else if (s == "pop") {
            if (b == e) cout << "-1\n";
            else {
                cout << arr[b] << '\n';
                arr[b++] = 0;
            }
        } else if (s == "size") {
            cout << e - b << '\n';
        } else if (s == "empty") {
            if (e - b == 0)
                cout << 1 << '\n';
            else
                cout << 0 << '\n';
        } else if (s == "front") {
            if (e - b == 0)
                cout << -1 << '\n';
            else
                cout << arr[b] << '\n';
        } else if (s == "back") {
            if (e - b == 0)
                cout << -1 << '\n';
            else
                cout << arr[e-1] << '\n';
        }
    }
    
    return 0;
}
