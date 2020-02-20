#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
	int n; cin >> n;
	vector<int> v, vAwal;
	while(n--){
		int tmp; cin >> tmp;
		v.push_back(tmp);
		vAwal.push_back(tmp);
	}

	sort(v.begin, v.end);
	if(v.size() == 0){
		cout << "-\n-\n-\n-\n";
	} else {
		int sum = 0;
		int modus = 0;
		int cntModus = 0;
		for(int j: v){
			sum += j;
			int cnt = count(v.begin, v.end, j);
			if(cnt > cntModus){
				cntModus = cnt;
				modus = j;
			}
		}
		cout << (float)sum/v.size() << endl;
		cout << v[v.size()/2] << endl;
		cout << modus << endl;
		for(int j: vAwal){
			cout << j << " ";
		}
		while(cntModus--){
			cout << modus;
			if(cntModus-1){
				cout << " ";
			} else {
				cout << endl;
			}
		}
	}
	cout << v.size() << endl; 

}