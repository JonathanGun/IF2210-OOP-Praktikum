abstract class Account implements HasPosition{
	String name;
	Position address;
	public Account(String name, Position address){
		this.name = name;
		this.address = address;
	}

	public Position getPosition(){
		return this.address;
	}

    public void setPosition(Position p){
    	this.address = p;
    }
}