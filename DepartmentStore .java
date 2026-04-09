class DepartmentStore {
    String storeName;
    String location;
    int numberOfFloors;
    int numberOfSections;
    int numberOfStaff;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String storeType; 

    static String country = "India";
    static String category = "Retail";

    public String openFloor(String floorName) {
        System.out.println("Floor Opened: " + floorName);
        return floorName;
    }

    public int addSections(int count) {
        System.out.println("Total Sections: " + numberOfSections);
        return numberOfSections;
    }

    public int hireStaff(int count) {
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public boolean openStore(boolean status) {
        System.out.println("Store Open: " + status);
        return status;
    }

    public boolean closeStore(boolean status) {
        System.out.println("Store Closed: " + status);
        return status;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return dailyRevenue;
    }

    public String organizeSale(String saleName) {
        System.out.println("Sale Organized: " + saleName);
        return saleName;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }

    public String upgradeStore(String upgradeType) {
        System.out.println("Store Upgraded: " + upgradeType);
        return upgradeType;
    }
}