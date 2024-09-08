#include <iostream>
#include <vector>
using namespace std;
int main()
{
    int n;
    cin >> n;
    vector<int> array(n);  
    for (int i = 0; i < n; ++i) {
        cin >> array[i];
    }
    int q; 
    cin >> q;
    for (int i = 0; i < q; ++i) {
        int index;
        cin >> index;
        if (index >= 0 && index < n) {
            cout << array[index] << endl;
        } else {
            cout << "Out of Bounds" << endl;
        }
    }
    return 0;
}