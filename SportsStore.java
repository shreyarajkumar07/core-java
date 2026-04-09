class SportsStore
{
    public double getPriceByEquipment(String equipmentName)
    {
        System.out.println("invoking getPriceByEquipment: " + equipmentName);
        double price = 0.0;

        if("Football".equals(equipmentName))
        {
            price = 1500;
        }
        else if("Basketball".equals(equipmentName))
        {
            price = 1800;
        }
        else if("Cricket Bat".equals(equipmentName))
        {
            price = 2500;
        }
        else if("Tennis Racket".equals(equipmentName))
        {
            price = 2200;
        }
        else if("Gym Gloves".equals(equipmentName))
        {
            price = 500;
        }
        else if("Skipping Rope".equals(equipmentName))
        {
            price = 300;
        }
        else if("Yoga Mat".equals(equipmentName))
        {
            price = 1200;
        }
        else if("Hockey Stick".equals(equipmentName))
        {
            price = 2800;
        }
        else if("Dumbbells".equals(equipmentName))
        {
            price = 3500;
        }
        else if("Shin Guards".equals(equipmentName))
        {
            price = 800;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByEquipment");
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