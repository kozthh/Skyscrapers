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

    cout << "find a number :";
    cin >> key;

    for (int i = 0; i<size; i++)
        {
            if (number[i] == key)
            {
                cout << number[i] << " is found on the list" << endl;
                cout << "found at index " << i  << endl;
                isFound = true;
                break;
            }
        }
        if (!isFound){
            cout << "number not existing" << endl;
        }


    return 0;}

