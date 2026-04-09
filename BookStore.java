class BookStore
{
    public double getPriceByBookName(String bookName)
    {
        System.out.println("invoking getPriceByBookName: " + bookName);
        double price = 0.0;

        if("Java Programming".equals(bookName))
        {
            price = 1200;
        }
        else if("Data Structures".equals(bookName))
        {
            price = 900;
        }
        else if("Algorithms".equals(bookName))
        {
            price = 1500;
        }
        else if("Database Systems".equals(bookName))
        {
            price = 1300;
        }
        else if("Operating Systems".equals(bookName))
        {
            price = 1100;
        }
        else if("Networking".equals(bookName))
        {
            price = 1000;
        }
        else if("Artificial Intelligence".equals(bookName))
        {
            price = 2000;
        }
        else if("Machine Learning".equals(bookName))
        {
            price = 1800;
        }
        else if("Cyber Security".equals(bookName))
        {
            price = 1700;
        }
        else if("Web Development".equals(bookName))
        {
            price = 800;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByBookName");
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