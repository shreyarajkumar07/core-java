class DessertShop {

    String shopName;
    String location;
    int numberOfStaff;
    int numberOfDesserts;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String specialtyDessert; 
    static String country = "India";
    static String category = "Food & Beverage";

    public String serveDessert(String dessertName) {
        System.out.println("Serving Dessert: " + dessertName);
        return dessertName;
    }

    public int addDesserts(int count) {
        System.out.println("Total Desserts Available: " + numberOfDesserts);
        return numberOfDesserts;
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

    public boolean openShop(boolean status) {
        System.out.println("Dessert Shop Open: " + status);
        return status;
    }

    public boolean closeShop(boolean status) {
        System.out.println("Dessert Shop Closed: " + status);
        return status;
    }

    public boolean provideDelivery(boolean status) {
        System.out.println("Home Delivery Available: " + status);
        return status;
    }

    public String upgradeShop(String upgradeType) {
        System.out.println("Dessert Shop Upgraded: " + upgradeType);
        return upgradeType;
    }
}