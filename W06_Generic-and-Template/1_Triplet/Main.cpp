#include "Triplet.hpp"
#include <iostream>
using namespace std;

int main(){
	Triplet<int, int, int> tr1(1,2,3);
	cout << tr1.getFirst();
	cout << tr1.getSecond();
	cout << tr1.getThird();

	Triplet<int, int, int> tr2 = tr1;
	cout << tr2.getFirst();
	cout << tr2.getSecond();
	cout << tr2.getThird();

	return 0;
}