package chapter3.enums.badcode;

public class Application {

	public static void main(String[] args) {
		
		Payment p1 = new Payment(100);
		p1.setStatus(1);
		
		System.out.println("Payment status: " + p1.isSuccessfull());
		
		p1.setStatus(10000);
		
		System.out.println("Payment successfull? " + p1.isSuccessfull());
		System.out.println("Payment fail? " + p1.isFail());
		System.out.println("Payment provisioned? " + p1.isProvision());

	}

}
