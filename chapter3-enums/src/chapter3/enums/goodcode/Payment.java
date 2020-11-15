package chapter3.enums.goodcode;

public class Payment {

	private double totalValue;
	private PaymentStatus status;
	
	public Payment(double totalValue) {
		this.setTotalValue(totalValue);
	}
	
	public boolean isSuccessfull() {
		
		return PaymentStatus.SUCCESS.equals(this.status);
		
		// return this.status.equals(PaymentStatus.SUCCESS);
	}
	
	public boolean isFail() {
		
		return PaymentStatus.FAIL.equals(this.status);
	}
	
	public boolean isProvision() {
		
		return PaymentStatus.PROVISION.equals(this.status);
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
}
