#include <iostream>
#include <string>
using namespace std;
void isvalidemail(string id)
{
    try {
        size_t atPos = id.find('@');
        if (atPos == string::npos) {
            throw 'a'; 
        }
        size_t dotPos = id.find('.');
        if (dotPos == string::npos) {
            throw 'b'; 
        }
        if (dotPos <= atPos) {
            throw 'c'; 
        }
        cout << "Valid" << endl;
    }
    catch (char exceptionType) {
        if (exceptionType == 'a' || exceptionType == 'b' || exceptionType == 'c') {
            cout << "Invalid" << endl;
        }
    }
}