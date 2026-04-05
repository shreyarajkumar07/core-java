class Zomato {

    String restaurantName;
    int orderId;
    boolean isDelivered;
	int quantity;


    public Zomato() 
	{
		this("KFC",101,true);
	 System.out.println("Details 1st");
    }
	public Zomato(String restaurantName)
	{
        	 System.out.println("Restaurant name:"+restaurantName);
			 System.out.println("Details 2nd");

    }
	public Zomato(String restaurantName,int orderId)
	{
		      System.out.println("Restaurant name:"+restaurantName);
        	 System.out.println("Order Id:"+orderId);
	 System.out.println("Details 3rd");

    }
	
    public Zomato(String restaurantName,int orderId,boolean isDelivered) 
	{
		System.out.println("Restaurant name:"+restaurantName);
        System.out.println("Order Id:"+orderId);
		System.out.println("Delivered:"+isDelivered);
        	 System.out.println("Details 4th");

    }
	 public Zomato(String restaurantName,int orderId,boolean isDelivered,int quantity) 
	{
		System.out.println("Restaurant name:"+restaurantName);
        System.out.println("Order Id:"+orderId);
		System.out.println("Delivered:"+isDelivered);
        System.out.println("Quantity:"+quantity);
			 System.out.println("Details 5th");

    }

    
}