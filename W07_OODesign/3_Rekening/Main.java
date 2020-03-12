class Main{
	public static void main(String[] args) {
		RekeningTabungan r = new RekeningTabungan("joo", 100);
		r.update();
		System.out.println(r.saldo);
	}
}