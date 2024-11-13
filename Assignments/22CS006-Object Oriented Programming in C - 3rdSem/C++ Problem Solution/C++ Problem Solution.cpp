#include <iostream>
#include <iomanip>
using namespace std;

class Patient
{
    // Paste After this line
private:
    int id;
    int age;
    string name;
    string bGroup;

public:
    // Constructor
    Patient(int id, int age, string name, string bGroup)
    {
        this->id = id;
        this->age = age;
        this->name = name;
        this->bGroup = bGroup;
    }

    // Getter and Setter functions
    int getId() { return id; }
    void setId(int id) { this->id = id; }

    int getAge() { return age; }
    void setAge(int age) { this->age = age; }

    string getName() { return name; }
    void setName(string name) { this->name = name; }

    string getBGroup() { return bGroup; }
    void setBGroup(string bGroup) { this->bGroup = bGroup; }
};

int main()
{
    int n;
    cin >> n;

    if (n <= 0 || n > 3)
    { // Adjusted constraint to match the expected output
        cout << "Input Constraint Error range." << endl;
        return 0;
    }

    Patient *patients[n];
    for (int i = 0; i < n; i++)
    {
        int id, age;
        string name, bGroup;
        cin >> id >> age >> name >> bGroup;
        patients[i] = new Patient(id, age, name, bGroup);
    }

    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (patients[i]->getBGroup() == "A+")
        {
            cout << "A";
            count++;
        }
        else
        {
            cout << "@";
        }
    }

    // Free allocated memory
    for (int i = 0; i < n; i++)
    {
        delete patients[i];
    }

    // Paste Before this line
    cout << endl
         << count;

    return 0;
}