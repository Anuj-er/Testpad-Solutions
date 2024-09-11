class IntValue {
private:
    int value;

public:
    IntValue() : value(0) {}
  	IntValue(int a) : value(a) {}
    void setValue() {
        value = 0;
    }
    void setValue(int a) {
        value = a;
    }
    void display() {
        cout << value;
    }
    IntValue operator+(const IntValue& other) const {
        long long result = static_cast<long long>(value) + static_cast<long long>(other.value);
        if (result < -2147483647 || result > 2147483647) {
            cout << "Out of Range" << endl;
            exit(1);
        }
        return IntValue(static_cast<int>(result));
    }
    IntValue operator-(const IntValue& other) const {
        long long result = static_cast<long long>(value) - static_cast<long long>(other.value);
        if (result < -2147483647 || result > 2147483647) {
            cout << "Out of Range" << endl;
            exit(1);
        }
        return IntValue(static_cast<int>(result));
    }
    IntValue operator*(const IntValue& other) const {
        long long result = static_cast<long long>(value) * static_cast<long long>(other.value);
        if (result < -2147483647 || result > 2147483647) {
            cout << "Out of Range" << endl;
            exit(1);
        }
        return IntValue(static_cast<int>(result));
    }
};