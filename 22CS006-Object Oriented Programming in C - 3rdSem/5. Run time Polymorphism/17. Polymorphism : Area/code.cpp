#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;
int main() {
    int choice;
    cin >> choice;
    if (choice == 1) { 
        double radius;
        cin >> radius;
        double volume =  1.33*3.14*radius*radius*radius;
        printf("Volume of sphere is %.3f\n", volume);
    } else if (choice == 2) { // Cylinder
        double radius, height;
        cin >> radius >> height;
        double volume = 3.14*radius*radius*height;
        printf("Volume of cylinder is %.3f\n", volume);
    } else if (choice == 3) { // Cone
        double radius, height;
        cin >> radius >> height;
        double volume = 0.33*3.14*radius*radius*height;
        printf("Volume of cone is %.3f\n", volume);
    } else if (choice == 4) { // Cube
        double side;
        cin >> side;
        double volume = side*side*side;
        printf("Volume of cube is %.3f\n", volume);
    } else { // Wrong choice
        cout << "wrong choice" << endl;
    }
    return 0;
}