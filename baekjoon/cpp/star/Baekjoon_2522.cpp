//
//  Baekjoon_2522.cpp
//  baekjoon
//
//  Created by KoDakyung on 12/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

void print_star(int n, int i) {
    for(int j = 1; j <= n-i; j++) {
        cout << ' ';
    }
    for(int j = n-i+1; j<=n; j++) {
        cout << '*';
    }
    cout << '\n';
}

int main(int argc, const char * argv[]) {
    int n;
    cin >> n;
    
    for(int i = 1; i <= n; i++) {
        print_star(n, i);
    }
    for(int i = n-1; i >= 1; i--){
        print_star(n, i);
    }
    return 0;
}
