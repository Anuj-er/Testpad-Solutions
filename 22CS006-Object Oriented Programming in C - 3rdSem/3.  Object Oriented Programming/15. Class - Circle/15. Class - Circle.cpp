#include <cmath>
#include <iomanip>
#include <sstream>
#include <string>
using namespace std;
class Circle {
private:
    double radius;
public:
    Circle(double r) : radius(r) {}
    double area() const {
        return round((M_PI * radius * radius) * 100) / 100;
    }
    double circumference() const {
        return round((2 * M_PI * radius) * 100) / 100;
    }
    double getRadius() const {
        return round(radius * 10) / 10;
    }
    string toString() const {
        ostringstream oss;
        oss << "Circle{radius=" << fixed << setprecision(1) << radius << "}";
        return oss.str();
    }
};