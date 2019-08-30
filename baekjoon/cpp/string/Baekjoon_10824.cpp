//
//  Baekjoon_10824.cpp
//  baekjoon
//
//  Created by KoDakyung on 30/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
#include <string>

using namespace std;

int main(int argc, const char * argv[]) {
    string a, b, c, d;
    cin >> a >> b >> c >> d;
    
    long long v1 = stoll(a + b);
    long long v2 = stoll(c + d);
    
    cout << v1 + v2;
    
    return 0;
}
