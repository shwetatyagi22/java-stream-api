public class Employee {
  private String name;
  private String address;
  private boolean isActive;

  public Employee() {
  }

  public Employee(String name, String address, boolean isActive) {
    this.name = name;
    this.address = address;
    this.isActive = isActive;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", isActive=" + isActive +
        '}';
  }

  public static Employee map(Person person){
    return new Employee(person.getName(), person.getAddress(), true);

  }
}
