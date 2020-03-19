class Goose{
	private String name;
	private int honk;
	Goose(){
		this("Horrible", 1);
	}
	Goose(String name, int honk){
		this.name = name;
		this.honk = honk;
	}
	public void steal(String thing){
		System.out.println(this.name + " steals " + thing);
	}
	public String toString(){
		String s = this.name + " goose says";
		for(int i = 0; i < this.honk; i++){
			s += " honk";
		}
		return s;
	}
}