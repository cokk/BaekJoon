//
//  Baekjoon_11720_2.cpp
//  baekjoon
//
//  Created by KoDakyung on 11/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n, sum = 0;
    
    cin >> n;
    for (int i = 0; i < n; i++) {
        int in;
        scanf("%1d", &in);
        sum += in;
    }
    
    cout << sum << endl;
    return 0;
}
