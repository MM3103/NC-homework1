package homework.part1.employees;

import java.util.Objects;

public class Employee {

    private int id;
    private int salary;
    private String firstName;
    private String lastName;

    public Employee(int id,String firstName, String lastName,int salary) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent){
        return salary+(int)(salary/100*percent);
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ",name="+getName()+
                ", salary=" + salary +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Employee)) {
            return false;
        }

        Employee employee = (Employee) o;

        return  this.id == employee.id &&
                this.salary == employee.salary &&
                this.firstName.equals(employee.firstName) &&
                this.lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.id;
        result = 31 * result + this.firstName.hashCode();
        result = 31 * result + this.lastName.hashCode();
        result = 31 * result + this.salary;
        return result;
    }
}
