class SummonedMonster implements ISummoned{
	private Monster monster;
	private boolean isOpen;
	private boolean isAttack;

	public SummonedMonster(Monster monster, boolean isOpen, boolean isAttack){
		this.monster = monster;
		this.isOpen = isOpen;
		this.isAttack = isAttack;
	}

	// mengubah keadaan kartu dari tertutup jadi terbuka dan mengembalikan true
	// bila kartu sudah terbuka, tidak lakukan apa-apa dan kembalikan false
	public boolean flip(){
		if(this.isOpen){
			return false;
		} else {
			this.isOpen = true;
			return true;
		}
	}

	// mengubah posisi karakter dari menyerang jadi bertahan, atau sebaliknya
	public void rotate(){
		this.isAttack ^= true;
	}

	// bila dalam posisi menyerang, mengembalikan attack.
	// bila dalam posisi bertahan, mengembalikan defense
	public int getPositionValue(){
		if(this.isAttack){
			return this.monster.getAttackValue();
		} else {
			return this.monster.getDefenseValue();
		}
	}

	// menggambar kartu ke layar
	public void render(){
		System.out.println(this);
	}

	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Monster ").append(this.monster.getName());
		str.append(" dalam keadaan ");
		if(this.isOpen){
			str.append("terbuka");
		} else {
			str.append("tertutup");
		}
		str.append(" dengan posisi ");
		if(this.isAttack){
			str.append("menyerang");
		} else {
			str.append("bertahan");
		}
		return str.toString();
	}
}