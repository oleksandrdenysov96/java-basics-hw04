public class Employee implements Payable {

  protected String name;
  protected String employeeId;

  public Employee(String employeeId, String name) {
    this.name = name;
    this.employeeId = employeeId;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return calculatePay();
  }

  @Override
  public String toString() {
    String format = "%.2f";
    return name + " " + employeeId + " " + (String.format(format, getAverageMonthlySalary()));
  }

  @Override
  public double calculatePay() {
    return 0;
  }
}
