package sibisoft;

public class Sum implements Expression{

	Money augend;
	Money addend;
	
	Sum(Money augend, Money addend) {
		this.augend = augend;
		this.addend = addend;
	}

	public Money reduce(Bank bank, String to) {
		int amount = augend.amount + addend.amount;
		return new Money(amount,to);
	}
	
	@Override
	public Expression plus(Money addend) {
		// TODO Auto-generated method stub
		return null;
	}

}
