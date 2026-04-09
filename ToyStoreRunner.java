class ToyStoreRunner
{
    public static void main(String[] args)
    {
        ToyStore store = new ToyStore();

        double price1 = store.getPriceByToyName("Lego Set");
        System.out.println("Toy Price: " + price1);
        double total1 = store.getTotalAmount(price1, 1);
        System.out.println("Total Price: " + total1);
        double final1 = store.getDiscount(total1);
        System.out.println("Discount Price: " + final1);

        System.out.println("----------------------");

        double price2 = store.getPriceByToyName("Teddy Bear");
        System.out.println("Toy Price: " + price2);
        double total2 = store.getTotalAmount(price2, 2);
        System.out.println("Total Price: " + total2);
        double final2 = store.getDiscount(total2);
        System.out.println("Discount Price: " + final2);

        System.out.println("----------------------");

        double price3 = store.getPriceByToyName("RC Helicopter");
        System.out.println("Toy Price: " + price3);
        double total3 = store.getTotalAmount(price3, 1);
        System.out.println("Total Price: " + total3);
        double final3 = store.getDiscount(total3);
        System.out.println("Discount Price: " + final3);
    }
}