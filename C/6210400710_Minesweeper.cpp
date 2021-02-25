#include <iostream>
using namespace std;

void printArr(int arr[], int q){
    for(int i = 0; i < q; i++){
        if(arr[i] == -1){
            cout << "Bomb" << endl;
        }else{
            cout << arr[i] << endl;
        }
    }
}

int **create_map(int w, int h){
    int **map = new int* [w];
    for(int i = 0; i < w; i++){
        map[i] = new int[h]();
    }

    return map;
}

bool check_out_of_dimension(int y, int x, int w, int h){
    return (y >= 0) && (x >= 0) && (y < w) && (x < h);
}

int boom(int **arr, int y, int x){
    return arr[y][x];
}

int count_bomb(int **arr, int w, int h, int y, int x){
    int count = 0;
    //north
    if(check_out_of_dimension(y - 1, x, w, h)){
        if(arr[y - 1][x] == 1){
            count++;
        }
    }
    //south
    if(check_out_of_dimension(y + 1, x, w, h)){
        if(arr[y + 1][x] == 1){
            count++;
        }
    }
    //east
    if(check_out_of_dimension(y, x + 1, w, h)){
        if(arr[y][x + 1] == 1){
            count++;
        }
    }
    //west
    if(check_out_of_dimension(y, x - 1, w, h)){
        if(arr[y][x - 1] == 1){
            count++;
        }
    }
    //north-west
    if(check_out_of_dimension(y - 1, x - 1, w, h)){
        if(arr[y - 1][x - 1] == 1){
            count++;
        }
    }
  
    //south-west
    if(check_out_of_dimension(y + 1, x - 1, w, h)){
        if(arr[y + 1][x - 1] == 1){
            count++;
        }
    }
    //south-east
    if(check_out_of_dimension(y + 1, x + 1, w, h)){
        if(arr[y + 1][x + 1] == 1){
            count++;
        }
    }
    //north-east
    if(check_out_of_dimension(y - 1, x + 1, w, h)){
        if(arr[y - 1][x + 1] == 1){
            count++;
        }
    }

    return count;
}

int main(){
    int w, h, n, q, r, c, y, x;
    bool bomb_activator = false;
    cin >> w >> h >> n >> q;
    int **arr = create_map(w, h);
    int bomb_hint[q];
    
    for(int i = 0; i < n; i++){
        cin >> r >> c;
        arr[r][c] = 1;
    }

    for(int i = 0; i < q; i++){
        cin >> y >> x;
        if(boom(arr, y, x)){
            bomb_hint[i] = -1;
        }else{
            bomb_hint[i] = count_bomb(arr, w, h, y, x);
        }
    }
    
    printArr(bomb_hint, q);
}