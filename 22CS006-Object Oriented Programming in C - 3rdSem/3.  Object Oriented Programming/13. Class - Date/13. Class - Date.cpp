#include <iostream> 
#include <string>    
#include <vector>   
using namespace std;
class Date {
private:
    int month;
    int day;
    const vector<int> daysInEachMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    bool isValidDate(int m, int d) {
        if (m < 1 || m > 12) return false;
        if (d < 1 || d > daysInEachMonth[m - 1]) return false; 
        return true; 
    }
public:
    Date(int m, int d) {
        if (isValidDate(m, d)) {
            month = m;
            day = d;
        } else {
            throw invalid_argument("Invalid date!");
        }
    }
    int daysInMonth() const {
        return daysInEachMonth[month - 1]; 
    }
    int getDay() const {
        return day; 
    }

    int getMonth() const {
        return month; 
    }
    void nextDay() {
        if (day < daysInMonth()) {
            day++; 
        } else {
            day = 1;
            if (month < 12) {
                month++; 
            } else {
                month = 1; 
            }
        }
    }

    string toString() const {
        return to_string(month) + "/" + to_string(day); 
    }
    int absoluteDay() const {
        int absoluteDay = 0;
        for (int i = 0; i < month - 1; ++i) {
            absoluteDay += daysInEachMonth[i];
        }
        absoluteDay += day;
        return absoluteDay;
    }
};