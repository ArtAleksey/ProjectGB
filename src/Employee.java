public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee (String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void printEmployeeInfo () {
        System.out.println("Имя сотрудника: " + fullName);
        System.out.println("Должность сотрудника: " + position);
        System.out.println("Email сотрудника: " + email);
        System.out.println("Телефон сотрудника: " + phone);
        System.out.println("Зарплата сотрудника: " + salary);
        System.out.println("Возраст сотрудника: " + age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}
