//
//  Baekjoon_10953.cpp
//  baekjoon
//
//  Created by KoDakyung on 10/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int t;
    string a, b;
    
    cin >> t;
    while(t-- > 0) {
        getline(cin, a, ',');
        getline(cin, b);
        cout << stoi(a) + stoi(b) << endl;
    }
    return 0;
}
