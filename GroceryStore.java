class GroceryStore
{
    public double getPriceByItemName(String itemName)
    {
        System.out.println("invoking getPriceByItemName: " + itemName);
        double price = 0.0;

        if("Rice".equals(itemName))
        {
            price = 80;
        }
        else if("Wheat".equals(itemName))
        {
            price = 60;
        }
        else if("Sugar".equals(itemName))
        {
            price = 45;
        }
        else if("Milk".equals(itemName))
        {
            price = 50;
        }
        else if("Oil".equals(itemName))
        {
            price = 120;
        }
        else if("Eggs".equals(itemName))
        {
            price = 10;
        }
        else if("Butter".equals(itemName))
        {
            price = 200;
        }
        else if("Cheese".equals(itemName))
        {
            price = 250;
        }
        else if("Salt".equals(itemName))
        {
            price = 25;
        }
        else if("Tea".equals(itemName))
        {
            price = 150;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByItemName");
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
        double finalAmount = total - (total * 0.05);
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}