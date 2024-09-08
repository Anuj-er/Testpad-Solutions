#include<iostream>
#include<cstring>
using namespace std;
class GoodString {
private:
    static const int MAX_SIZE = 100; 
    char str[MAX_SIZE + 1];       
public:
    GoodString(const char* input) {
        strncpy(str, input, MAX_SIZE);
        str[MAX_SIZE] = '\0'; 
    }
    GoodString left(int n) {
        char temp[MAX_SIZE + 1];
        strncpy(temp, str, n);
        temp[n] = '\0';
        return GoodString(temp);
    }
    GoodString mid(int s, int n) {
        char temp[MAX_SIZE + 1];
        strncpy(temp, str + s, n);
        temp[n] = '\0';
        return GoodString(temp);
    }
    GoodString right(int n) {
        int len = strlen(str);
        char temp[MAX_SIZE + 1];
        strncpy(temp, str + len - n, n);
        temp[n] = '\0';
        return GoodString(temp);
    }
    void display() {
        cout << str << endl;
    }
};
int main() {
    int n;
    cin >> n;
    cin.ignore();
    char input[200];
    cin.getline(input, 200);
    GoodString s1(input);
    GoodString s2 = s1.left(n);
    s2.display();
    return 0;
}