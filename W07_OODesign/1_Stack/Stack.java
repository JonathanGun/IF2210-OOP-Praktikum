class Stack{
	private int size;
	private int i;
	private int[] elem;

	public Stack(int size){
		this.size = size;
		this.elem = new int[size];
		this.i = 0;
	}
	public Stack(){
		this(10);
	}

	public void push(int x){
		if(this.i < this.size) this.elem[this.i++] = x;
	}

	public void push(int[] xarr){
		for(int x: xarr) this.push(x);
	}

	public int pop(){
		if(this.i == 0) return 0;
		return this.elem[--this.i];
	}
}