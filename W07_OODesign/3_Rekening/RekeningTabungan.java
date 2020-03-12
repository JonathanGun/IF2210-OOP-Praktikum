class RekeningTabungan extends Rekening{
	public RekeningTabungan(String nama, double saldo){
		super(nama, saldo, 0.05);
	}

	public void setor(double saldo){
		this.saldo += saldo;
	}

	public void tarik(double saldo){
		this.saldo -= saldo;
		if(this.saldo < 0){
			this.saldo += saldo;
		}
	}

	public void update(){
		this.saldo *= 1 + this.sukuBunga;
		this.saldo -= this.hitungBiaya();
	}
}