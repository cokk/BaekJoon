//
//  Baekjoon_10799.cpp
//  baekjoon
//
//  Created by KoDakyung on 12/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
#include <stack>
using namespace std;

int main(int argc, const char * argv[]) {
    string str;
    stack<int> s;
    int cnt = 0;
    cin >> str;
    
    unsigned long size = str.size();
    for (int i = 0; i < size; i++) {
        if (str[i] == '(') {
            s.push(i);
        } else if (str[i] == ')') {
            int before = s.top();
            s.pop();
            
            if (i - before == 1) { // if raser
                cnt += s.size();
            } else {
                cnt += 1;
            }
        }
    }
    cout << cnt << '\n';
    return 0;
}
