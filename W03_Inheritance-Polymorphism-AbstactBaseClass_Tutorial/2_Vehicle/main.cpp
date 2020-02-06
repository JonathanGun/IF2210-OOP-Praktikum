// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 6 Februari 2020
// Materi : Inheritance

#define fori(i,n)    for(int i = 0; i < n; i++)
#define forii(i,s,e) for(int i = s; i < e; i++)
#define max(a,b)	 a>b?a:b
#define min(a,b)	 a<b?a:b

#include "Bike.h"
#include "Car.h"


int main(){
	Vehicle v32(3, 2);
	Vehicle vcc1 = v32;
	Vehicle v650(6, 50);
	Car c48(8);
	Car ccc1 = c48;
	Car c46(6);
	Bike b22;
	c46.drive();
	b22.show();
	b22.ride();
}