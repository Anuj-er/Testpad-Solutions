#include <queue>
void doubleQueue(std::queue<int>& q)
{
    int size = q.size();
    for (int i = 0; i < size; ++i) {
        int elem = q.front();
        q.pop();
        q.push(elem);
        q.push(elem);
    }
}