#include "Polinom.hpp"

Polinom::Polinom(){
	this->derajat = 0;
	this->koef[0] = 0;
}

Polinom::Polinom(int n){
	this->derajat = n;
	for(int i = 0; i < n; ++i){
		this->koef[i] = 0;
	}
}

Polinom::Polinom(const Polinom& other){
	this->derajat = other.derajat;
	for(int i = 0; i < this->derajat; ++i){
		this->koef[i] = other.koef[i];
	}
}

Polinom::~Polinom(){
	delete &this->derajat;
	delete &this->koef;
}

Polinom& Polinom::operator=(const Polinom& other){
	this->derajat = other.derajat;
	for(int i = 0; i < this->derajat; ++i){
		this->koef[i] = other.koef[i];
	}
}

int Polinom::getKoefAt(int idx) const{

}
int Polinom::getDerajat() const{

}
void Polinom::setKoefAt(int idx, int val){

}
void Polinom::setDerajat(int){

}

Polinom operator+(const Polinom& p1, const Polinom& p2){

} // Penjumlahan 2 buah Polinom.
Polinom operator-(const Polinom& p1, const Polinom& p2){

} // Pengurangan 2 buah Polinom.
Polinom operator*(const Polinom& p, const int k){

} // Perkalian Polinom dengan konstanta
Polinom operator*(const int k, const Polinom& p){

} // Perkalian Polinom dengan konstanta (sifat komutatif)
Polinom operator/(const Polinom& p, const int k){

} // Pembagian bilangan bulat. Tidak perlu menangani apabila kasus pembagi = 0.

void Polinom::input(){

}

// Mencetak seluruh koefisien polinom. Untuk setiap koefisien akhiri dengan end-of-line
// Cetaklah apa adanya dari koefisien ke-0 hingga derajat tertinggi (termasuk apabila koefisien = 0)
void Polinom::printKoef(){

}

// Menghitung hasil substitusi x dengan sebuah bilangan ke dalam polinom
int Polinom::substitute(int x){

}

// Melakukan aksi derivasi terhadap Polinom.
// Lakukan pengurangan pada derajat tertinggi Polinom. 
// Apabila derajat tertinggi = 0, hasil derivasi = 0 (dengan derajat tertinggi = 0)
Polinom Polinom::derive(){

}

// ** METHOD BONUS (TC 12,13,14) ** (Tidak wajib dikerjakan)
// Mencetak polinom dengan format: A+Bx^1+Cx^2+Dx^3...dst (diakhiri dengan end-of-line)
// Apabila suatu koefisien bernilai < 0, gunakan tanda "-" untuk menggantikan tanda "+"
// Apabila suatu koefisien bernilai 0, lewati koefisien tersebut dan lanjutkan ke koefisien selanjutnya
// Jika seluruh koefisien bernilai 0, keluarkan "0"
void Polinom::print(){

}