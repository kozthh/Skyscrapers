//
// Created by kenne on 9/8/2026.
//
#include<iostream>
#include<algorithm>

using namespace std;

void MergeSort(int arr[], int L, int R);
void merge(int* arr, int i, int m, int r);
int main()
{
    int arr[] = {32,45,76,47,26,18,7,37,26,1,5,3,78};
    int L = 0;
    int R = sizeof(arr)/sizeof(arr[0]) - 1;

    MergeSort(arr, L, R);

    for (int i = 0; i <= R; ++i)
        cout << arr[i] << " ";
    cout << endl;

return 0;}

void merge(int arr [], int L, int M, int R)
{
    int i = L;
    int j = M+1;
    int k = L;

    int size = R - L + 1;
    int* temp = new int[size];

    while (i <= M && j <= R)
    {
        if (arr[i] <= arr[j])
            temp[k-L] = arr[i++];
        else
            temp[k-L] = arr[j++];
        k++;
    }

    while (i <= M)
        temp[k-L] = arr[i++], k++;
    while (j <= R)
        temp[k-L] = arr[j++], k++;

    for (i = L; i <= R; i++)
        arr[i] = temp[i-L];

    delete[] temp;
}

void MergeSort(int arr[] ,int L, int R)
{
    int M;

    if (L<R)
    {
        M = (L+R)/2;

        MergeSort(arr, L,  M);
        MergeSort(arr, M+1, R);
        merge(arr, L, M, R);
    }
}