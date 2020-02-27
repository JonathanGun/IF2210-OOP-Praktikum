// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 27 Februari 2020
// Materi : Generic and Template

#ifndef __BASE_EXCEPTION_HPP__
#define __BASE_EXCEPTION_HPP__

#include <iostream>
using namespace std;

class BaseException {
public:
    // menuliskan pesan kesalahan ke stdout
    virtual void printMessage() = 0;
};

class InvalidNumberException : public BaseException {
private:
    int number;
public:
    InvalidNumberException(int number) {
        this->number = number;
    }
    void printMessage() {
        cout << "Bilangan " << number << " tidak valid" << endl;
    }
};

#endif
