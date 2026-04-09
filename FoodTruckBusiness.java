class FoodTruckBusiness {

    String truckName;
    String headquarters;
    String truckLocation;
    int numberOfStaff;
    int numberOfCooks;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String cuisineType; 
    boolean isMobile;

    static String country = "India";
    static String category = "Food & Beverage";

    
    public String startService(String location) {
        System.out.println("Food Truck Service Started at: " + location);
        return location;
    }

    public boolean stopService(boolean status) {
        System.out.println("Food Truck Service Stopped: " + status);
        return status;
    }

    public int hireStaff(int count) {
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public int hireCooks(int count) {
        System.out.println("Total Cooks: " + numberOfCooks);
        return numberOfCooks;
    }

    public String assignManager(String manager) {
        managerName = manager;
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public double collectRevenue(double amount) {
        dailyRevenue += amount;
        System.out.println("Revenue Collected: " + amount);
        return dailyRevenue;
    }

    public String organizeEvent(String eventName) {
        System.out.println("Event Organized at Truck: " + eventName);
        return eventName;
    }

    public boolean maintainTruck(boolean status) {
        System.out.println("Truck Maintained: " + status);
        return status;
    }

    public String upgradeTruck(String upgradeType) {
        System.out.println("Truck Upgraded: " + upgradeType);
        return upgradeType;
    }
}