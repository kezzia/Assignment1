public class main {

	public static void main(String[] args) {
		int idNum = 0;
		String[] merch = {"Lots and Lots of Cars and Trains",
				"Unreasonably Large Pikachu Plush",
				"A suitcase full of flies",
				"Labyrinth Poster (Autographed by me)",
				"Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10",
				"Item 11", "Item 12"};
		
		//print list of merch
		for (int i = 0; i < merch.length; i++) {
			System.out.println((i + 1) + ". " + merch[i]);
		}
	
		
		Customer c1 = new Customer(idNum);
		c1.setName("P Sherman");
		c1.setAddress("blah");
		c1.setNumber(11);

		//c1.getInfo();
		c1.printCustomer();
	}
	
}


