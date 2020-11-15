package chapter3.enums.goodcode;

public class Application {

	public static void main(String[] args) {
		
		Payment p1 = new Payment(100);
		p1.setStatus(PaymentStatus.PROVISION);
		
		System.out.println("Payment successfull? " + p1.isSuccessfull());
		System.out.println("Payment fail? " + p1.isFail());
		System.out.println("Payment provisioned? " + p1.isProvision());
		
		// System.out.println(p1.getStatus().fullDescription());
		
		
		// get enum values as array!
		PaymentStatus[] statusList = PaymentStatus.values();
		for(PaymentStatus ps : statusList) {
			System.out.println(ps.name());
			System.out.println(ps.fullDescription());
		}
		
		// string to enum type conversion!
		String status = "FAIL";
		try {
			PaymentStatus failStatus = PaymentStatus.valueOf(status);
			System.out.println(failStatus.fullDescription());
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
