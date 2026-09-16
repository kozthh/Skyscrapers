//
// Created by kenne on 9/11/2026.
//
#include<iostream>
using namespace std;

int main()
{
    int arr[] = {10, 20, 30 , 40, 50, 60, 70, 80, 90, 100};
    int size = sizeof(arr)/sizeof(arr[0]);

    int high = size - 1;
    int low = 0;
    int key;
    int result = -1;

    cout << " find a number: ";
    cin >> key;

    while (low <= high)
    {
        int mid = (low + high) / 2;

        if (key == arr[mid])
        {
            result = mid;
            break;
        }
        else if (arr[mid] > key)
        {
            high = mid - 1;
        } else
        {
            low = mid + 1;
        }
    }
    if (result != -1)
    {
        cout<<"number was found on index: "<< result;
    }else
    {
        cout << "number not found" << endl;
    }

return 0;}