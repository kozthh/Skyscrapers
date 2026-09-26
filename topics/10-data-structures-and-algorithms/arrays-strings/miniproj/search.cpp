//
// Created by kenneth on 9/26/2026.
//
#include <iostream>

using namespace std;

void inputValues(int* values, int size) {
    for (int* current = values; current < values + size; ++current) {
        cout << "Enter value " << (current - values + 1) << ": ";
        cin >> *current;
    }
}

int sequentialSearch(const int* values, int size, int target) {
    const int* current = values;

    while (current < values + size) {
        if (*current == target) {
            return static_cast<int>(current - values);
        }
        ++current;
    }

    return -1;
}

int main() {
    int size;

    cout << "How many values should the array contain? ";
    cin >> size;

    if (size <= 0) {
        cout << "The array size must be greater than zero." << endl;
        return 1;
    }

    int* values = new int[size];
    inputValues(values, size);

    int target;
    cout << "Enter a value to search for: ";
    cin >> target;

    int index = sequentialSearch(values, size, target);

    if (index == -1) {
        cout << target << " was not found in the array." << endl;
    } else {
        cout << target << " was found at index " << index << "." << endl;
    }

    delete[] values;
    return 0;
}
