#include<iostream>
#include<string>
using namespace std;
int main()
{
    string username, password;
    cin >> username;
    cin >> password;
    try {
        if (password.length() < 6) {
            throw 's';
        }
        bool hasDigit = false;
        for (char c : password) {
            if (isdigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            throw 'd';
        }
        cout << "Correct" << endl;
    }
    catch (char exceptionType) {
        if (exceptionType == 's') {
            cout << "Too short!" << endl;
        }
        else if (exceptionType == 'd') {
            cout << "No digit!" << endl;
        }
    }
    return 0;
}