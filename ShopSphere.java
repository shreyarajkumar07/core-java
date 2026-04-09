class ShopSphere
{
	public double getPriceByProductName(String productName)
	{
		System.out.println("invoking getPriceByProductName: " + productName);
		double price = 0.0;

		if("Shirt".equals(productName))
		{
			price = 999;
		}
		else if("Jeans".equals(productName))
		{
			price = 1499.50;
		}
		else if("Shoes".equals(productName))
		{
			price = 1999.99;
		}
		else if("Watch".equals(productName))
		{
			price = 2500;
		}
		else if("Bag".equals(productName))
		{
			price = 1200;
		}
		else if("T-Shirt".equals(productName))
		{
			price = 499;
		}
		else if("Jacket".equals(productName))
		{
			price = 2999;
		}
		else if("Cap".equals(productName))
		{
			price = 299;
		}
		else if("Sunglasses".equals(productName))
		{
			price = 899;
		}
		else if("Wallet".equals(productName))
		{
			price = 699;
		}
		else
		{
			price = 0.0;
		}

		System.out.println("end of getPriceByProductName");
		return price;
	}

	public double getTotalAmount(double price, int quantity)
	{
		System.out.println("invoking getTotalAmount");

		double total = price * quantity;

		System.out.println("end of getTotalAmount");
		return total;
	}

	public double getDiscount(double total)
	{
		System.out.println("invoking getDiscount");

		double finalAmount = total - (total * 0.15);

		System.out.println("end of getDiscount");
		return finalAmount;
	}
}

class ShopSphereRunner
{
	public static void main(String[] args)
	{
		ShopSphere instance1 = new ShopSphere();
		double price1 = instance1.getPriceByProductName("Watch");
		System.out.println("Product Price: " + price1);
		double totalAmount1 = instance1.getTotalAmount(price1, 2);
		System.out.println("Total Price: " + totalAmount1);
		double finalAmount1 = instance1.getDiscount(totalAmount1);
		System.out.println("Discount Price: " + finalAmount1);

		System.out.println("----------------------");

		ShopSphere instance2 = new ShopSphere();
		double price2 = instance2.getPriceByProductName("Shirt");
		System.out.println("Product Price: " + price2);
		double totalAmount2 = instance2.getTotalAmount(price2, 1);
		System.out.println("Total Price: " + totalAmount2);
		double finalAmount2 = instance2.getDiscount(totalAmount2);
		System.out.println("Discount Price: " + finalAmount2);

		System.out.println("----------------------");

		ShopSphere instance3 = new ShopSphere();
		double price3 = instance3.getPriceByProductName("Shoes");
		System.out.println("Product Price: " + price3);
		double totalAmount3 = instance3.getTotalAmount(price3, 3);
		System.out.println("Total Price: " + totalAmount3);
		double finalAmount3 = instance3.getDiscount(totalAmount3);
		System.out.println("Discount Price: " + finalAmount3);

		System.out.println("----------------------");

		ShopSphere instance4 = new ShopSphere();
		double price4 = instance4.getPriceByProductName("Bag");
		System.out.println("Product Price: " + price4);
		double totalAmount4 = instance4.getTotalAmount(price4, 2);
		System.out.println("Total Price: " + totalAmount4);
		double finalAmount4 = instance4.getDiscount(totalAmount4);
		System.out.println("Discount Price: " + finalAmount4);

		System.out.println("----------------------");

		ShopSphere instance5 = new ShopSphere();
		double price5 = instance5.getPriceByProductName("Jeans");
		System.out.println("Product Price: " + price5);
		double totalAmount5 = instance5.getTotalAmount(price5, 2);
		System.out.println("Total Price: " + totalAmount5);
		double finalAmount5 = instance5.getDiscount(totalAmount5);
		System.out.println("Discount Price: " + finalAmount5);
	}
}