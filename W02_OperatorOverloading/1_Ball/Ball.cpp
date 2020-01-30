// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 30 Januari 2020
// Materi : Operator Overloading

// Loop
#define fori(i,n)    for(int i = 0; i < n; i++)
#define forii(i,s,e) for(int i = s; i < e; i++)

#include "Ball.hpp"
using namespace std;

Ball::Ball(){
	this->radius=1;
}

Ball::Ball(int r){
	this->radius=r;
}


Ball::Ball(const Ball& b){
	this->radius=b.radius;
}

Ball::~Ball(){
	
}

void Ball::bounce(){
	cout << "bo";
	fori(i, this->radius){
		cout << "i";
	}
	cout << "ng" << endl;
}