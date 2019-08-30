//
//  Baekjoon_11655.cpp
//  baekjoon
//
//  Created by KoDakyung on 30/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>

using namespace std;

int main(int argc, const char * argv[]) {
    string s;
    getline(cin, s);
    
    int i=0;
    while(s[i]) {
        char c = s[i];
        if (c >= 'A' && c <= 'Z') {
            if (c + 13 > 'Z') s[i] = c + 13 - 'Z' + 'A' - 1;
            else s[i] = c + 13;
        } else if (c >= 'a' && c <= 'z') {
            if (c + 13 > 'z') s[i] = c + 13 - 'z' + 'a' - 1;
            else s[i] = c + 13;
        }
        i++;
    }
    cout << s;
    return 0;
}
