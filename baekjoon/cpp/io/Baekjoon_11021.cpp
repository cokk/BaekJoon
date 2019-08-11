//
//  Baekjoon_11021.cpp
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
    for (int i = 1; i <= t; i++) {
        getline(cin, a, ' ');
        getline(cin, b);
        cout << "Case #" << i << ": " << stoi(a) + stoi(b) << endl;
    }
    return 0;
}
