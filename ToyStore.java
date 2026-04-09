class ToyStore
{
    public double getPriceByToyName(String toyName)
    {
        System.out.println("invoking getPriceByToyName: " + toyName);
        double price = 0.0;

        if("Teddy Bear".equals(toyName))
        {
            price = 800;
        }
        else if("Lego Set".equals(toyName))
        {
            price = 2500;
        }
        else if("Puzzle".equals(toyName))
        {
            price = 500;
        }
        else if("Toy Car".equals(toyName))
        {
            price = 300;
        }
        else if("Doll".equals(toyName))
        {
            price = 600;
        }
        else if("Board Game".equals(toyName))
        {
            price = 1200;
        }
        else if("Yo-Yo".equals(toyName))
        {
            price = 150;
        }
        else if("RC Helicopter".equals(toyName))
        {
            price = 3500;
        }
        else if("Train Set".equals(toyName))
        {
            price = 2800;
        }
        else if("Action Figure".equals(toyName))
        {
            price = 900;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByToyName");
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
        double finalAmount = total - (total * 0.10); 
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}