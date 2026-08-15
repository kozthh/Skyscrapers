#include "library.h"

#include <cmath>
#include <iomanip>
#include <iostream>

void hello() {
    const int numGrades = 5;
    double total = 0.0;

    std::cout << "Student Grade Assessment Calculator\n";

    for (int i = 1; i <= numGrades; ++i) {
        double grade;
        std::cout << "Enter grade " << i << ": ";
        std::cin >> grade;
        total += grade;
    }

    double average = total / numGrades;
    int rounded = static_cast<int>(std::ceil(average));

    std::cout << "Average: " << std::fixed << std::setprecision(3) << average << '\n';
    std::cout << "Rounded up: " << rounded << '\n';

    std::cout << "Assessment: ";
    if (average > 90) {
        std::cout << "Excellent";
    } else if (average > 80) {
        std::cout << "Well done";
    } else if (average > 70) {
        std::cout << "Good";
    } else if (average >= 60) {
        std::cout << "Needs Improvement";
    } else {
        std::cout << "Fail";
    }
    std::cout << '\n';

    int num;
    std::cout << "Enter a number: ";
    std::cin >> num;

    bool by6 = num % 6 == 0;
    bool by7 = num % 7 == 0;

    std::cout << "num = " << num << '\n';
    if (by6 && by7) {
        std::cout << "Divisible by 6 and 7\n";
    } else if (by6) {
        std::cout << "Divisible by 6\n";
    } else if (by7) {
        std::cout << "Divisible by 7\n";
    } else {
        std::cout << "Not divisible\n";
    }
}
