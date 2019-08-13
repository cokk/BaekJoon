//
//  Baekjoon_2445.cpp
//  baekjoon
//
//  Created by KoDakyung on 12/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    cin >> n;
    
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            cout << '*';
        }
        for(int j = i+1; j <= 2*n-i; j++) {
            cout << ' ';
        }
        for(int j = 2*n-i; j < 2*n; j++) {
            cout << '*';
        }
        cout << '\n';
    }
    
    for(int i = n-1; i >= 1; i--) {
        for(int j = 1; j <= i; j++) {
            cout << '*';
        }
        for(int j = i+1; j <= 2*n-i; j++) {
            cout << ' ';
        }
        for(int j = 2*n-i; j < 2*n; j++) {
            cout << '*';
        }
        cout << '\n';
    }
    return 0;
}
