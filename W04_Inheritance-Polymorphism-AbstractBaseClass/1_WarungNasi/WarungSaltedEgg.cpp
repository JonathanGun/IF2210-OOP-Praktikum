// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 13 Februari 2020
// Materi : Inheritance

#define fori(i,n)    for(int i = 0; i < n; i++)
#define forii(i,s,e) for(int i = s; i < e; i++)
#define max(a,b)	 a>b?a:b
#define min(a,b)	 a<b?a:b

#include "WarungSaltedEgg.hpp"
#include <iostream>

WarungSaltedEgg::WarungSaltedEgg(int uang, int telur, int nasi, int telurAsin, int ayam) : WarungNasi(uang, telur, nasi) {
    this->telurAsin = telurAsin;
    this->ayam = ayam;
}

bool WarungSaltedEgg::masak(int pesanan){
	if (this->getNasi() < pesanan && this->getTelur() < pesanan && this->telurAsin < 3*pesanan && this->ayam < pesanan) {
        return false;
    } else {
        int pendapatan = pesanan * 30000;
        setUang(getUang() + pendapatan);
        return true;
    }
}