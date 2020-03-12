class AddExpression implements Expression {
  protected Expression x, y;
  public AddExpression(Expression x, Expression y){
    this.x = x;
    this.y = y;
  }

  public int solve(){
    return this.x.solve() + this.y.solve();
  }
}
