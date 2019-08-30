//
//  Baekjoon_11656.cpp
//  baekjoon
//
//  Created by KoDakyung on 30/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(int argc, const char * argv[]) {
    string s;
    cin >> s;
    
    unsigned long len = s.size();
    string arr[len];
    
    for(int i=0; i<len; i++) {
        arr[i] = s.substr(i, len-i);
    }
    
    sort(arr, arr+len);
    for(int i=0; i<len; i++) {
        cout << arr[i] << '\n';
    }
    
    return 0;
}
