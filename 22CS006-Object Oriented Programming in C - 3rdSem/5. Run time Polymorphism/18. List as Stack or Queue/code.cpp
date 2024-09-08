#include<iostream>
#include<vector>
using namespace std;

class List {
public:
    virtual void store(int value) = 0;
    virtual int retrieve() = 0;
};

class Stack : public List {
private:
    vector<int> stack;
public:
    void store(int value) override {
        stack.push_back(value);
    }
    int retrieve() override {
        if (!stack.empty()) {
            int value = stack.back();
            stack.pop_back();
            return value;
        }
        return -1; 
    }
};

class Queue : public List {
private:
    vector<int> queue;
public:
    void store(int value) override {
        queue.push_back(value);
    }
    int retrieve() override {
        if (!queue.empty()) {
            int value = queue.front();
            queue.erase(queue.begin());
            return value;
        }
        return -1; 
    }
};
int main() {
    int choice;
    cin >> choice;
    List* list;
    if (choice == 1) {
        list = new Stack();
    } else if (choice == 2) {
        list = new Queue();
    } else {
        return 0; 
    }
    int operation;
    while (cin >> operation) {
        if (operation == 1) {
            int value;
            cin >> value;
            list->store(value);
        } else if (operation == 2) {
            int result = list->retrieve();
            if (result != -1) {
                cout << result << endl;
            }
        }
    }
    delete list;
    return 0;
}