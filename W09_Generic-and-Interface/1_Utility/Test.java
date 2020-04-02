import java.util.*;

class Test{
	private List<Integer> list;
	private int n;

	public Test(List<Integer> list, int n){
		this.list = list;
		this.n = n;
	}

	public void reset(){
		this.list.clear();
		for(int i = 0; i < this.n; i++){
			this.list.add(0);
		}
	}

	public long get(int idx){
		this.reset();
		long t = Util.getTime();
		this.list.get(idx);
		long t2 = Util.getTime();
		return t2-t;
	}

	public long del(int idx, int x){
		this.reset();
		long t = Util.getTime();
		for(int i = 0; i < x; i++){
			this.list.remove(idx);
		}
		long t2 = Util.getTime();
		return t2-t;
	}
}