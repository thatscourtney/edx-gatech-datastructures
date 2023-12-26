import java.util.Iterator;
import java.util.NoSuchElementException;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
    // Additional employee details can be added here.
}

class Node {
    Employee employee;
    Node next;

    Node(Employee employee) {
        this.employee = employee;
        this.next = null;
    }
}

class EmployeeList implements Iterable<Employee> {
    Node head;

    public void add(Employee employee) {
        Node newNode = new Node(employee);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {
            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Employee next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Employee employee = current.employee;
                current = current.next;
                return employee;
            }
        };
    }
}
