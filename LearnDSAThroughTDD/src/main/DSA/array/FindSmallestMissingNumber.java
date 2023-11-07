package main.DSA.array;

import java.util.List;

/*https://leetcode.com/problems/first-missing-positive
* Input: nums = [3,4,-1,1]
* Output: 2
 * */
public class FindSmallestMissingNumber {
    public static void main(String[] args) {
       // User user = new User("12", "Kartheek", "Gadduru", new Address("NKL", "MPL", "AP", "517325"), new PhoneNumbers(Arrays.asList("7702817", "7702-7-17-917")));
     /*   ArrayList<Emp> list = new ArrayList<>();
        list.add(new Emp(1));
        list.add(new Emp(1));
        System.out.println(list.size());
        System.out.println(list);*/
       /* Emp emp1 = new Emp(1);
        System.out.println(emp1.hashCode());
        Emp emp2 = new Emp(1);
        System.out.println(emp2.hashCode());
        HashMap<Emp, String> map = new HashMap<Emp, String>();
        map.put(emp1, "emp");
        map.put(emp2, "emp");
        System.out.println(map.size());*/

    /*    Employee
                employee=new Employee();

        employee.name="Name";

        List<Employee> st1=new ArrayList<>();

        st1.add(employee);
        st1.add(employee);
        System.out.println(st1.size()); //1

        for(int i=0;i<st1.size();i++){
            Employee em=st1.get(i);
            System.out.println(em.name);//SOP1
        }
        Employee em1=st1.get(0); // pass by value

        em1.name="name2";

        for(int i=0;i<st1.size();i++){
            Employee  em=st1.get(i);
            System.out.println(em.name);//SOP2
        }*/

       /* TestUser emp1 = new TestUser(1);
        TestUser emp2 = new TestUser(1);
        System.out.println(emp1 == emp2);
        System.out.println(emp1.equals(emp2));
*/


    }
}
/*class TestEmp {
   private int id;

    public TestEmp(int id) {
        this.id = id;
    }

    public String name ;*/
/*

    @Override
    public boolean equals(Object o) {
        System.out.println("is equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        return id == emp.id;
    }

    @Override
    public int hashCode() {
      //  System.out.println("is hashcode");
        return id;
    }
*/

/*    @Override
    public String toString() {

        return "Emp{" +
                "id=" + id +
                '}';
    }
}*/
class User{
    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private PhoneNumbers phoneNumbers;

    public User(String id, String firstName, String lastName, Address address, PhoneNumbers phoneNumbers) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + id + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}

class Address{
    private String streetName;
    private String city;
    private String sate;
    private String postCode;

    public Address(String streetName, String city, String sate, String postCode) {
        this.streetName = streetName;
        this.city = city;
        this.sate = sate;
        this.postCode = postCode;

    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", sate='" + sate + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
//
class PhoneNumbers{
    private List<String> phoneNumbers;

    public PhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "PhoneNumbers{" +
                "phoneNumbers=" + phoneNumbers +
                '}';
    }
}
