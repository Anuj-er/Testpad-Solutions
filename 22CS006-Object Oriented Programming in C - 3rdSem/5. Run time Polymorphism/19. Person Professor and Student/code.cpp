#include<iostream>
using namespace std;
class Person {
protected:
    int age;
public:
    virtual void getdata() = 0;
    virtual void putdata() = 0;
};
class Professor : public Person {
private:
    int publications;
    int cur_id;
    static int id_counter; 
public:
    Professor() {
        cur_id = ++id_counter;  
    }
    void getdata() override {
        cin >> age >> publications;
    }
    void putdata() override {
        cout << age << " " << publications << " " << cur_id << endl;
    }
};
int Professor::id_counter = 0;  
class Student : public Person {
private:
    int marks[6];
    int cur_id;
    static int id_counter;  
public:
    Student() {
        cur_id = ++id_counter;  
    }
    void getdata() override {
        cin >> age;
        for (int i = 0; i < 6; ++i) {
            cin >> marks[i];
        }
    }
    void putdata() override {
        int sum_marks = 0;
        for (int i = 0; i < 6; ++i) {
            sum_marks += marks[i];
        }
        cout << age << " " << sum_marks << " " << cur_id << endl;
    }
};
int Student::id_counter = 0; 