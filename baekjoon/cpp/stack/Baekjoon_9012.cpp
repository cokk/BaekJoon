//
//  Baekjoon_9012.cpp
//  baekjoon
//
//  Created by KoDakyung on 12/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    cin >> n;
    
    for (int i = 0; i < n; i++) {
        int cnt = 0;
        string in;
        cin >> in;
        
        unsigned long inSize = in.size();
        for (int j = 0; j < inSize; j++) {
            if (cnt >= 0) {
                if (in[j] == '(') cnt++;
                else if (in[j] == ')') cnt--;
            } else if (cnt < 0) break;
        }
        
        if (cnt == 0) cout << "YES" << '\n';
        else cout << "NO" << '\n';
    }
    
    return 0;
}
