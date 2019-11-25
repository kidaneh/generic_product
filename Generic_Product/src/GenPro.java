/*
 * This program is for generic product
 * Done by Kidane Hailemichael 
 * Date 11/24/2019
 */
public class GenPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product item1= new Product();
		item1.setProcode(10);
		item1.setDecription("Desk top computer");
		item1.setPrice(1000.00);
		item1.setQuantity(3);
		
		Product item2= new Product();
		item2.setProcode(100);
		item2.setDecription("Laptop computer");
		item2.setPrice(800.00);
		item2.setQuantity(2);
		
		Product item3= new Product();
		item3.setProcode(20);
		item3.setDecription("Printer");
		item3.setPrice(500.00);
		item3.setQuantity(5);
		
		System.out.println("We have " + item1.getQuantity() + " " + item1.getDecription());
		System.out.println("We have " + item2.getQuantity() + " " + item2.getDecription());
		System.out.println("We have " + item3.getQuantity() + " " + item3.getDecription());
		System.out.println("_______________________________________________________");
		System.out.println("We have " + Product.typeofproducts + " types of items");
		System.out.println("_______________________________________________________");
		System.out.println("The price of single " + item1.getDecription() +" "+ item1.getPriceFormatted());
		System.out.println("The price of single " + item2.getDecription() +" "+ item2.getPriceFormatted());
		System.out.println("The price of single " + item3.getDecription() +" "+ item3.getPriceFormatted());
		
	}

}
