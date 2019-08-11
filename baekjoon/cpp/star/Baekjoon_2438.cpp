//
//  Baekjoon_2438.cpp
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
    
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++) {
            cout << '*';
        }
        cout << '\n';
    }
    return 0;
}
