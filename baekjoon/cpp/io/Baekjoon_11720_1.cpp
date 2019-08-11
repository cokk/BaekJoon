//
//  Baekjoon_11720_1.cpp
//  baekjoon
//
//  Created by KoDakyung on 11/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n, sum = 0;
    char c;
    
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> c;
        sum += c - '0';
    }
    
    cout << sum << endl;
    return 0;
}
