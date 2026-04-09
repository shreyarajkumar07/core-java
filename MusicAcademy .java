class MusicAcademy {
    String academyName;
    String location;
    int numberOfStudents;
    int numberOfTeachers;
    int numberOfCourses;
    String directorName;
    double monthlyFee;
    int establishedYear;

    static String country = "India";
    static String educationType = "Performing Arts"

    public String conductClass(String className) {
        System.out.println("Conducting Music Class: " + className);
        return className;
    }

    public int enrollStudent(int newStudents) {
        System.out.println("Enrolled Students: " + newStudents + ". Total Students: " + numberOfStudents);
        return numberOfStudents;
    }

    public String assignTeacher(String teacherName) {
        System.out.println("Assigned Teacher: " + teacherName);
        return teacherName;
    }

    public double collectFee(double feeAmount) {
        System.out.println("Fee Collected: " + feeAmount);
        return feeAmount;
    }

    public boolean openPracticeRoom(boolean status) {
        hasPracticeRooms = status;
        System.out.println("Practice Rooms Open: " + status);
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

    public String organizeConcert(String concertName) {
        System.out.println("Concert Organized: " + concertName);
        return concertName;
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