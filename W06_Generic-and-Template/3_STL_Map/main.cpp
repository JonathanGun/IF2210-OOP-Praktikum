// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 27 Februari 2020
// Materi : Generic and Template

#include <iostream>
#include <map>
using namespace std;

int main() {
    map<string, int> data;
    map<string, int>::iterator it;

    int n; cin >> n;
    while(n--){
        string tmp; cin >> tmp;
        if (data.find(tmp) == data.end()) {
            data[tmp] = 1;
        } else {
            data[tmp]++;
        }
    }
    int m; cin >> m;
    while(m--){
        string tmp; cin >> tmp;
        if (data.find(tmp) != data.end()) {
            data[tmp]--;
        }
    }

    for (it = data.begin(); it != data.end(); it++) {
        if(it->second > 0){
            while(it->second--){
                cout << it->first << endl;
            }
        }
    }

    return 0;
}
