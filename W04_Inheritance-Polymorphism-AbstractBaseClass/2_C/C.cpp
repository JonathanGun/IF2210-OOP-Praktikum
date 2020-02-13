#include "C.hpp"

C::C(){
}

void C::sing(){
	B::sing();
	A::sing();
}

// int main(){
// 	C c;
// 	c.sing();
// }