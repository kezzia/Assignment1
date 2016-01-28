
public class Order {
	int MAX_ORDER = 10;
	int orderID = 0;									//same number as customer ID
	String trackingNumber;
	String customer;
	String shippingMode = "Method";
	String shippingDate = "Date";
	String category;
	String[] items = new String[MAX_ORDER];
	
	public Order(int custID, String custName) {
		this.orderID = custID;
		this.customer = custName;
	}
	
	public void printMerch() {
	//prints list of items available
	}
	
	public void addToOrder() {
	//adds an item off the list to the user's order
	}
	
	public void printOrder() {
	//prints entirety of user's order
	}

}
