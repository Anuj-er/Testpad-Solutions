#include <iostream>
using namespace std;
class Complex
{
private:
    int real, imag;
public:
    Complex() : real(0), imag(0) {}
    Complex(int r, int i) : real(r), imag(i) {}
    Complex operator+(const Complex &other) const {
        return Complex(real + other.real, imag + other.imag);
    }
    Complex operator-(const Complex &other) const {
        return Complex(real - other.real, imag - other.imag);
    }
    void display() const {
        cout << real;
        if (imag >= 0)
            cout << "+" << imag << "i";
        else
            cout << imag << "i";
    }
};