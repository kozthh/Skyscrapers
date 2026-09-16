//
// Created by kenne on 9/6/2026.
//
#include<iostream>
using namespace std;

int main(){
    int data[] ={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    int size = sizeof(data)/sizeof(data[0]);

for (int i = 1; i<size ;i++)
{
    int j = i - 1;
    int key = data[i];

    while (j >= 0 && data[j] > key)
    {
        data[j + 1] = data[j];
        j--;
    }
    data[j+1] = key;

}
    for (int i = 0; i < size ; i++)
    {
        cout << data[i] << " ";
    }
return 0;}