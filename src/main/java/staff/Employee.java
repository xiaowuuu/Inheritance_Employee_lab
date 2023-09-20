package staff;

public abstract class Employee {
    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String niNumber;
    private double salary;

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }



    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void raiseSalary(double amount){
        if (amount >= 0) {
            this.salary += amount;
        }
    }
    public double payBonus(){
        return this.salary * 0.01;
    }
}