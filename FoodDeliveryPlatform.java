class FoodDeliveryPlatform {

   
    String platformName;
    String headquarters;
    int numberOfRestaurants;
    int numberOfDeliveryPartners;
    int numberOfStaff;
    String CEOName;
    double dailyRevenue;
    int establishedYear;
    String platformType; 
    static String country = "India";
    static String category = "Food & Technology";

   

    public String registerRestaurant(String restaurantName) {
        System.out.println("Restaurant Registered: " + restaurantName);
        return restaurantName;
    }

    public int onboardDeliveryPartners(int count) {
        System.out.println("Total Delivery Partners: " + numberOfDeliveryPartners);
        return numberOfDeliveryPartners;
    }

    public int hireStaff(int count) {
       
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public String assignCEO(String ceoName) {
        System.out.println("CEO Assigned: " + ceoName);
        return ceoName;
    }

    public boolean startOperations(boolean status) {
        System.out.println("Operations Started: " + status);
        return status;
    }

    public boolean stopOperations(boolean status) {
        System.out.println("Operations Stopped: " + status);
        return status;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return dailyRevenue;
    }

    public String launchPromotion(String promoName) {
        System.out.println("Promotion Launched: " + promoName);
        return promoName;
    }

    public boolean maintainPlatform(boolean status) {
        System.out.println("Platform Maintained: " + status);
        return status;
    }

    public String upgradePlatform(String upgradeType) {
        System.out.println("Platform Upgraded: " + upgradeType);
        return upgradeType;
    }
}