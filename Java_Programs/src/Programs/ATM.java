package Programs;

public class ATM implements Banking1,Banking2 {

	public static void main(String[] args) {
		
		Banking1 bk=new ATM();
		bk.Balance();

	}

	@Override
	public void CreditCard() {
		
		
	}

	@Override
	public void Balance() {
		
		
	}

	@Override
	public void DebitCard() {
		
		
	}

	@Override
	public void Transfer() {
		
		
	}

}
