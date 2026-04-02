class PhoneDetails {
    static int phoneQuantity[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    static float phonePrice[] = {23000000f, 45000000f, 67000000f, 34000000f, 68000000f, 67000000f, 98000000f, 18000000f, 19000000f, 20000000f, 22000000f, 23000000f, 25000000f, 22000000f, 16900000f, 17000000f, 15000000f};
    static short reviews[] = {45, 78, 456, 876, 500, 700, 453, 876, 76, 234, 456, 578, 150};
    static String purchasersnames[] = {"Nithu", "Thanu", "Roopa", "Suma", "Kavya", "Manju", "Abhi", "Shreya", "Rithu", "Divya", "Vinu", "Pooja", "Rahul", "pavan", "Radha"};

    public static void main(String args[]) {
        System.out.println("Even phonequantity:");
        for (int i = 0; i < phoneQuantity.length; i++) {
            if (i % 2 == 0) {
                System.out.print(phoneQuantity[i]);
            }
        }

        System.out.println("\nEven float values:");
        for (int i = 0; i < phonePrice.length; i++) {
            if (i % 2 == 0) {
                System.out.print(phonePrice[i]);
            }
        }

        System.out.println("\nEven reviews:");
        for (int i = 0; i < reviews.length; i++) {
            if (i % 2 == 0) {
                System.out.print(reviews[i]);
            }
        }

        System.out.println("\nEven purchasersnames:");
        for (int i = 0; i < purchasersnames.length; i++) {
            if (i % 2 == 0) {
                System.out.print(purchasersnames[i]);
            }
        }
    }
}