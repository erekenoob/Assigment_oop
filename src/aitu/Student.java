package aitu;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private double[] grades;

    private static int nextId = 250001;
    private static String domain = "astanait.edu.kz";

    public Student() {
        this.firstname = "John";
        this.lastname = "Wick";
        this.id = nextId++;
        this.grades = new double[0];
    }

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = nextId++;
        this.grades = new double[0];
    }

    public Student(String firstname, String lastname, double[] grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.grades = grades;
        this.id = nextId++;
    }

    public int getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public double[] getGrades() { return grades; }
    public static int getNextId() { return nextId; }
    public static String getDomain() { return domain; }

    public void setId(int id) { this.id = id; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public void setGrades(double[] grades) { this.grades = grades; }
    public static void setNextId(int nextId) { Student.nextId = nextId; }
    public static void setDomain(String domain) { Student.domain = domain; }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    public double getGpa() {
        if (grades.length == 0) return 0.0;
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    public boolean isHonors() {
        return getGpa() >= 3.5;
    }

    public String getEmail() {
        return id + "@" + domain;
    }

    public void addGrade(double grade) {
        double[] newGrades = new double[grades.length + 1];
        for (int i = 0; i < grades.length; i++) {
            newGrades[i] = grades[i];
        }
        newGrades[grades.length] = grade;
        grades = newGrades;
    }
}
