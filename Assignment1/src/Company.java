class Company extends Customer {
	double DISCOUNT = .05;
	
	public Company() {
		super();
	}
	
	public void printCompany() {
		System.out.println("\nID number: " + id);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Telephone number: " + telephoneNumber);
		System.out.println("Discount: " + (DISCOUNT * 100) + "%");
		
	}
}