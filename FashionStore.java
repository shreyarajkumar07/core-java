class FashionStore
{
    public double getPriceByItemName(String itemName)
    {
        System.out.println("invoking getPriceByItemName: " + itemName);
        double price = 0.0;

        if("Shirt".equals(itemName))
        {
            price = 1200;
        }
        else if("Jeans".equals(itemName))
        {
            price = 2000;
        }
        else if("Jacket".equals(itemName))
        {
            price = 3500;
        }
        else if("Shoes".equals(itemName))
        {
            price = 2500;
        }
        else if("Cap".equals(itemName))
        {
            price = 500;
        }
        else if("TShirt".equals(itemName))
        {
            price = 800;
        }
        else if("Sweater".equals(itemName))
        {
            price = 1800;
        }
        else if("Socks".equals(itemName))
        {
            price = 300;
        }
        else if("Belt".equals(itemName))
        {
            price = 700;
        }
        else if("Watch".equals(itemName))
        {
            price = 2200;
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
        double finalAmount = total - (total * 0.20);
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}