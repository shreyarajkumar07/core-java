class BikeDetails {
    static int bikeQuantity[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    static float bikePrice[] = {10000000f, 12000000f, 13000000f, 13000000f, 15000000f, 20000000f, 17000000f, 18000000f, 19000000f, 20000000f, 22000000f, 23000000f, 25000000f, 22000000f, 16900000f, 17000000f, 15000000f};
    static short reviews[] = {10, 20, 130, 150, 500, 700, 805, 500, 25, 220, 169, 170, 150};
    static String purchasersnames[] = {"Ram", "Sita", "Ravi", "Anu", "Kiran", "Maya", "Arun", "Sneha", "Ajay", "Divya", "Vijay", "Pooja", "Rahul", "Menu", "Radha"};

    public static void main(String args[]) {
        System.out.println("Even Bikequantity:");
        for (int i = 0; i < bikeQuantity.length; i++) {
            if (i % 2 == 0) {
                System.out.print(bikeQuantity[i]);
            }
        }

        System.out.println("\nEven float values:");
        for (int i = 0; i < bikePrice.length; i++) {
            if (i % 2 == 0) {
                System.out.print(bikePrice[i]);
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