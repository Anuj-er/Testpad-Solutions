class Box
{
private:
    int length, breadth, height;

public:
    Box() : length(0), breadth(0), height(0) {}
    Box(int length, int breadth, int height) : length(length), breadth(breadth), height(height) {}
    Box(const Box &b) : length(b.length), breadth(b.breadth), height(b.height) {}
    int getLength() const { return length; }
    int getBreadth() const { return breadth; }
    int getHeight() const { return height; }
    long long CalculateVolume() const
    {
        return (long long)length * breadth * height;
    }
};