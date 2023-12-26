public class Main {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        list.add(new Employee("Alice"));
        list.add(new Employee("Bob"));
        list.add(new Employee("Charlie"));

        // Iterate through the list to find "Bob"
        for (Employee employee : list) {
            if (employee.name.equals("Bob")) {
                System.out.println("Employee found: " + employee.name);
                break;
            }
        }
    }
}
