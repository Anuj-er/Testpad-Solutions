#include<iostream>
#include<cstdio>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
    float principal, rate, time;
    cin >> principal >> rate >> time;
    float amount = principal * pow((1 + rate / 100), time);
    cout << fixed << setprecision(1) << amount << endl;
    return 0;
}