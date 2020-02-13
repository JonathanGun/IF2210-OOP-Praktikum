// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 13 Februari 2020
// Materi : Inheritance

#define fori(i,n)    for(int i = 0; i < n; i++)
#define forii(i,s,e) for(int i = s; i < e; i++)
#define max(a,b)	 a>b?a:b
#define min(a,b)	 a<b?a:b

#include "WarungNasgor.hpp"
#include <iostream>

WarungNasgor::WarungNasgor(int uang, int telur, int nasi, int kecap) : WarungNasi(uang, telur, nasi) {
    this->kecap = kecap;
}

bool WarungNasgor::masak(int pesanan){
	if (this->getNasi() < pesanan && this->getTelur() < pesanan && this->kecap < pesanan) {
        return false;
    } else {
        int pendapatan = pesanan * 15000;
        setUang(getUang() + pendapatan);
        return true;
    }
}