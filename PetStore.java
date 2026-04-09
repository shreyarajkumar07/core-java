class PetStore
{
    public double getPriceByPetItem(String itemName)
    {
        System.out.println("invoking getPriceByPetItem: " + itemName);
        double price = 0.0;

        if("Dog Food".equals(itemName))
        {
            price = 1200;
        }
        else if("Cat Food".equals(itemName))
        {
            price = 1000;
        }
        else if("Bird Cage".equals(itemName))
        {
            price = 2500;
        }
        else if("Dog Leash".equals(itemName))
        {
            price = 500;
        }
        else if("Cat Toy".equals(itemName))
        {
            price = 300;
        }
        else if("Fish Tank".equals(itemName))
        {
            price = 3500;
        }
        else if("Bird Food".equals(itemName))
        {
            price = 400;
        }
        else if("Pet Shampoo".equals(itemName))
        {
            price = 600;
        }
        else if("Hamster Wheel".equals(itemName))
        {
            price = 800;
        }
        else if("Dog Collar".equals(itemName))
        {
            price = 450;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByPetItem");
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
        double finalAmount = total - (total * 0.12);
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}