class Product implements HasPosition {
	int price;
	int stock;
	Position position;
	public Product(int price, int stock, Position position){
		this.price = price;
		this.stock = stock;
		this.position = position;
	}

	public void decrementStock() throws ProductOutOfStockException{
		if(this.stock <= 0){
			throw new ProductOutOfStockException("Produk ini kosong");
		}
		this.stock--;
	}

	public int getPrice(){
		return this.price;
	}

	public Position getPosition(){
		return this.position;
	}

    public void setPosition(Position p){
    	this.position = p;
    }
}