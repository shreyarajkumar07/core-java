class FashionStoreRunner
{
    public static void main(String[] args)
    {
        FashionStore obj = new FashionStore();

        double price1 = obj.getPriceByItemName("Jacket");
        System.out.println("Product Price: " + price1);
        double total1 = obj.getTotalAmount(price1, 2);
        System.out.println("Total Price: " + total1);
        double final1 = obj.getDiscount(total1);
        System.out.println("Discount Price: " + final1);

        System.out.println("----------------------");

        double price2 = obj.getPriceByItemName("Shoes");
        System.out.println("Product Price: " + price2);
        double total2 = obj.getTotalAmount(price2, 1);
        System.out.println("Total Price: " + total2);
        double final2 = obj.getDiscount(total2);
        System.out.println("Discount Price: " + final2);

        System.out.println("----------------------");

        double price3 = obj.getPriceByItemName("Cap");
        System.out.println("Product Price: " + price3);
        double total3 = obj.getTotalAmount(price3, 3);
        System.out.println("Total Price: " + total3);
        double final3 = obj.getDiscount(total3);
        System.out.println("Discount Price: " + final3);
    }
}