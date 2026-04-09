class TrainingInstitute {
    String instituteName;
    String location;
    int numberOfStudents;
    int numberOfTrainers;
    int numberOfCourses;
    String managerName;
    double courseFee;
    int establishedYear;

    static String country = "India";
    static String educationType = "Skill Development";

    public String conductTraining(String courseName) {
        System.out.println("Conducting Training: " + courseName);
        return courseName;
    }

    public int enrollStudent(int newStudents) {
        System.out.println("Enrolled Students: " + newStudents + ". Total Students: " + numberOfStudents);
        return numberOfStudents;
    }

    public String assignTrainer(String trainerName) {
        System.out.println("Trainer Assigned: " + trainerName);
        return trainerName;
    }

    public double collectFee(double feeAmount) {
        System.out.println("Fee Collected: " + feeAmount);
        return feeAmount;
    }

    public boolean openLab(boolean status) {
        hasLab = status;
        System.out.println("Lab Open: " + status);
        return status;
    }

    public boolean conductExam(boolean examStatus) {
        System.out.println("Exam Conducted: " + examStatus);
        return examStatus;
    }

    public String announceHoliday(String holidayName) {
        System.out.println("Holiday Announcement: " + holidayName);
        return holidayName;
    }

    public String organizeWorkshop(String workshopName) {
        System.out.println("Workshop Organized: " + workshopName);
        return workshopName;
    }

    public boolean maintainDiscipline(boolean status) {
        System.out.println("Discipline Maintained: " + status);
        return status;
    }

    public int calculateTotalStudents() {
        System.out.println("Total Students: " + numberOfStudents);
        return numberOfStudents;
    }
}