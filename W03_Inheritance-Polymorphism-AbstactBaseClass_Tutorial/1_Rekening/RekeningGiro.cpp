// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 6 Februari 2020
// Materi : Inheritance

#define fori(i,n)    for(int i = 0; i < n; i++)
#define forii(i,s,e) for(int i = s; i < e; i++)
#define max(a,b)	 a>b?a:b
#define min(a,b)	 a<b?a:b

#include "RekeningGiro.h" // include the Account header file

// Konstruktor menginisialisi saldo (parameter 1) dan suku bunga (parameter 2)
// Set suku bunga 0.0 apabila suku bunga bernilai negatif
RekeningGiro::RekeningGiro(double saldo, double sukuBunga) : Rekening(saldo), sukuBunga(max(0.0, sukuBunga)) {}

// Getter, Setter
void RekeningGiro::setSukuBunga(double sukuBunga){
	this->sukuBunga=sukuBunga;
}
double RekeningGiro::getSukuBunga() const {
	return this->sukuBunga;
}

// Member Function
// Bunga dihitung dari saldo dikali suku bunga
double RekeningGiro::hitungBunga(){
	return this->getSaldo()*this->getSukuBunga();
}
