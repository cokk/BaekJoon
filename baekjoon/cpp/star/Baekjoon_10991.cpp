//
//  Baekjoon_10991.cpp
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
    
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            cout << ' ';
        }
        for (int j = 1; j <= 2*i - 1; j++) {
            if (j % 2 != 0) cout << '*';
            else cout << ' ';
        }
        cout << '\n';
    }
    return 0;
}
