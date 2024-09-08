#include <iostream>
#include <string>
using namespace std;
void cq1(int n)
{
    try {
        if (n < 0) {
            throw -1;
        } else if (n == 0) {
            throw "ZERO";
        } else if (n > 0) {
            throw 1.0;
        }
    }
    catch (int e) {
        if (e == -1) {
            cout << "NEGATIVE" << endl;
        }
    }
    catch (const char* msg) {
        cout << "ZERO" << endl;
    }
    catch (double e) {
        if (e == 1.0) {
            cout << "POSITIVE" << endl;
        }
    }
}