//
//  Baekjoon_10866.cpp
//  baekjoon
//
//  Created by KoDakyung on 29/08/2019.
//  Copyright © 2019 KoDakyung. All rights reserved.
//

#include <iostream>
#include <deque>

using namespace std;

int main(int argc, const char * argv[]) {
    deque<int> d;
    int n;
    cin >> n;
    for (int i=0; i<n; i++) {
        string s;
        cin >> s;
        if (s == "push_front") {
            int v;
            cin >> v;
            d.push_front(v);
        } else if (s == "push_back") {
            int v;
            cin >> v;
            d.push_back(v);
        } else if (s == "pop_front") {
            if (d.empty()) cout << "-1\n";
            else {
                cout << d.front() << '\n';
                d.pop_front();
            }
        } else if (s == "pop_back") {
            if (d.empty()) cout << "-1\n";
            else {
                cout << d.back() << '\n';
                d.pop_back();
            }
        }
        else if (s == "size") {
            cout << d.size() << '\n';
        } else if (s == "empty") {
            cout << d.empty() << '\n';
        } else if (s == "front") {
            if (d.empty())
                cout << -1 << '\n';
            else
                cout << d.front() << '\n';
        } else if (s == "back") {
            if (d.empty())
                cout << -1 << '\n';
            else
                cout << d.back() << '\n';
        }
    }
    return 0;
}
