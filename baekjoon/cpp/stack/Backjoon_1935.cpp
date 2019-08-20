//
//  Backjoon_1935.cpp
//  baekjoon
//
//  Created by KoDakyung on 15/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
#include <stack>
using namespace std;

double logic(char o, double a, double b) {
    double result = 0.0;
    switch(o) {
        case '+':
            result = a + b;
            break;
        case '-':
            result = a - b;
            break;
        case '*':
            result = a * b;
            break;
        case '/':
            result = a / b;
            break;
    }
    return result;
}

int main(int argc, const char * argv[]) {
    int n;
    cin >> n;
    string str;
    cin >> str;
    stack<double> s;
    
    double iarr[n];
    for (int i=0; i<n; i++) {
        cin >> iarr[i];
    }
    
    double value = 0.0;
    for (int i = 0; i < str.size(); i++) {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            s.push(iarr[str[i] - 'A']);
        } else if (str[i] == '+' || str[i] == '-' || str[i] == '*' || str[i] == '/'){
            double b = s.top();
            s.pop();
            double a = s.top();
            s.pop();
            value = logic(str[i], a, b);
            s.push(value);
        }
    }
    
    printf("%.2f\n", value);
    return 0;
}
