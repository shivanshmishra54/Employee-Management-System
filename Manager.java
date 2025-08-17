import java.util.*;

public class Manager {
    private List<Employee> empList;

    public Manager() {
        this.empList = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        empList.add(emp);
        System.out.println("Employee added successfully!");
    }

    public void updateAttendance(int id, String date, boolean isPresent) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            emp.addAttendance(date, isPresent);
            System.out.println("Attendance updated for " + emp.getName());
        } else {
            System.out.println("Employee not found");
        }
    }

    public void displayAllEmployee() {
        if (empList.isEmpty()) {
            System.out.println("No employee record found");
        } else {
            for (Employee emp : empList) {
                emp.displayDetails();
            }
        }
    }

    public Employee searchEmployee(int id) {
        for (Employee emp : empList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public void deleteEmployee(int id) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            empList.remove(emp);
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found");
        }
    }
}
