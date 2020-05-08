import java.util.Queue;
import java.util.LinkedList;

class Courier implements HasPosition{
	int multiplier;
	Position address;
	Queue<DeliveryDetail> sendQueue;

	class DeliveryDetail{
		HasPosition asal;
		HasPosition tujuan;
		Product product;

		public DeliveryDetail(HasPosition asal, HasPosition tujuan, Product product){
			this.asal = asal;
			this.tujuan = tujuan;
			this.product = product;
		}
	}

	public Courier(int multiplier, Position pos){
		this.multiplier = multiplier;
		this.address = pos;
		this.sendQueue = new LinkedList<>();
	}

	public void addToQueue(HasPosition asal, HasPosition tujuan, Product product){
		this.sendQueue.add(new DeliveryDetail(asal, tujuan, product));
	}

	public void send(){
		DeliveryDetail item = this.sendQueue.poll();
		if(item != null){
			System.out.println("AvatarDuel " + String.valueOf(item.product.getPrice()) + " berhasil dikirim");
		}
	}

	public int checkPrice(Position asal, Position tujuan){
		return this.multiplier * (this.address.distanceTo(asal) + asal.distanceTo(tujuan) + tujuan.distanceTo(this.address));
	}

	public Position getPosition(){
		return this.address;
	}

    public void setPosition(Position p){
    	this.address = p;
    }
}