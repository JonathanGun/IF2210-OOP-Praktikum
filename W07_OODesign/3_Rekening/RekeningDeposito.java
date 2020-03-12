class RekeningGiro extends Rekening{
	private int bulan;
	public RekeningGiro(String nama, double saldo){
		super(nama, saldo, 0.15);
	}

	public void setor(double saldo){
		System.out.println("Tidak dapat melakukan penyetoran uang untuk rekening ini.");
	}

	public void tarik(double saldo){
		if(saldo == this.saldo){
			if(this.bulan < 12){
				System.out.print("Anda terkena penalti sebesar ");
				System.out.print(0.2*this.saldo);
				System.out.println(".");
			}
		} else {
			System.out.println("Tidak dapat melakukan penarikan uang sebagian untuk rekening ini.");
		}
	}

	public void update(){
		this.bulan++;
		if(this.bulan % 12 == 0){
			this.saldo *= 1 + this.sukuBunga;
			this.saldo -= this.hitungBiaya();
		}
	}
}