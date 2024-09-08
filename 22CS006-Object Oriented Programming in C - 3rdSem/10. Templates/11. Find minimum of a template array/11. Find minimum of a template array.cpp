#include <iostream>
#include <string>
#include <limits>
using namespace std;
template <typename T>
T minElement(T arr[], int size) {
    if (size <= 0) {
        throw invalid_argument("Array size must be positive");
    }
    T minValue = arr[0];
    for (int i = 1; i < size; ++i) {
        if (arr[i] < minValue) {
            minValue = arr[i];
        }
    }
    return minValue;
}
void demonstrateMinElement() {
    int intArr[] = {3, 1, 4, 1, 5};
    int intSize = sizeof(intArr) / sizeof(intArr[0]);
    cout << "Minimum integer: " << minElement(intArr, intSize) << endl;
    float floatArr[] = {3.1f, 1.4f, 4.1f, 1.6f, 5.0f};
    int floatSize = sizeof(floatArr) / sizeof(floatArr[0]);
    cout << "Minimum float: " << minElement(floatArr, floatSize) << endl;
    string strArr[] = {"apple", "banana", "cherry", "date"};
    int strSize = sizeof(strArr) / sizeof(strArr[0]);
    cout << "Minimum string: " << minElement(strArr, strSize) << endl;
}