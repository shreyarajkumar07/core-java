class IceCreamParlor {

   
    String parlorName;
    String location;
    int numberOfStaff;
    int numberOfFlavors;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    boolean hasSeatingArea;
    boolean offersHomeDelivery;
    String specialtyFlavor;

    static String country = "India";
    static String category = "Food & Beverage";


    public String serveIceCream(String flavor) {
        System.out.println("Serving Ice Cream Flavor: " + flavor);
        return flavor;
    }

    public int addFlavors(int count) {
        System.out.println("Total Flavors: " + numberOfFlavors);
        return numberOfFlavors;
    }

    public int hireStaff(int count) {
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return dailyRevenue;
    }

    public boolean openParlor(boolean status) {
        System.out.println("Parlor Open: " + status);
        return status;
    }

    public boolean closeParlor(boolean status) {
        System.out.println("Parlor Closed: " + status);
        return status;
    }

    public boolean provideDelivery(boolean status) {
        System.out.println("Home Delivery Available: " + status);
        return status;
    }

    public String upgradeParlor(String upgradeType) {
        System.out.println("Parlor Upgraded: " + upgradeType);
        return upgradeType;
    }
}