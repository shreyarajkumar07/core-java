class Gym {

    String gymName;
    String location;
    int numberOfTrainers;
    int numberOfMembers;
    int numberOfEquipment;
    String managerName;
    double monthlyRevenue;
    int establishedYear;
    
    static String country = "India";
    static String category = "Fitness";

    public String enrollMember(String memberName) {
        System.out.println("Member Enrolled: " + memberName);
        return memberName;
    }

    public int addEquipment(int count) {
        System.out.println("Total Equipment: " + numberOfEquipment);
        return numberOfEquipment;
    }

    public int hireTrainers(int count) {
        System.out.println("Total Trainers: " + numberOfTrainers);
        return numberOfTrainers;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return monthlyRevenue;
    }

    public boolean openGym(boolean status) {
        System.out.println("Gym Open: " + status);
        return status;
    }

    public boolean closeGym(boolean status) {
        System.out.println("Gym Closed: " + status);
        return status;
    }

    public boolean conductYoga(boolean status) {
        System.out.println("Yoga Class Conducted: " + status);
        return status;
    }

    public boolean maintainSwimmingPool(boolean status) {
        System.out.println("Swimming Pool Maintained: " + status);
        return status;
    }

    public String upgradeGym(String upgradeType) {
        System.out.println("Gym Upgraded: " + upgradeType);
        return upgradeType;
    }
}