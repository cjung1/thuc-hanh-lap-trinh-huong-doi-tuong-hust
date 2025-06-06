

public class Aims {

	public static void main(String[] args) {
		// Create a new cart
		Cart anOrder = new Cart();
		
		// Create new DVD objects & add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc( "The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc( "Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc( "Aladin", 
				"Animation", 18.99f);
		//anOrder.addDigitalVideoDisc(dvd3);
		
		//anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
		anOrder.addDigitalVideoDisc(dvd1, dvd2);
		//print total cost of the items in the cart 
		System.out.println("Total Cost is: " + anOrder.totalCost());
		// 11.	Removing items from the cart
		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println("Total Cost (after deletion) is: " + anOrder.totalCost());
	}

}
