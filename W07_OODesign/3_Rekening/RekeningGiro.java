class RekeningGiro extends Rekening{
	private boolean isPenatied;
	public RekeningGiro(String nama, double saldo){
		super(nama, saldo, 0.07);
		this.isPenatied = this.penalti();
	}

	public void setor(double saldo){
		this.saldo += saldo - 0.1;
	}

	public void tarik(double saldo){
		this.saldo -= saldo + 0.1;
		if(this.saldo < 0){
			this.saldo += saldo + 0.1;
		} else {
			this.isPenatied |= this.penalti();
		}
	}

	public void update(){
		if(this.isPenatied){
			this.saldo -= 10;
		}
		this.saldo += this.sukuBunga * this.saldo - this.hitungBiaya();
		this.saldo = Math.max(0, this.saldo);
	}

	public boolean penalti(){
		return this.saldo < 500;
	}
}