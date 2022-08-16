import java.util.Objects;

public class Employee {
    private final String fio;

    private  int department;
    private  float salary;
    private final int id;
    private  static int idSequence;


    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++idSequence;
    }


    public String getFio() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException(" не верно указан отдел");
        }
        this.department = department;

    }

    public final void setSalary(float salary) {
        if (salary < 0) {
            throw new IllegalArgumentException(" не может быть меньше 0");
        }
        this.salary = salary;

    }

    @Override
    public  boolean  equals (Object fio) {
        if (this == fio) return true;
        if (fio == null || getClass() != fio.getClass()) return false;
        Employee employee = (Employee ) fio;
        return id == employee.id;
    }

    @Override
    public  int hashCode() {
        return Objects.hash(fio);


    }

    @Override
    public  String toString() {
        return
                " id=" + id +
                        " ФИО='" + fio + '\'' +
                        ", Отдел=" + department +
                        ", Зарплата=" + salary;
    }
}










