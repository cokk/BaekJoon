//
//  Baekjoon_1158.cpp
//  baekjoon
//
//  Created by KoDakyung on 29/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
#include <queue>

using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    int k;
    cin >> n >> k;
    
    queue<int> q;
    for (int i=1; i<=n; i++) {
        q.push(i);
    }
    
    cout << "<";
    for (int i=1; i<=n-1; i++) {
        for (int j=1; j<=k; j++) {
            int v = q.front();
            q.pop();
            if (j == k) cout << v << ", ";
            else q.push(v);
        }
    }
    cout << q.front() << ">";
    
    return 0;
}
