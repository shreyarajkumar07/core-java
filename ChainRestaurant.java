class ChainRestaurant {
    String restaurantName;
    String headquarters;
    int numberOfBranches;
    int numberOfStaff;
    int numberOfChefs;
    String CEOName;
    double dailyRevenue;
    int establishedYear;
    String cuisineType; 

    static String country = "India";
    static String category = "Food & Hospitality";

    public String openBranch(String branchName) {
        System.out.println("Branch Opened: " + branchName);
        return branchName;
    }

    public int addBranches(int count) {
        System.out.println("Total Branches: " + numberOfBranches);
        return numberOfBranches;
    }

    public int hireStaff(int count) {
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public int hireChefs(int count) {
        System.out.println("Total Chefs: " + numberOfChefs);
        return numberOfChefs;
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

    public String organizePromotion(String promoName) {
        System.out.println("Promotion Organized: " + promoName);
        return promoName;
    }

    public String upgradeRestaurant(String upgradeType) {
        System.out.println("Restaurant Upgraded: " + upgradeType);
        return upgradeType;
    }
}