class Programmer extends Employee{
	public int calculateSalary(int workHour){
		int ans = 0;
		if(this.hasMarried){
			ans += 4000000;
		}
		if(workHour <= 150){
			ans += workHour*100000;
		} else {
			ans += 150*100000 + (workHour-150)*10000;
		}
		return ans;
	}
}