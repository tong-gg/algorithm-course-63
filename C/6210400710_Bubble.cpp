#include <iostream>
using namespace std;

void printArray(int arr[], int size){
    for(int i = 0; i < size - 1; i++){
        cout << arr[i] << ", ";
    }
    cout << arr[size - 1] << endl;
}

void bubbleSort(int arr[], int size){
    int temp = 0;

    for(int i = 0; i <= size - 2; i++){
        for(int j = 0; j <= size - 2 - i; j++){
            if(arr[j + 1] < arr[j]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                printArray(arr, size);
            }
        }
    }
}

int main(){
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    printArray(arr, n);
    bubbleSort(arr, n);
}