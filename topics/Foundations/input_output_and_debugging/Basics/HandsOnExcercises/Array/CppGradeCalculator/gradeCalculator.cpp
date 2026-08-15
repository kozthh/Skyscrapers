#include "library.h"

#include <cmath>
#include <iomanip>
#include <iostream>

void hello() {
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
