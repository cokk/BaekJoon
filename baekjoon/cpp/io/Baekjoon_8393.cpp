//
//  Baekjoon_8393.cpp
//  baekjoon
//
//  Created by KoDakyung on 11/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    int sum = 0;
    cin >> n;
    for(int i=1; i<=n; i++) {
        sum += i;
    }
    cout << sum << '\n';
    return 0;
}
