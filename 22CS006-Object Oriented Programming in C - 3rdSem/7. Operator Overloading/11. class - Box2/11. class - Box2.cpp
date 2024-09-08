#include <iostream>
using namespace std;
class Box2 {
private:
    int length, breadth, height;
public:
    Box2() : length(0), breadth(0), height(0) {}
    Box2(int l, int b, int h) : length(l), breadth(b), height(h) {}
    Box2(const Box2 &b1) : length(b1.length), breadth(b1.breadth), height(b1.height) {}
    int getLength() const {
        return length;
    }
    int getBreadth() const {
        return breadth;
    }
    int getHeight() const {
        return height;
    }
    long long CalculateVolume() const {
        return static_cast<long long>(length) * breadth * height;
    }
    bool operator<(const Box2 &b) const {
        return (length < b.length && breadth < b.breadth && height < b.height);
    }
    friend ostream& operator<<(ostream &out, const Box2 &B) {
        out << B.length << " " << B.breadth << " " << B.height;
        return out;
    }
};