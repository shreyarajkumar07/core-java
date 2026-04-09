class TechCartHub
{
	public double getPriceByProductName(String productName)
	{
		System.out.println("invoking getPriceByProductName: " + productName);
		double price = 0.0;

		if("Laptop".equals(productName))
		{
			price = 55000;
		}
		else if("Mobile".equals(productName))
		{
			price = 20000;
		}
		else if("Headphones".equals(productName))
		{
			price = 1500;
		}
		else if("SmartWatch".equals(productName))
		{
			price = 3000;
		}
		else if("Backpack".equals(productName))
		{
			price = 1800;
		}
		else if("Keyboard".equals(productName))
		{
			price = 1200;
		}
		else if("Mouse".equals(productName))
		{
			price = 800;
		}
		else if("Tablet".equals(productName))
		{
			price = 25000;
		}
		else if("PowerBank".equals(productName))
		{
			price = 1500;
		}
		else if("Speaker".equals(productName))
		{
			price = 2200;
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

