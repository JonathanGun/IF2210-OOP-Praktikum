#include <iostream>
#include <vector>
#include <algorithm>
#include <vector>
using namespace std;

int main(){
	int n; cin >> n;
	vector<int> v, vAwal;
	int i = n;
	while(i--){
		int tmp; cin >> tmp;
		v.push_back(tmp);
		vAwal.push_back(tmp);
	}

	int cntModus = 0;
	sort(v.begin(), v.end());
	if(v.size() == 0){
		cout << "-\n-\n-\n-\n";
	} else {
		int t;
		int sum = 0;
		int modus = 0;
		i = n;
		while(i--){
			int j = v[i];
			sum += j;
			int cnt = count(v.begin(), v.end(), j);
			if(cnt >= cntModus){
				cntModus = cnt;
				modus = j;
			}
		}
		cout << (float)sum/v.size() << endl;
		
		if(v.size()%2){
			cout << v[v.size()/2] << endl;	
		} else {
			cout << (v[v.size()/2]+v[v.size()/2-1])/2.0 << endl;
		}
		
		cout << modus << endl;
		i = 0;
		while(i<vAwal.size()){
			cout << vAwal[i++] << " ";
		}

		int tt = cntModus;
		while(tt--){
			cout << modus;
			if(tt){
				cout << " ";
			} else {
				cout << endl;
			}
		}
	}
	cout << v.size()+cntModus << endl; 

}