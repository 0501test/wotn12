package coffeekiosk;

public class Coffee {
	
	private int Americano = 1500;			// 아메리카노
	private int CaramelMacchiato = 3500;	// 카라멜 마끼야또
	private int CafeLatte = 3500;			// 카페 라떼

	private int hotice = 500;				// 핫 or 아이스						
	private int sizeup = 500;				// 사이즈 업	+500원
	private int decaffeine = 500;			// 디카페인	+500원
	private int shot = 500;					// 샷 추가	+500원
	
	
	public int getAmericano() {
		return Americano;
	}

	public void setAmericano(int americano) {
		Americano = americano;
	}

	public int getCaramelMacchiato() {
		return CaramelMacchiato;
	}

	public void setCaramelMacchiato(int caramelMacchiato) {
		CaramelMacchiato = caramelMacchiato;
	}

	public int getCafeLatte() {
		return CafeLatte;
	}

	public void setCafeLatte(int cafeLatte) {
		CafeLatte = cafeLatte;
	}

	public int getHotice() {
		return hotice;
	}

	public void setHotice(int hotice) {
		this.hotice = hotice;
	}

	public int getSizeup() {
		return sizeup;
	}

	public void setSizeup(int sizeup) {
		this.sizeup = sizeup;
	}

	public int getDecaffeine() {
		return decaffeine;
	}

	public void setDecaffeine(int decaffeine) {
		this.decaffeine = decaffeine;
	}

	public int getShot() {
		return shot;
	}

	public void setShot(int shot) {
		this.shot = shot;
	}

	@Override
	public String toString() {
		return "1. 아메리카노	" + Americano + "원\n" + "2. 카라멜 마끼야또	" + CaramelMacchiato + "원\n"
				+ "3. 카페라떼	" + CafeLatte + "원";
	}

}
