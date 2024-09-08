#include <iostream>
using namespace std;
class Distance
{
private:
    double feet, inch;
public:
    Distance() : feet(0), inch(0) {}
    Distance(double f, double i) : feet(f), inch(i) {
        normalize();
    }

    void readDistance() {
        cin >> feet >> inch;
        normalize(); 
    }
    void display() const {
        cout << static_cast<int>(feet) << "'"
             << static_cast<int>(inch) << "\"";
    }
    Distance operator+(const Distance &other) const {
        double totalFeet = feet + other.feet;
        double totalInches = inch + other.inch;
        return Distance(totalFeet + totalInches / 12, fmod(totalInches, 12));
    }
    Distance operator-(const Distance &other) const {
        double totalFeet = feet - other.feet;
        double totalInches = inch - other.inch;
        if (totalInches < 0) {
            totalFeet -= 1;
            totalInches += 12; 
        }
        return Distance(totalFeet, totalInches);
    }
private:
    void normalize() {
        if (inch >= 12) {
            feet += inch / 12;
            inch = fmod(inch, 12);
        } else if (inch < 0) {
            feet -= (abs(inch) / 12) + 1;
            inch = 12 + fmod(inch, 12);
        }
    }
};