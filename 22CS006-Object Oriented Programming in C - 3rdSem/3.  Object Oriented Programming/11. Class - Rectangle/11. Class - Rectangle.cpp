#include <string>
#include <sstream>
class Rectangle {
private:
    int x, y, width, height;
public:
    Rectangle(int x, int y, int width, int height) 
        : x(x), y(y), width(width), height(height) {}
    int getHeight() const {
        return height;
    }
    int getWidth() const {
        return width;
    }
    int getX() const {
        return x;
    }
    int getY() const {
        return y;
    }
    std::string toString() const {
        std::ostringstream oss;
        oss << "Rectangle[x=" << x << ",y=" << y << ",width=" << width << ",height=" << height << "]";
        return oss.str();
    }
};