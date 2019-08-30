//
//  Baekjoon_10809.cpp
//  baekjoon
//
//  Created by KoDakyung on 29/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>

using namespace std;

int main(int argc, const char * argv[]) {
    char c[100];
    scanf("%s", c);
    
    int a[26];
    fill_n(a, 26, -1);
    
    int i=0;
    while(c[i]) {
        if (a[c[i] - 'a'] == -1) a[c[i] - 'a'] = i;
        i++;
    }
    
    for (int j=0; j<25; j++) {
        cout << a[j] << " ";
    }
    cout << a[25];
    return 0;
}
