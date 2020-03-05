#include <iostream>
#include "Polinom.hpp"
using namespace std;

// #define abs(a) a>0?a:-a

Polinom::Polinom() : Polinom(0){}

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

Polinom::~Polinom(){}

Polinom& Polinom::operator=(const Polinom& other){
	this->derajat = other.derajat;
	for(int i = 0; i <= this->derajat; ++i){
		this->koef[i] = other.koef[i];
	}
	return *this;
}

int Polinom::getKoefAt(int idx) const{
	return this->koef[idx];
}

int Polinom::getDerajat() const{
	return this->derajat;
}

void Polinom::setKoefAt(int idx, int val){
	this->koef[idx] = val;
}

void Polinom::setDerajat(int drjt){
	this->derajat = drjt;
}

Polinom operator+(const Polinom& p1, const Polinom& p2){
	Polinom p(max(p1.derajat, p2.derajat));
	for(int i = 0; i <= min(p1.getDerajat(), p2.getDerajat()); ++i){
		p.koef[i] = p1.koef[i] + p2.koef[i];
	}
	if (p1.derajat > p2.derajat) {
      for(int i = p2.derajat + 1; i <= p1.derajat; i++){
        p.koef[i] = p1.koef[i];
      }
    } else if (p1.derajat < p2.derajat) {
      for(int i = p1.derajat + 1; i <= p2.derajat; i++){
        p.koef[i] = p2.koef[i];
      }
    }
	return p;
} // Penjumlahan 2 buah Polinom.

Polinom operator-(const Polinom& p1, const Polinom& p2){
	Polinom p = p2;
	for(int i = 0; i <= p2.derajat; ++i){
		p.koef[i] *= -1;
	}
	p = p1 + p;
	return p;
} // Pengurangan 2 buah Polinom.

Polinom operator*(const Polinom& p1, const int k){
	Polinom p = p1;
	int i = p1.getDerajat();
	while(i--){
		p.setKoefAt(i, p.getKoefAt(i) * k);
	}
	return p;
} // Perkalian Polinom dengan konstanta

Polinom operator*(const int k, const Polinom& p){
	return p*k;
} // Perkalian Polinom dengan konstanta (sifat komutatif)

Polinom operator/(const Polinom& p1, const int k){
	Polinom p = p1;
	int i = p1.getDerajat();
	while(i--){
		p.setKoefAt(i, p.getKoefAt(i) / p1.getKoefAt(i));
	}
	return p;
} // Pembagian bilangan bulat. Tidak perlu menangani apabila kasus pembagi = 0.

void Polinom::input(){
	for(int i = 0; i <= this->derajat; ++i) cin >> this->koef[i];
}

// Mencetak seluruh koefisien polinom. Untuk setiap koefisien akhiri dengan end-of-line
// Cetaklah apa adanya dari koefisien ke-0 hingga derajat tertinggi (termasuk apabila koefisien = 0)
void Polinom::printKoef(){
	for(int i = 0; i <= this->derajat; ++i) cout << this->koef[i] << endl;
}

// Menghitung hasil substitusi x dengan sebuah bilangan ke dalam polinom
int Polinom::substitute(int x){
	int ans = 0;
	for(int i = 0; i <= this->derajat; ++i){
		int tmp = 1;
		for(int j = 0; j < i; j++){
			tmp *= x;
		}
		ans += tmp*this->koef[i];
	}
	return ans;
}

// Melakukan aksi derivasi terhadap Polinom.
// Lakukan pengurangan pada derajat tertinggi Polinom. 
// Apabila derajat tertinggi = 0, hasil derivasi = 0 (dengan derajat tertinggi = 0)
Polinom Polinom::derive(){
	Polinom p = *this;
	p.derajat--;
	for(int i = 1; i <= p.derajat+1; ++i){
		p.koef[i-1] = p.koef[i] * i;
	}
	return p;
}

// ** METHOD BONUS (TC 12,13,14) ** (Tidak wajib dikerjakan)
// Mencetak polinom dengan format: A+Bx^1+Cx^2+Dx^3...dst (diakhiri dengan end-of-line)
// Apabila suatu koefisien bernilai < 0, gunakan tanda "-" untuk menggantikan tanda "+"
// Apabila suatu koefisien bernilai 0, lewati koefisien tersebut dan lanjutkan ke koefisien selanjutnya
// Jika seluruh koefisien bernilai 0, keluarkan "0"
void printElmt(int i, bool printed, const Polinom& P) {
  // Prekondisi: P.getKoefAt(i) != 0
  // Sign
  if (P.getKoefAt(i) > 0 && printed)
    cout << "+";
  if (P.getKoefAt(i) < 0)
    cout << "-";
  // Coefficient and variable
  if (i == 0) {
    cout << abs(P.getKoefAt(i));
  } else { // i > 0
    if (abs(P.getKoefAt(i)) != 1)
      cout << abs(P.getKoefAt(i));
    cout << "x^" << i;
  }
}

void Polinom::print() {
  bool printed = false;
  for (int i = 0; i <= getDerajat(); i++) {
    if (getKoefAt(i) != 0) {
      printElmt(i, printed, *this);
      printed = true;
    }
  }
  if (!printed) cout << "0";
  cout << endl;
}