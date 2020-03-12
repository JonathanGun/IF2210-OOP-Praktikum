abstract class Rekening{
	protected String nama;
	protected double saldo;
	protected double sukuBunga;

	public Rekening(String nama, double saldo, double sukuBunga){
		this.nama = nama;
		this.saldo = Math.max(0, saldo);
		this.sukuBunga = sukuBunga;
	}

	public abstract void setor(double saldo);
	public abstract void tarik(double saldo);
	public abstract void update();

	public double hitungBiaya(){
		return Math.max(10, 0.1*this.saldo);
	}

	public String getNama(){
		return this.nama;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public double getSukuBunga(){
		return this.sukuBunga;
	}
}