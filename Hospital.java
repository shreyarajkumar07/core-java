class Hospital {

    
    String hospitalName;
    String location;
    int numberOfDoctors;
    int numberOfNurses;
    int numberOfBeds;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    
    static String country = "India";
    static String category = "Healthcare";


    public String admitPatient(String patientName) {
        System.out.println("Patient Admitted: " + patientName);
        return patientName;
    }

    public int hireDoctors(int count) {
        System.out.println("Total Doctors: " + numberOfDoctors);
        return numberOfDoctors;
    }

    public int hireNurses(int count) {
        System.out.println("Total Nurses: " + numberOfNurses);
        return numberOfNurses;
    }

    public int addBeds(int count) {
        System.out.println("Total Beds: " + numberOfBeds);
        return numberOfBeds;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return dailyRevenue;
    }

    public boolean openHospital(boolean status) {
        System.out.println("Hospital Open: " + status);
        return status;
    }

    public boolean closeHospital(boolean status) {
        System.out.println("Hospital Closed: " + status);
        return status;
    }

    public boolean maintainEmergencyWard(boolean status) {
        System.out.println("Emergency Ward Maintained: " + status);
        return status;
    }

    public boolean maintainICU(boolean status) {
        System.out.println("ICU Maintained: " + status);
        return status;
    }

    public String upgradeHospital(String upgradeType) {
        System.out.println("Hospital Upgraded: " + upgradeType);
        return upgradeType;
    }
}