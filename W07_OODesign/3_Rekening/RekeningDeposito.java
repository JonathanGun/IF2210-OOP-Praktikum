class RekeningDeposito extends Rekening{
	private int bulan;
	public RekeningDeposito(String nama, double saldo){
		super(nama, saldo, 0.15);
		this.bulan = 0;
	}

	public void setor(double saldo){
		System.out.println("Tidak dapat melakukan penyetoran uang untuk rekening ini.");
	}

	public void tarik(double saldo){
		System.out.println("Tidak dapat melakukan penarikan uang sebagian untuk rekening ini.");
	}

	public void tarik(){
		if(this.bulan < 12){
			System.out.print("Anda terkena penalti sebesar ");
			System.out.print(0.2 * this.saldo);
			System.out.println(".");
		}
		this.saldo = 0;
	}

	public void update(){
		this.bulan++;
		if(this.bulan > 12){
			this.saldo += this.sukuBunga * this.saldo - this.hitungBiaya();
		} else {
			this.saldo -= this.hitungBiaya();
		}
	}
}