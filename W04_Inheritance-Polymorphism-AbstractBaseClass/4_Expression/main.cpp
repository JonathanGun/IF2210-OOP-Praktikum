#include "Expression.hpp"
#include "AddExpression.hpp"
#include "SubstractExpression.hpp"
#include "NegativeExpression.hpp"
#include <iostream>
using namespace std;

int main(){
	Expression* e;
	e = new NegativeExpression(
	  new TerminalExpression(1)
	);
	cout << e->solve() << endl;
}