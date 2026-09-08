//
// Created by kenne on 9/6/2026.
//
#include <iostream>
using namespace std;

int main(){
    int data[] = {90, 57, 21, 45, 12, 45, 65, 12, 65, 67, 12, 54, 32, 68, 43};
    int size = sizeof(data)/sizeof(data[0]);

    for (int i = 0; i<size; i++){

        for (int j = 0; j<size -1 ; j++)
        {
            if (data[j] > data[j+1])
            {
                int temp = data[j];
                data[j] = data[j+1];
                data[j+1] = temp;
            }
        }

    }

    for (int i = 0; i<size; i++)
    {
        cout << data[i] << " ";
    }


return 0;}