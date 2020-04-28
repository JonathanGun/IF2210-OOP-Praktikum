class Main{
	public static void main(String[] args) {
		RekeningGiro r = new RekeningGiro("joo", 100);
		r.update();
		System.out.println(r.saldo);
	}
}