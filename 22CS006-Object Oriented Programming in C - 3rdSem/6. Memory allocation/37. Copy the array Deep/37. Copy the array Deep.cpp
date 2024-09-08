class Array {
private:
    int *arr;
public:
    Array() {
        arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = i;
        }
    }
    Array(const Array &other) {
        arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = other.arr[i]; 
        }
    }
    Array& operator=(const Array &other) {
        if (this == &other) {
            return *this;
        }
        delete[] arr;
        arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = other.arr[i];
        }
        return *this;
    }
    ~Array() {
        delete[] arr;
    }
    void printArray() {
        for (int i = 0; i < 4; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
    void changeArray() {
        for (int i = 0; i < 4; i++) {
            arr[i] = i * i;
        }
    }
};