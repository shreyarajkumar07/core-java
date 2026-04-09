class Cinema {

    String cinemaName;
    String location;
    int numberOfScreens;
    int numberOfStaff;
    int numberOfSeats;
    String managerName;
    double dailyRevenue;
    int establishedYear;
	
    static String country = "India";
    static String category = "Entertainment";


    public String screenMovie(String movieName) {
        System.out.println("Movie Screening: " + movieName);
        return movieName;
    }

    public int addScreens(int count) {
        System.out.println("Total Screens: " + numberOfScreens);
        return numberOfScreens;
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

    public boolean openCinema(boolean status) {
        System.out.println("Cinema Open: " + status);
        return status;
    }

    public boolean closeCinema(boolean status) {
        System.out.println("Cinema Closed: " + status);
        return status;
    }

    public boolean maintain3DScreens(boolean status) {
        System.out.println("3D Screens Maintained: " + status);
        return status;
    }

    public boolean maintainFoodCourt(boolean status) {
        System.out.println("Food Court Maintained: " + status);
        return status;
    }

    public String upgradeCinema(String upgradeType) {
        System.out.println("Cinema Upgraded: " + upgradeType);
        return upgradeType;
    }
}