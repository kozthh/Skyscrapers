#include <iostream>
#include <vector>
using namespace std;

void display(string Student_Name, int Student_ID, const vector<double>& grade);
double calculator(const vector<double>& grade);

int main() {
    string Student_Name;
    int Student_ID;
    vector<double> grade(9);

    cout << "Enter Student Name: ";
    cin >> Student_Name;

    cout << "Enter Student ID: ";
    cin >> Student_ID;

    cout << "" << endl;

    for (size_t i = 0; i < grade.size(); i++) {
        cout << "enter your grade: ";
        cin >> grade[i];
    }

    display(Student_Name, Student_ID, grade);
    double average = calculator(grade);
    cout << "average = " << average << endl;

    return 0;
}

void display(string Student_Name, int Student_ID, const vector<double>& grade) {
    cout << Student_Name << endl;
    cout << Student_ID << endl;

    for (size_t i = 0; i < grade.size(); i++) {
        cout << grade[i] << endl;
    }
}

double calculator(const vector<double>& grade) {
    double average = 0;
    for (size_t i = 0; i < grade.size(); i++) {
        average += grade[i];
    }
    return average / grade.size();
}
