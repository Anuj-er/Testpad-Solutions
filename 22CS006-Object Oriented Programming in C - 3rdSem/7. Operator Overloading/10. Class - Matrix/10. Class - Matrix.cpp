#include <iostream>
using namespace std;
class Matrix
{
    int m, n, a[20][20];
public:
    Matrix(int x, int y)
    {
        m = x;
        n = y;
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = 0;
    }
    void readmat()
    {
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                cin >> a[i][j];
    }
    Matrix operator +(Matrix a2)
    {
        Matrix res(m, n); 
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                res.a[i][j] = a[i][j] + a2.a[i][j]; 
        return res; 
    }
    void display()
    {
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                cout << a[i][j] << " "; 
        cout << endl;
    }
};