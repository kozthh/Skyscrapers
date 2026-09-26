//
// Created by kenne on 9/6/2026.
//
#include <iostream>
using namespace std;

int main(){

    int number[10] = {1,2,3,4,5,6,7,8,9,10};
    int size = sizeof(number)/sizeof(number[0]);
    int key;
    bool isFound = false;

    cout << "Enter a number to find: " << "";
    cin >> key;


    for (int i = 0; i<size; i++)
    {
        if (number[i] == key)
        {
            cout << "congrastulations number is found at index " << i << endl;
            isFound = true;
            break;
        }

        if (!isFound)
        {
            cout << "the number is not existing in the list" << endl;
        }
    }


    return 0;}
