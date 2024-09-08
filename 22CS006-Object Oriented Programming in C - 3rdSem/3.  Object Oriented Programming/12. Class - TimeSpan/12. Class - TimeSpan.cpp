#include <string>
#include <sstream>
class TimeSpan {
private:
    int hours;
    int minutes;
    void normalize() {
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }
public:
    TimeSpan(int h, int m) : hours(h), minutes(m) {
        normalize();
    }
    int getHours() const {
        return hours;
    }
    int getMinutes() const {
        return minutes;
    }
    void add(int h, int m) {
        hours += h;
        minutes += m;
        normalize();
    }
    void add(const TimeSpan& tp) {
        hours += tp.hours;
        minutes += tp.minutes;
        normalize();
    }
    double getTotalHours() const {
        return hours + static_cast<double>(minutes) / 60;
    }
    std::string toString() const {
        std::ostringstream oss;
        oss << hours << " Hours, " << minutes << " Minutes";
        return oss.str();
    }
};