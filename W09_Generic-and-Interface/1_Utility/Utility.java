class Utility{
	public static <T extends Number> double getMidpoint(T[] arr) {
		int n = arr.length;
		if(n%2 == 0){
			return ((arr[n/2].doubleValue() + arr[n/2-1].doubleValue())/2);
		} else {
			return arr[n/2].doubleValue();
		}
	}

	public static <T> T getMidpoint(T[] arr) {
		return arr[arr.length/2];
	}

	public static <T> T getLast(T[] arr){
		return arr[arr.length-1];
	}

	public static <T extends Number> double getAverage(T[] arr){
		double sm = 0;
		for(int i = 0; i < arr.length; i++){
			sm = sm + arr[i].doubleValue();
		}
		return sm/arr.length;
	}
}
