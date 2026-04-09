class MusicStore
{
    public double getPriceByInstrument(String instrumentName)
    {
        System.out.println("invoking getPriceByInstrument: " + instrumentName);
        double price = 0.0;

        if("Guitar".equals(instrumentName))
        {
            price = 8000;
        }
        else if("Piano".equals(instrumentName))
        {
            price = 45000;
        }
        else if("Drum Set".equals(instrumentName))
        {
            price = 15000;
        }
        else if("Violin".equals(instrumentName))
        {
            price = 12000;
        }
        else if("Flute".equals(instrumentName))
        {
            price = 3000;
        }
        else if("Saxophone".equals(instrumentName))
        {
            price = 25000;
        }
        else if("Microphone".equals(instrumentName))
        {
            price = 4000;
        }
        else if("Keyboard".equals(instrumentName))
        {
            price = 10000;
        }
        else if("Tambourine".equals(instrumentName))
        {
            price = 1500;
        }
        else if("Harmonica".equals(instrumentName))
        {
            price = 1200;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByInstrument");
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