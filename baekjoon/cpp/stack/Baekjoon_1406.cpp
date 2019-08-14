//
//  Baekjoon_1406.cpp
//  baekjoon
//
//  Created by KoDakyung on 12/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
#include <stack>
using namespace std;

int main(int argc, const char * argv[]) {
    stack<char> l;
    stack<char> r;
    
    string str;
    int n;
    cin >> str >> n;
    
    cin.ignore();
    
    for (int i = 0; i < str.size(); i++) {
        l.push(str[i]);
    }
    
    for (int i = 0; i < n; i++) {
        char c;
        cin >> c;
        
        if (c == 'L' && !l.empty()) {
            r.push(l.top());
            l.pop();
        } else if (c == 'D' && !r.empty()) {
            l.push(r.top());
            r.pop();
        } else if (c == 'B' && !l.empty()) {
            l.pop();
        } else if (c == 'P') {
            char v;
            cin >> v;
            l.push(v);
        }
    }
    
    while (l.size() != 0) {
        r.push(l.top());
        l.pop();
    }
    
    while (r.size() != 0) {
        cout << r.top();
        r.pop();
    }
    
    return 0;
}
