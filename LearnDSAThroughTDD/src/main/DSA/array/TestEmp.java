package main.DSA.array;


public class TestEmp {
    private String id;
    private String name;
    private Integer depId;
    private Double salary;

    public TestEmp(String id, String name, Integer depId, Double salary) {

        this.id = id;
        this.name = name;
        this.depId = depId;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "TestEmp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", depId=" + depId +
                ", salary=" + salary +
                '}';
    }
}
