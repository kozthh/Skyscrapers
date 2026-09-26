#include <cmath>
#include <iomanip>
#include <iostream>
#include <limits>

using namespace std;

void readChoice(char& choice) {
    while (true) {
        cout << "Choice ...: ";
        if (cin >> choice) {
            cin.ignore(numeric_limits<streamsize>::max(), '\n');

            if (choice >= 'a' && choice <= 'z') {
                choice = static_cast<char>(choice - 'a' + 'A');
            }

            if (choice >= 'A' && choice <= 'E') {
                return;
            }
        } else {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
        }

        cout << "Invalid choice. Please select A, B, C, D, or E.\n";
    }
}

template <typename T>
void readNumber(const char* prompt, T& value) {
    while (true) {
        cout << prompt;
        if (cin >> value) {
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            return;
        }

        cout << "Invalid input. Please enter a number.\n";
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }
}

void readPositiveNumber(const char* prompt, long double& value) {
    do {
        readNumber(prompt, value);
        if (value <= 0) {
            cout << "The value must be greater than zero.\n";
        }
    } while (value <= 0);
}

void calculateFactorial(const unsigned int& number,
                        unsigned long long& result) {
    result = 1;
    for (unsigned int current = number; current > 1; --current) {
        result *= current;
    }
}

void calculateFibonacci(const unsigned int& position,
                        unsigned long long& result) {
    unsigned long long previous = 0;
    unsigned long long current = 1;

    for (unsigned int index = 0; index < position; ++index) {
        const unsigned long long next = previous + current;
        previous = current;
        current = next;
    }

    result = previous;
}

void calculateLogarithm(const long double& number, const long double& base,
                        long double& result) {
    result = log(number) / log(base);
}

void calculateExponential(const long double& base, const long double& exponent,
                          long double& result) {
    result = pow(base, exponent);
}

void factorialMenu() {
    unsigned int number;
    unsigned long long result;

    readNumber("Enter a non-negative integer: ", number);
    calculateFactorial(number, result);
    cout << number << "! = " << result << "\n\n";
}

void fibonacciMenu() {
    unsigned int position;
    unsigned long long result;

    readNumber("Enter the Fibonacci position (0 or greater): ", position);
    calculateFibonacci(position, result);
    cout << "Fibonacci(" << position << ") = " << result << "\n\n";
}

void logarithmMenu() {
    long double number;
    long double base;
    long double result;

    readPositiveNumber("Enter the number (> 0): ", number);
    do {
        readPositiveNumber("Enter the base (> 0 and not 1): ", base);
        if (base == 1) {
            cout << "The base must be different from one.\n";
        }
    } while (base == 1);

    calculateLogarithm(number, base, result);
    cout << "log base " << base << " of " << number << " = "
         << setprecision(12) << result << "\n\n";
}

void exponentialMenu() {
    long double base;
    long double exponent;
    long double result;

    readNumber("Enter the base: ", base);
    readNumber("Enter the exponent: ", exponent);
    calculateExponential(base, exponent, result);
    cout << base << "^" << exponent << " = "
         << setprecision(12) << result << "\n\n";
}

int main() {
    char choice;

    do {
        cout << "Main Menu\n"
             << "[A] Factorial\n"
             << "[B] Fibonacci\n"
             << "[C] Logarithm\n"
             << "[D] Exponential\n"
             << "[E] Exit\n";
        readChoice(choice);

        switch (choice) {
            case 'A':
                factorialMenu();
                break;
            case 'B':
                fibonacciMenu();
                break;
            case 'C':
                logarithmMenu();
                break;
            case 'D':
                exponentialMenu();
                break;
            case 'E':
                cout << "Program terminated.\n";
                break;
        }
    } while (choice != 'E');

    return 0;
}
