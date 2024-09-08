#include <iostream>
#include <queue>
#include <stack>
void flipHalfQueue(std::queue<int>& q) {
    std::stack<int> s;
    std::queue<int> tempQueue;
    int index = 0;
    while (!q.empty()) {
        int current = q.front();
        q.pop();
        if (index % 2 == 1) { 
            s.push(current);
        }
        tempQueue.push(current);
        index++;
    }
    index = 0;
    while (!tempQueue.empty()) {
        int current = tempQueue.front();
        tempQueue.pop();
        if (index % 2 == 1) {
            q.push(s.top());
            s.pop();
        } else {
            q.push(current);
        }
        index++;
    }
}