class Buyer extends Account {
	int balance;
	public Buyer(String name, Position address, int balance){
		super(name, address);
		this.balance = balance;
	}

	public void substractSaldo(int amount) throws NotEnoughMoneyException{
		this.balance -= amount;
		if(this.balance < 0){
			this.balance += amount;
			throw new NotEnoughMoneyException("Membutuhkan uang " + String.valueOf(amount) + " sedangkan saldo hanya " + String.valueOf(this.balance));
		}
	}
}