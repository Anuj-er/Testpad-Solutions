#include <iostream>
#include <vector>
using namespace std;
void rotateArray(vector<int>& arr, int N, int R) {
    int rotations = R % N;
    vector<int> rotated(N);
    for (int i = 0; i < N; ++i) {
        rotated[(i + N - rotations) % N] = arr[i];
    }
    for (int i = 0; i < N; ++i) {
        cout << rotated[i];
        if (i < N - 1) {
            cout << " ";
        }
    }
    cout << endl;
}
int main() {
    int T;
    cin >> T;
    while (T--) {
        int N;
        cin >> N;
        vector<int> arr(N);
        for (int i = 0; i < N; ++i) {
            cin >> arr[i];
        }
        int R;
        cin >> R;
        rotateArray(arr, N, R);
    }
    return 0;
}