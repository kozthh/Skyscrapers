#include <iostream>
using namespace std;
int main() {
    //using namespace
    string name;
    int age;
    double weight;
    string Gender;
    char initial;
    float salary;

    cout << "Enter your name: "; cin >> name;
    cout << "Enter your age: "; cin >> age;
    cout << "Enter your weight: "; cin >> weight;
    cout << "Enter your SEX M or F: "; cin >> Gender;

    if (Gender == "M" || Gender == "m"){
        Gender = "Male";
    }
    else{
        Gender = "Female";
    }

    cout << "Enter your salary: "; cin >> salary;
    cout << "Enter your initial: "; cin >> initial;
    cout << "" << endl;

    cout << "your name is "<< name << " and you are " << age << " years old."
            "your salary is: "<< salary<< endl;
    return 0;
}
