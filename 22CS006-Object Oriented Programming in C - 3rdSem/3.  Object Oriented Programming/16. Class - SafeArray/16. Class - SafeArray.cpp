#include<iostream>
using namespace std;
class SafeArray {
private:
    int* arr;
    int size;
public:

    SafeArray(int s) : size(s) {
        arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = 0;
        }
    }

    ~SafeArray() {
        delete[] arr;
    }

    void putElement(int index, int value) {
        if (index >= 0 && index < size) {
            arr[index] = value;
        }
    }

    int getElement(int index) const {
        if (index >= 0 && index < size) {
            return arr[index];
        } else {
            return -1; 
        }
    }
};