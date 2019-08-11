//
//  Baekjoon_2441.cpp
//  baekjoon
//
//  Created by KoDakyung on 11/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    cin >> n;
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if(j < i) cout << ' ';
            else cout << '*';
        }
        cout << '\n';
    }
    return 0;
}
