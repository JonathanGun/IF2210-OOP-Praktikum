#include "Complex.h"

Complex::Complex(){
	this->real = 0;
	this->imaginer = 0;
}

Complex::Complex(int re, int im){
	this->real = re;
	this->imaginer = im;
}

Complex::Complex(const Complex &comp){
	this->real = comp.real;
	this->imaginer = comp.imaginer;
}

Complex::~Complex(){
	this->real = 0;
	this->imaginer = 0;
}

int Complex::getReal(){
	return this->real;
}

int Complex::getImaginer(){
	return this->imaginer;
}

void Complex::setReal(int re){
	this->real = re;
}

void Complex::setImaginer(int im){
	this->imaginer=im;
}

Complex Complex::operator + (Complex const &comp){
	Complex c;
	c->real += comp.real;
	c->imaginer += comp.imaginer;
	return c;
}

Complex Complex::operator - (Complex const &comp){
	Complex c;
	c->real -= comp.real;
	c->imaginer -= comp.imaginer;
	return c;
}

Complex Complex::operator * (Complex const &comp){
	int a,b,c,d;
	a = this->real;
	b = this->imaginer;
	c = comp.real;
	d = comp.imaginer;
	this->real = a*b-c*d;
	this->imaginer = a*d+b*c;
}
