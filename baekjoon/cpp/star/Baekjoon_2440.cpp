//
//  Baekjoon_2440.cpp
//  baekjoon
//
//  Created by KoDakyung on 11/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    cin >> n;
    
    while(n > 0) {
        for(int i = 1; i <= n; i++) {
            cout << '*';
        }
        cout << '\n';
        n--;
    }
    return 0;
}
