//
//  Baekjoon_3986.cpp
//  baekjoon
//
//  Created by KoDakyung on 14/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
#include <stack>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    cin >> n;
    int cnt = 0;
    
    while (n-- > 0){
        string str;
        cin >> str;
        stack<char> s;
        
        for (int i = 0; i < str.size(); i++) {
            if (s.empty() || s.top() != str[i]) {
                s.push(str[i]);
            } else if(s.top() == str[i]) {
                s.pop();
            }
        }
        
        if (s.empty()) cnt++;
    }
    
    cout << cnt;
    return 0;
}
