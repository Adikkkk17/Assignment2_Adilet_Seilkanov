public class Employee extends Person {

    private static int employeeCounter = 1;
    private int employeeId; // Unique identifier for each employee
    private String position;
    private double salary;

    public Employee() {
        super();
        this.employeeId = generateEmployeeId();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.employeeId = generateEmployeeId();
        setSalary(salary);
        setPosition(position);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }

    @Override
    public String toString() {
        return "Employee (ID: " + employeeId  + position  + super.toString() + " " + getPaymentAmount();
    }

    private int generateEmployeeId() {
        return employeeCounter++;
    }
}