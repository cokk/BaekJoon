//
//  Baekjoon_10818.cpp
//  baekjoon
//
//  Created by KoDakyung on 11/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n, in;
    int min = 1000000;
    int max = -1000000;
    
    cin >> n;
    while(n-- > 0) {
        cin >> in;
        if (in < min) min = in;
        if (in > max) max = in;
    }
    
    cout << min << ' ' << max;
    return 0;
}
