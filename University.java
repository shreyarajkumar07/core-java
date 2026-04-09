class University {
    String universityName;
    String location;
    int numberOfStudents;
    int numberOfProfessors;
    String chancellorName;
    double tuitionFee;
    String universityType;       
    int establishedYear;

    static String country = "India";
    static String educationLevel = "Higher Education";

    public String conductLecture(String courseName) {
        System.out.println("Conducting Lecture: " + courseName);
        return courseName;
    }

    public int enrollStudent(int newStudents) {
        System.out.println("Enrolled Students: " + newStudents + ". Total Students: " + numberOfStudents);
        return numberOfStudents;
    }

    public String assignProfessor(String professorName) {
        System.out.println("Assigned Professor: " + professorName);
        return professorName;
    }

    public double collectTuition(double amount) {
        System.out.println("Tuition Collected: " + amount);
        return amount;
    }

    public String declareHoliday(String holidayName) {
        System.out.println("Holiday Declared: " + holidayName);
        return holidayName;
    }

    public String organizeSeminar(String seminarName) {
        System.out.println("Seminar Organized: " + seminarName);
        return seminarName;
    }

    public boolean maintainCampusDiscipline(boolean status) {
        System.out.println("Campus Discipline Maintained: " + status);
        return status;
    }

    public int calculateTotalStudents() {
        System.out.println("Total Students: " + numberOfStudents);
        return numberOfStudents;
    }
}