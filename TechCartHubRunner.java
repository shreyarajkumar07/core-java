class TechCartHubRunner
{
	public static void main(String[] args)
	{
		TechCartHub obj1 = new TechCartHub();
		double price1 = obj1.getPriceByProductName("Laptop");
		System.out.println("Product Price: " + price1);
		double total1 = obj1.getTotalAmount(price1, 1);
		System.out.println("Total Price: " + total1);
		double final1 = obj1.getDiscount(total1);
		System.out.println("Discount Price: " + final1);

		System.out.println("----------------------");

		TechCartHub obj2 = new TechCartHub();
		double price2 = obj2.getPriceByProductName("Mobile");
		System.out.println("Product Price: " + price2);
		double total2 = obj2.getTotalAmount(price2, 2);
		System.out.println("Total Price: " + total2);
		double final2 = obj2.getDiscount(total2);
		System.out.println("Discount Price: " + final2);

		System.out.println("----------------------");

		TechCartHub obj3 = new TechCartHub();
		double price3 = obj3.getPriceByProductName("Headphones");
		System.out.println("Product Price: " + price3);
		double total3 = obj3.getTotalAmount(price3, 3);
		System.out.println("Total Price: " + total3);
		double final3 = obj3.getDiscount(total3);
		System.out.println("Discount Price: " + final3);
	}
}