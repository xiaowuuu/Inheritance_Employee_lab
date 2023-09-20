package management;

import staff.Employee;

public class Manager extends Employee {
    public Manager(String name, String niNumber, int salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    private String deptName;

}
