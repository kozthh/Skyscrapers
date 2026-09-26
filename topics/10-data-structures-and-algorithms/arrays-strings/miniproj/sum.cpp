//
// Created by kenneth on 9/26/2026.
//
#include <iostream>

using namespace std;

const int SIZE = 10;

void inputArray(int* array) {
    int* current = array;

    for (int row = 0; row < SIZE; ++row) {
        for (int column = 0; column < SIZE; ++column) {
            cout << "Enter value [" << row << "][" << column << "]: ";
            cin >> *current;
            ++current;
        }
    }
}

void printRowSums(const int* array) {
    cout << "\nRow sums:\n";

    for (int row = 0; row < SIZE; ++row) {
        int sum = 0;
        const int* current = array + row * SIZE;

        for (int column = 0; column < SIZE; ++column) {
            sum += *current;
            ++current;
        }

        cout << "Row " << row + 1 << ": " << sum << '\n';
    }
}

void printColumnSums(const int* array) {
    cout << "\nColumn sums:\n";

    for (int column = 0; column < SIZE; ++column) {
        int sum = 0;
        const int* current = array + column;

        for (int row = 0; row < SIZE; ++row) {
            sum += *current;
            current += SIZE;
        }

        cout << "Column " << column + 1 << ": " << sum << '\n';
    }
}

int main() {
    int* array = new int[SIZE * SIZE];

    inputArray(array);
    printRowSums(array);
    printColumnSums(array);

    delete[] array;
    return 0;
}
