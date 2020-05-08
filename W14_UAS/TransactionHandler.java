import java.lang.reflect.*;

class TransactionHandler{
	Product product;
	Buyer buyer;
	Courier courier;
	public TransactionHandler(Buyer buyer, Product product, Courier courier){
		this.buyer = buyer;
		this.product = product;
		this.courier = courier;
	}

	public void execute() throws TransactionFailedException{
		try{
			this.product.decrementStock();
		} catch (ProductOutOfStockException e){
			throw new TransactionFailedException("Transaksi gagal");
		}

		try{
			this.buyer.substractSaldo(this.product.getPrice() + this.courier.checkPrice(this.product.getPosition(), this.buyer.getPosition()));
		} catch (NotEnoughMoneyException e){
			System.out.println(e.getMessage());
			try{
				Field stock = this.product.getClass().getDeclaredField("stock");
				stock.setAccessible(true);
				stock.setInt(this.product, stock.getInt(this.product)+1);
			} catch (Exception e2){

			}
			return;
		}
		this.courier.addToQueue(this.product, this.buyer, this.product);
	}
}