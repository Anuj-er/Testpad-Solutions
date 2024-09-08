#include <iostream>
using namespace std;
int main() {
    int N;
    cin >> N;
    int sum = 0;
    int num;
    for (int i = 0; i < N; ++i) {
        cin >> num;
        sum += num;
    }
    cout << sum << endl;
    return 0;
}