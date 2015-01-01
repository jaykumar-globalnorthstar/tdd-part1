package sibisoft;


public class Dollar {

	//amount value
	public int amount;

	Dollar(int amount) {
		this.amount= amount;
	}

	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

}
