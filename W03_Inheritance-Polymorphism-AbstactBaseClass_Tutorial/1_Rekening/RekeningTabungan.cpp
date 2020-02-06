// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 6 Februari 2020
// Materi : Inheritance

#define fori(i,n)    for(int i = 0; i < n; i++)
#define forii(i,s,e) for(int i = s; i < e; i++)
#define max(a,b)	 a>b?a:b
#define min(a,b)	 a<b?a:b

#include "RekeningTabungan.h"

// Konstruktor menginisialisi saldo (parameter 1) dan biaya transaksi (parameter 2)
// Set biaya transaksi 0.0 apabila biaya transaksi bernilai negatif
RekeningTabungan::RekeningTabungan(double saldo, double biayaTransaksi) : Rekening(saldo), biayaTransaksi(biayaTransaksi) {};

// Getter, Setter
void RekeningTabungan::setBiayaTransaksi(double biayaTransaksi){
	this->biayaTransaksi=biayaTransaksi;
}

double RekeningTabungan::getBiayaTransaksi() const {
	return this->biayaTransaksi;
}

// Member Function
// Panggil fungsi simpanUang dari parent class
// Kurangkan saldo dengan biaya transaksi
void RekeningTabungan::simpanUang(double transaksi){
	Rekening::simpanUang(transaksi);
	this->tarikUang(biayaTransaksi);
}

// Panggil fungsi tarikUang dari parent class
// Kurangkan saldo dengan biaya transaksi hanya jika penarikan uang berhasil
// Saldo mungkin saja menjadi negatif apabila setelah penarikan, saldo < biaya transaksi
// Kembalikan boolean yang mengindikasikan apakah uang berhasil ditarik atau tidak
bool RekeningTabungan::tarikUang(double transaksi){
	return Rekening::tarikUang(transaksi);
}

