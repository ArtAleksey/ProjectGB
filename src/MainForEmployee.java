public class MainForEmployee {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        emplArray[1] = new Employee("Nebotov Dmitriy", "Analitic", "nebotov@mail.ru", "89032562325", 45000, 27);
        emplArray[2] = new Employee("Dragunov Nikita", "Medic", "dragunov@mail.ru", "89039762325", 55000, 41);
        emplArray[3] = new Employee("Samsonov Pavel", "Driver", "samsonov@mail.ru", "89031232695", 145000, 47);
        emplArray[4] = new Employee("Vaflev Koni", "Baker", "vaflev@mail.ru", "89625874141", 122000, 57);

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getAge() > 40) {
                emplArray[i].printEmployeeInfo();
            }
        }
        

    }
}
