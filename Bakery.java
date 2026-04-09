class Bakery {

    String bakeryName;
    String location;
    int numberOfStaff;
    int numberOfBakedItems;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String specialtyItem;

    static String country = "India";
    static String category = "Food & Beverage";


    public String bakeItem(String itemName) {
        System.out.println("Baking Item: " + itemName);
        return itemName;
    }

    public int addBakedItems(int count) {
        System.out.println("Total Baked Items: " + numberOfBakedItems);
        return numberOfBakedItems;
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

    public boolean openBakery(boolean status) {
        System.out.println("Bakery Open: " + status);
        return status;
    }

    public boolean closeBakery(boolean status) {
        System.out.println("Bakery Closed: " + status);
        return status;
    }

    public boolean provideDelivery(boolean status) {
        System.out.println("Home Delivery Available: " + status);
        return status;
    }

    public String upgradeBakery(String upgradeType) {
        System.out.println("Bakery Upgraded: " + upgradeType);
        return upgradeType;
    }
}