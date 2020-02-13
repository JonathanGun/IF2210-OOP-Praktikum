#ifndef _C_HPP_
#define _C_HPP_
#include "B.hpp"
#include "A.hpp"

class C : public B, public A {
public:
    C();
    void sing();
};

#endif
