#include <iostream>
using namespace std;
template <class T>
class Calculate {
private:
    T a, b;
public:
    Calculate(T x, T y) : a(x), b(y) {}
    T add() const {
        return a + b;
    }
    T sub() const {
        return a - b;
    }
    T mul() const {
        return a * b;
    }
    T div() const {
        if (b != 0) {
            return a / b;
        } else {
            throw runtime_error("Division by zero");
        }
    }
};