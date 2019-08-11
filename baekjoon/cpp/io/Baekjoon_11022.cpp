//
//  Baekjoon_11022.cpp
//  baekjoon
//
//  Created by KoDakyung on 10/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int x;
    string a, b;
    
    cin >> x;
    for(int i=1; i<=x; i++){
        getline(cin, a, ' ');
        getline(cin, b);
        int ia = stoi(a);
        int ib = stoi(b);
        cout << "Case #" << i << ": " << ia << " + " << ib << " = " << ia+ib <<endl;
    }
    return 0;
}
