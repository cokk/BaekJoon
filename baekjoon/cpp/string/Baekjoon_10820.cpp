//
//  Baekjoon_10820.cpp
//  baekjoon
//
//  Created by KoDakyung on 29/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
#include <string>

using namespace std;

int main(int argc, const char * argv[]) {
    string s;
    while(getline(cin, s)) {
        unsigned long len = s.size();
        int r[4] = {0};
        for (int i=0; i<len; i++) {
            char c = s[i];
            if (c >= 'a' && c <= 'z') r[0]++;
            else if (c >= 'A' && c <= 'Z') r[1]++;
            else if (c >= '0' && c <= '9') r[2]++;
            else r[3]++;
        }
        for (int i=0; i<3; i++) {
            cout << r[i] << ' ';
        }
        cout << r[3] << '\n';
    }
    return 0;
}
