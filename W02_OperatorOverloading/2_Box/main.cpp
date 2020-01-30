// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 30 Januari 2020
// Materi : Operator Overloading

// Loop
#define fori(i,n)    for(int i = 0; i < n; i++)
#define forii(i,s,e) for(int i = s; i < e; i++)

#include "Box.hpp"
using namespace std;

// PROGRAM
int main(){
	Box* b1 = new Box(2);
	Box b2;
	Box b3 =  Box(1);
	b2=*b1;
	Box b4 = b3;
	(*b1).peek();
	b3.peek();
	(*b1).Box::~Box();
	// delete &b3;

	return 0;
}