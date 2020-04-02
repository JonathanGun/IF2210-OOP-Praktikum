public class MyPair<K, V> {
    private K key; //key member of pair
    private V value; //value member of pair

    public MyPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setVal(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getVal() {
        return value;
    }

    public boolean isEqual(MyPair other){
    	return this.nearEQ(other) == 3;
    }

    public int nearEQ(MyPair other){
    	if(this.getKey() == other.getKey()){
    		if(this.getVal() == other.getVal()){
    			return 3;
    		} else {
    			return 1;
    		}
    	} else {
    		if(this.getVal() == other.getVal()){
    			return 2;
    		} else {
    			return 0;
    		}
    	}
    }
}