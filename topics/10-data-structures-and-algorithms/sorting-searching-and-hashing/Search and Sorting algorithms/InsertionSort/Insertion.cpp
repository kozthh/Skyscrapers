//
// Created by kenne on 9/6/2026.
//
#include<iostream>
using namespace std;

int main(){
    int data[] ={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    int size = sizeof(data)/sizeof(data[0]);


    for (int i = 1; i < size; i++) // first iteration
    {
        int key = data[i]; //so this one holds the number 9
        int j = i-1; // then this one hold the number index 0 so = 10

        while (j >= 0 && data[j] > key) // in this condition it says as long as index j is greater than or equal to zero good and 10 is greater than 0 good
        {
            data[j+1] = data[j]; //index 1 would be equals to 10
            j--; //decrement so j 0 would be -1 so the loop stops
        }
            data[j + 1] = key; // now 9 is not gon data j +1 from negative one would become 0 then index 0 would become 9 then again loop again
    }

    for (int i = 0; i < size; i++)
    {
        cout << data[i] << " ";
    }

return 0;}