class PizzaParlor {

    String parlorName;
    String location;
    int numberOfStaff;
    int numberOfOvens;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    boolean hasSeatingArea;
    boolean offersHomeDelivery;
    String specialtyPizza;

    static String country = "India";
    static String category = "Food & Beverage";


    public String makePizza(String pizzaName) {
        System.out.println("Making Pizza: " + pizzaName);
        return pizzaName;
    }

    public int addOvens(int count) {
        System.out.println("Total Ovens: " + numberOfOvens);
        return numberOfOvens;
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
        System.out.println("Pizza Parlor Open: " + status);
        return status;
    }

    public boolean closeParlor(boolean status) {
        System.out.println("Pizza Parlor Closed: " + status);
        return status;
    }

    public boolean provideDelivery(boolean status) {
        System.out.println("Home Delivery Available: " + status);
        return status;
    }

    public String upgradeParlor(String upgradeType) {
        System.out.println("Pizza Parlor Upgraded: " + upgradeType);
        return upgradeType;
    }
}