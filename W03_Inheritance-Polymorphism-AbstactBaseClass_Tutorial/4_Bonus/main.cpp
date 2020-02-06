// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 6 Februari 2020
// Materi : Inheritance

#include "A.hpp"
#include "B.hpp"

void x(A* a){
	a->setValue(888);
}

int main() {
  B b; /** ANDA HARUS MENGGUNAKAN DEFAULT CONSTRUCTOR */
  
  x(&b);
  b.setValue(10888);
  
  b.print(); // OUTPUT: (888, 10888)
  return 0;
}