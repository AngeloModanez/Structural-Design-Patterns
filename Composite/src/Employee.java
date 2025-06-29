import java.util.ArrayList;
import java.util.List;

public class Employee {
  private String name;
  private String dept;
  private int salary;
  private List<Employee> subordinates = new ArrayList<>();

  public Employee() {
  }

  public Employee(String name, String dept, int salary) {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
  }

  public void add(Employee employee) {
    subordinates.add(employee);
  }

  public void remove(Employee employee) {
    subordinates.remove(employee);
  }

  public List<Employee> getSubordinates() {
    return subordinates;
  }

  @Override
  public String toString() {
    return toString(0);
  }

  private String toString(int level) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < level; i++) {
      builder.append("    ");
    }

    builder.append("- ")
        .append(name)
        .append(" (")
        .append(dept)
        .append(", R$ ")
        .append(salary)
        .append(")")
        .append("\n");

    for (Employee e : getSubordinates()) {
      builder.append(e.toString(level + 1));
    }

    return builder.toString();
  }

  public String getName() {
    return name;
  }

  public String getDept() {
    return dept;
  }

  public int getSalary() {
    return salary;
  }
}
