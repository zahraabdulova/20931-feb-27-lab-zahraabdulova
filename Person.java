public class Person {

    private String firstName;
    private String lastName;
    private String gender;

    // Constructors
    public Person() {
    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // toString method
    @Override
    public String toString() {
        return "Person [firstName=" + firstName +
               ", lastName=" + lastName +
               ", gender=" + gender + "]";
    }

    // equals method
    public boolean equals(Person p) {
        if (p == null) return false;

        return this.firstName.equals(p.firstName) &&
               this.lastName.equals(p.lastName) &&
               this.gender.equals(p.gender);
    }
}


// ------------------ Teacher Class ------------------

class Teacher extends Person {

    private String department;
    private String courses;

    // Constructors
    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {

        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    // toString method
    @Override
    public String toString() {
        return "Teacher [firstName=" + getFirstName() +
               ", lastName=" + getLastName() +
               ", gender=" + getGender() +
               ", department=" + department +
               ", courses=" + courses + "]";
    }

    // equals method
    public boolean equals(Teacher t) {
        if (t == null) return false;

        return super.equals(t) &&
               this.department.equals(t.department) &&
               this.courses.equals(t.courses);
    }
}
