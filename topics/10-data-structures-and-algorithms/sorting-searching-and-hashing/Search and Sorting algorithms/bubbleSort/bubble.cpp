//
// Created by kenne on 9/6/2026.
//
#include <iostream>
using namespace std;

int main(){
    int arr[] = {10,12,15,74,387,17,36,12,74,26,125,75,37,27,468};
    int size = sizeof(arr)/sizeof(arr[0]);

  for(int i = 0;i < size - 1; i++)
  {

      int temp;

      for (int j = 0; j<size- 1 ; j++)
      {
          if (arr[j] > arr[j + 1])
          {
              temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
          }
      }
  }
for (int i = 0;i < size; i++)
{
    cout<< arr[i] << " ";
}

return 0;}