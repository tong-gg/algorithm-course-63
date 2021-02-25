#include <iostream>
using namespace std;

int main(){
    unsigned long long int input, next;
    unsigned long long int n1 = 0, n2 = 1;
    cin >> input;
    cout << n1 << endl;

    for(int i = 0; i < input - 1; i++){
        next = n1 + n2;
        cout << next << endl;
        n2 = n1;
        n1 = next;
    }
}