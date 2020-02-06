// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 6 Februari 2020
// Materi : Inheritance

#include "A.hpp"
#include "B.hpp"

int main() {
  B b; /** ANDA HARUS MENGGUNAKAN DEFAULT CONSTRUCTOR */
  
  b.A::setValue(888);
  b.setValue(b.getValueA()+10000);
  
  b.print(); // OUTPUT: (888, 10888)
  return 0;
}