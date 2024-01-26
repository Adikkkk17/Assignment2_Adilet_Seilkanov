public class Student extends Person {
    private static int studentCounter = 1;
    private int studentId; // Unique identifier for each student
    private double gpa;

    public Student() {
        super();
        this.studentId = generateStudentId();
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.studentId = generateStudentId();
        setGpa(gpa);
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36600.0;
        }
        return 0.0;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }

    @Override
    public String toString() {
        return "Student (ID: " + studentId + "): " + super.toString() + " " + getPaymentAmount();
    }

    private int generateStudentId() {
        return studentCounter++;
    }
}