class IceCreamParlorChain {

    
    String chainName;
    String headquarters;
    int numberOfBranches;
    int numberOfStaff;
    int numberOfIceCreamChefs;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String flavorSpecialty; 

    static String country = "India";
    static String category = "Food & Hospitality";

    
    public String openBranch(String branchName) {
        System.out.println("Ice Cream Parlor Branch Opened: " + branchName);
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
        System.out.println("Total Ice Cream Chefs: " + numberOfIceCreamChefs);
        return numberOfIceCreamChefs;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
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

    public String upgradeParlor(String upgradeType) {
        System.out.println("Parlor Upgraded: " + upgradeType);
        return upgradeType;
    }
}