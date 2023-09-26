package injection;

public class BillCollector {
	private IPayment iPayment;
	
	//setter injection
	public void setiPayment(IPayment iPayment) {
		this.iPayment = iPayment;
	}
	
	//constructor injection
	
	public BillCollector() {
		
	}
	
	
	public BillCollector(IPayment iPayment) {
		this.iPayment=iPayment;
	}

	public void payBill(Double amount) {
		String pay = iPayment.pay();
		System.out.println(pay);
	}
	

}
