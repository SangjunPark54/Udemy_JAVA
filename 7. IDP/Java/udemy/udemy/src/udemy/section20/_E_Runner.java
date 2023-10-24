package udemy.section20;

public class _E_Runner {
    public static void main(String[] args) {
        _E_Employee employee = new _E_Employee("sean","Manager");
        employee.setEmployer("SEAN");
        employee.setEmploeeGrade("3rd");
        employee.setTitle("Manager");
        employee.setSalary(1000);
        employee.setPhoneNumber("000-0000-000");

        System.out.println(employee);
    }
}
