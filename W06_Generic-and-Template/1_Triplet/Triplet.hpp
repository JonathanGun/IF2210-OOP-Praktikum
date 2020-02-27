// Nama/NIM : Jonathan Yudi Gunawan/13518084
// Hari, Tanggal : Kamis, 27 Februari 2020
// Materi : Generic and Template

#ifndef _TRIPLET_HPP_
#define _TRIPLET_HPP_

#include <iostream>

template<class T1, class T2, class T3>
class Triplet{
private:
	T1 fi;
	T2 se;
	T3 th;
public:
	Triplet(){}
	Triplet(T1 fi, T2 se, T3 th){
		this->fi = fi;
		this->se = se;
		this->th = th;
	}

	Triplet(const Triplet& tr) {
        this->fi = tr.fi;
        this->se = tr.se;
        this->th = tr.th;
    }

	T1 getFirst(){
		return this->fi;
	}

	T2 getSecond(){
		return this->se;
	}

	T3 getThird(){
		return this->th;
	}

	void setFirst(T1 fi) {
        this->fi = fi;
    }
    void setSecond(T2 se) {
        this->se = se;
    }
    void setThird(T3 th) {
        this->th = th;
    }

    bool operator==(const Triplet& t) {
        return (this->fi == t.fi) && (this->se == t.se) && (this->th == t.th);
    }

    bool operator!=(const Triplet& t) {
        return (this->fi != t.fi) || (this->se != t.se) || (this->th != t.th);
    }
};
#endif