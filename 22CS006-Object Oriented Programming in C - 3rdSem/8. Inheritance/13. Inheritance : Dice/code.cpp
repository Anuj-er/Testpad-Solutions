#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <ctime>
class Dice {
public:
    Dice(int count) : count(count) {
        diceValues = new int[count];
        for (int i = 0; i < count; ++i) {
            diceValues[i] = 6; 
        }
    }
    ~Dice() {
        delete[] diceValues;
    }

    virtual int getCount() const {
        return count;
    }

    virtual int getValue(int index) const {
        if (index >= 0 && index < count) {
            return diceValues[index];
        }
        return -1; 
    }

    virtual void roll(int index) {
        if (index >= 0 && index < count) {
            diceValues[index] = rand() % 6 + 1; 
        }
    }
    virtual int total() const {
        int sum = 0;
        for (int i = 0; i < count; ++i) {
            sum += diceValues[i];
        }
        return sum;
    }
    virtual std::string toString() const {
        std::ostringstream oss;
        oss << "{";
        for (int i = 0; i < count; ++i) {
            oss << diceValues[i];
            if (i < count - 1) {
                oss << ", ";
            }
        }
        oss << "}";
        return oss.str();
    }
    friend std::ostream& operator<<(std::ostream& out, const Dice& dice) {
        out << dice.toString();
        return out;
    }
private:
    int* diceValues; 
    int count;     
};