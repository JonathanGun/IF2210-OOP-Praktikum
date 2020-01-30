// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 30 Januari 2020
// Materi : Operator Overloading

// Loop
#define fori(i,n)    for(int i = 0; i < n; i++)
#define forii(i,s,e) for(int i = s; i < e; i++)

#include "Bottle.hpp"
using namespace std;

float clamp(float val, float a, float b){
  if(val < a){
    return a;
  } else if (val > b){
    return b;
  } else {
    return val;
  }
}

Bottle::Bottle() : id(Bottle::numOfBottle+1){
  this->height=10.00;
  this->radius=10.00;
  Bottle::numOfBottle++;
  this->waterHeight=0;
}
/* Ctor default Bottle kosong dengan tinggi = 10.00 dan radius = 10.00 */
Bottle::Bottle(float height, float radius) : id(Bottle::numOfBottle+1){
  this->height=height;
  this->radius=radius;
  Bottle::numOfBottle++;
  this->waterHeight=0;
}
/* Ctor Bottle jika diketahui nilai tinggi dan radius, Bottle kosong*/
Bottle::Bottle(const Bottle& bottle) : id(bottle.id){
  this->height=bottle.height;
  this->radius=bottle.radius;
  this->waterHeight=bottle.waterHeight;
}
/* Cctor Bottle. id juga dicopy dan numOfBottle tidak bertambah */
Bottle::~Bottle(){

}
/* Destruktor Bottle */

int Bottle::getId() const{
  return this->id;
}
/* Mengembalikan id Bottle */
float Bottle::getWaterVolume() const{
  return PI*this->radius*this->radius*this->waterHeight;
}
/* Mengembalikan volume air dalam botol */
float Bottle::getBottleVolume() const{
  return PI*this->radius*this->radius*this->height;
}
/* Mengembalikan volume botol */

void Bottle::setHeight(float height){
  this->height = height;
  this->waterHeight=clamp(this->waterHeight, 0.0, this->height);
}
/*
 * Mengubah tinggi Bottle. Jika tinggi baru kurang dari tinggi air,
 * maka tinggi air = tinggi yang baru.
 */

void Bottle::addWater(float waterVolume){
  this->waterHeight = clamp(this->waterHeight+this->getWaterHeightIfVolume(waterVolume), 0.0, this->height);
}
/*
 * Menambahkan air ke dalam botol. Jika botol tidak muat, biarkan
 * botol penuh.
 */

void Bottle::substractWater(float waterVolume){
  this->addWater(-waterVolume);
}
/*
 * Mengurangi air dari botol. Jika air yang tersedia kurang, biarkan
 * botol kosong.
 */

float Bottle::getWaterHeightIfVolume(float waterVolume) const{
  return waterVolume/PI/this->radius/this->radius;
}
/*
 * Mengembalikan tinggi air dari botol jika diketahui suatu volume air.
 * Tinggi botol diabaikan, dianggap tidak akan terlalu penuh.
 */

void Bottle::pourWaterTo(Bottle& other){
  float tuang = clamp(this->getWaterVolume(), 0.0, other.getBottleVolume()-other.getWaterVolume());
  this->substractWater(tuang);
  other.addWater(tuang);
}
/*
 * Menuang isi botol ini ke botol lain sampai botol ini kosong.
 * Jika botol lain penuh sebelum semua air pindah, maka penuangan
 * berhenti dan terdapat sisa air di botol ini.
 */

int Bottle::numOfBottle = 0;
