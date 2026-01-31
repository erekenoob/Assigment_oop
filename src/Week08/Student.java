package Week08;

public class Student {

    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        setId(id);
        setName(name);
        setGpa(gpa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name must contain only alphabetic characters");
        }

        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.gpa = gpa;
    }
}

