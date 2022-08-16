import static java.lang.Character.getName;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Молчанов Александр Максимович", 1, 45000);
        employees[1] = new Employee("Соколов Даниил Тимофеевич", 1, 48000);
        employees[2] = new Employee("Самойлова Полина Ивановна", 2, 52000);
        employees[3] = new Employee("Попова Лилия Давидовна", 2, 55000);
        employees[4] = new Employee("Федоров Андрей Адамович", 3, 32000);
        employees[5] = new Employee("Павлов Владимир Фёдорович", 3, 16000);
        employees[6] = new Employee("Нечаев Владислав Андреевич", 4, 58000);
        employees[7] = new Employee("Москвин Денис Евгеньевич", 4, 93000);
        employees[8] = new Employee("Аксенова Ксения Егоровна", 5, 17000);
        employees[9] = new Employee("Лебедев Георгий Романович", 5, 10000);
        printEmployee();
        double sum = sumEmployee();
        System.out.println("сумма затрат " + sum);
        minSalary();
        maxSalary();
        average();
    }

    public static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Имя сотрудников" + employees[i]);
        }
    }

    public static double sumEmployee() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }
    public static void minSalary() {
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() < min.getSalary()){
                min = employees[i];
            }
        }
        System.out.println("Минимальная зарплата " + min);
    }
    public static void maxSalary() {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() > max.getSalary()){
                max = employees[i];
            }
        }
        System.out.println("Максимальная зарплата " + max);
    }
    public static void average() {
        double sum = sumEmployee();
        double average = sum/employees.length;
        System.out.println("Среднее значение зарплат " + average);
    }
}

