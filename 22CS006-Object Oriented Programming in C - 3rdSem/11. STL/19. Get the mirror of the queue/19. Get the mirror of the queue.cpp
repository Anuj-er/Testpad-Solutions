#include <queue>
#include <stack>
#include <string>
#include <iostream>
void mirrorQueue(std::queue<std::string>& q)
{
    std::stack<std::string> s;
    int size = q.size();
    for (int i = 0; i < size; ++i) {
        std::string elem = q.front();
        q.pop();
        s.push(elem);
        q.push(elem);
    }
    while (!s.empty()) {
        q.push(s.top());
        s.pop();
    }
}