//
//  Baekjoon_ 2739.cpp
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
    
    for(int i=1; i<=9; i++) {
        cout << n << " * " << i << " = " << n*i << '\n';
    }
    return 0;
}
