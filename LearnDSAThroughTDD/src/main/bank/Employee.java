package main.bank;

public class Employee {
    public String name;
    public int amount;

    public Employee(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }




    @Override
    public boolean equals(Object o) {
        System.out.println("checking for hascode equals for an object "+ o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (amount != employee.amount) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode checkout  ");
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + amount;
        System.out.println("hashcode result  "+ result);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
