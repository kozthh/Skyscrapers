//
// Created by kenne on 9/8/2026.
//
#include<iostream>
using namespace std;

int sum(int num);
int linus(int m);

void sort(int num[], int length);
int main()
{

    cout << sum(23) << endl;
    cout << linus(1) << endl;

return 0;}

int sum(int num)
{
    if (num != 0)
        return (num + sum(num - 1));
    else
        return num;
}

int linus(int m)
{
    if (m < 100)
        return linus(m+1);
    else
        return m;

}
