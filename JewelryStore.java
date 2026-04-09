class JewelryStore
{
    public double getPriceByJewelry(String jewelryName)
    {
        System.out.println("invoking getPriceByJewelry: " + jewelryName);
        double price = 0.0;

        if("Ring".equals(jewelryName))
        {
            price = 5000;
        }
        else if("Necklace".equals(jewelryName))
        {
            price = 12000;
        }
        else if("Bracelet".equals(jewelryName))
        {
            price = 7000;
        }
        else if("Earrings".equals(jewelryName))
        {
            price = 4000;
        }
        else if("Watch".equals(jewelryName))
        {
            price = 15000;
        }
        else if("Pendant".equals(jewelryName))
        {
            price = 3000;
        }
        else if("Bangle".equals(jewelryName))
        {
            price = 2500;
        }
        else if("Brooch".equals(jewelryName))
        {
            price = 3500;
        }
        else if("Cufflinks".equals(jewelryName))
        {
            price = 2000;
        }
        else if("Tiara".equals(jewelryName))
        {
            price = 18000;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByJewelry");
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