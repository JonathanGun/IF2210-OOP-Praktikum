class Main{
	public static void main(String[] args) {
	  Goose g = new Goose();
	  Goose h = new Goose("Matilda", 3);
	  System.out.println(g);
	  System.out.println(h);
	  g.steal("shoes");
	}
}