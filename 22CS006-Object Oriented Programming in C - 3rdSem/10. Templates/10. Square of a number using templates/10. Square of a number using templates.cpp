#include <iostream>
using namespace std;
template <typename T>
T square(T x) {
    return x * x;
}
void demonstrateSquare() {
    int intVal = 5;
    cout << "Square of " << intVal << " is " << square(intVal) << endl;
    double doubleVal = 3.14;
    cout << "Square of " << doubleVal << " is " << square(doubleVal) << endl;
    float floatVal = 2.5f;
    cout << "Square of " << floatVal << " is " << square(floatVal) << endl;
}