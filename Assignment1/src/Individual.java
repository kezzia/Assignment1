class Individual extends Customer {
	String license;
	
	public Individual() {
		super();
	}
	
	public void printIndividual() {
		System.out.println("\nID number: " + id);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Telephone number: " + telephoneNumber);
		
	}
}