//
//  Baekjoon_1924.cpp
//  baekjoon
//
//  Created by KoDakyung on 11/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int x, y;
    int month[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int days = 0;
    
    cin >> x >> y;
    
    for(int i = 0; i < x-1 ; i++) {
        days += month[i];
    }
    days += y;
    
    switch (days % 7) {
        case 1:
            cout << "MON";
            break;
        case 2:
            cout << "TUE";
            break;
        case 3:
            cout << "WED";
            break;
        case 4:
            cout << "THU";
            break;
        case 5:
            cout << "FRI";
            break;
        case 6:
            cout << "SAT";
            break;
        case 0:
            cout << "SUN";
            break;
            
        default:
            break;
    }
    
    return 0;
}
