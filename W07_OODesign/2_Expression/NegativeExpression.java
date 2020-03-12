class NegativeExpression implements Expression {
	protected Expression x;
	public NegativeExpression(Expression x){
		this.x = x;
	}

	public int solve(){
		return -1 * this.x.solve();
	}
}
