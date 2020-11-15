package chapter3.enums.badcode;

public class Payment {

	private double totalValue;
	private final int SUCCESS = 1;
	private final int PROVISION = 2;
	private final int FAIL = 3;
	
	private int status;
	
	public Payment(double totalValue) {
		this.setTotalValue(totalValue);
	}
	
	public boolean isSuccessfull() {
		
		return this.status == SUCCESS;
	}
	
	public boolean isFail() {
		
		return this.status == FAIL;
	}
	
	public boolean isProvision() {
		
		return this.status == PROVISION;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
}
